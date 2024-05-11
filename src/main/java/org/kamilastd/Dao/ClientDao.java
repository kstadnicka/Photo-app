package org.kamilastd.Dao;

import org.kamilastd.Entity.ClientEntity;

import java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    Connection connection;
    DatabaseConnection databaseConnection;

    public ClientDao(Connection connection) {
        databaseConnection = new DatabaseConnection();
        this.connection = databaseConnection.getConnection();
    }

    public int createNewClient() throws SQLException {
        String query = "insert into client (firstName,lastName,email,phoneNumber) values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,"Kasia");
        statement.setString(2,"Stadnicka");
        statement.setString(3,"kamila@gmail.com");
        statement.setString(4,"123456789");

        int rowInserted = statement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("Successfully inserted new client");
        }
        return rowInserted;
    }


    private void mapClient(ResultSet resultSet, ClientEntity client) throws SQLException {
        client.setId(resultSet.getLong("id"));
        client.setFirstName(resultSet.getString("firstName"));
        client.setLastName(resultSet.getString("lastName"));
        client.setEmail(resultSet.getString("email"));
        String phoneNumber = resultSet.getString("phoneNumber");
        client.setPhoneNumber(Long.parseLong(phoneNumber));
    }

    public ClientEntity updateClientWhereId(ClientEntity clientEntity) throws SQLException {
        String query = "UPDATE clinet SET firstName = ?, lastName = ?, email = ?, phoneNumber = ? WHERE id = ?";
        PreparedStatement statement = getPreparedStatement(clientEntity, query);
        int rowUpdated = statement.executeUpdate();
        if (rowUpdated > 0) {
            System.out.println("Successfully updated client with id " + clientEntity.getId());
        }
        return clientEntity;
    }


    public List<ClientEntity> getAllClients() throws SQLException {
        String query = "SELECT * FROM client";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);
        List<ClientEntity> list = new ArrayList<ClientEntity>();
        while (resultSet.next()){
            ClientEntity client = new ClientEntity();
            mapClient(resultSet, client);
            list.add(client);
        }
        return list;
    }

    public void deleteClient(Long id) throws SQLException {
        String query = "DELETE FROM client WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1, id);
        int rowDeleted = statement.executeUpdate();
        if (rowDeleted > 0) {
            System.out.println("Successfully deleted client with id " + id);
        }
    }

    public ClientEntity getClientById(Long id) throws SQLException {
        String query = "SELECT * FROM client WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery(query);
        ClientEntity client = new ClientEntity();
        while (resultSet.next()) {
            mapClient(resultSet, client);
        }
        return client;
    }

    public ClientEntity saveNewClient(ClientEntity clientEntity) throws SQLException {
        String query = "UPDATE client SET firstName = ?, lastName = ?, email = ?, phoneNumber = ? WHERE id = ?";
        PreparedStatement statement = getPreparedStatement(clientEntity, query);
        int rowUpdated = statement.executeUpdate();
        if (rowUpdated > 0) {
            System.out.println("Successfully updated client with id " + clientEntity.getId());
        }
        return clientEntity;
    }

    private PreparedStatement getPreparedStatement(ClientEntity clientEntity, String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, clientEntity.getFirstName());
        statement.setString(2, clientEntity.getLastName());
        statement.setString(3, clientEntity.getEmail());
        statement.setLong(4, clientEntity.getId());
        return statement;
    }

}
