package org.kamilastd;


import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Dao.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello World!");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getConnection();
        ClientDao clientDao = new ClientDao(conn);
        clientDao.createNewClient();
        System.out.println("Done!");


    }
}
