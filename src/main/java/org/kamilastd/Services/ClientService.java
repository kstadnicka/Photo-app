package org.kamilastd.Services;

import org.kamilastd.Controller.SessionsController;
import org.kamilastd.DTS.ClientDTS;
import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Dao.SessionDao;
import org.kamilastd.Entity.ClientEntity;
import org.kamilastd.Entity.PhotoSessionEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    ClientDao clientDao;
    ClientEntity clientEntity;

    public List<ClientEntity> getAllClientsFromDatabase() throws SQLException {
       return clientDao.getAllClients();
    }

    public ClientDTS prepareDataForClientDTS(ClientEntity clientEntity){

        ClientDTS clientDTS = new ClientDTS();
        clientDTS.setId(clientEntity.getId());
        clientDTS.setFirstName(clientEntity.getFirstName());
        clientDTS.setLastName(clientEntity.getLastName());
        clientDTS.setPhoneNumber(clientEntity.getPhoneNumber());
        clientDTS.setEmail(clientEntity.getEmail());
        return clientDTS;
    }

    public List<ClientDTS> prepareListOfClientsDTS() throws SQLException {
        List<ClientEntity> list = getAllClientsFromDatabase();
        return list.stream().map(this::prepareDataForClientDTS).sorted().toList();
    }

    public ClientEntity createNewClient(ClientDTS clientDTS) throws SQLException {
        ClientEntity client = prepareDataForClientEntity(clientDTS);
        return clientDao.saveNewClient(client);
    }

    public ClientEntity updateClientDetails(ClientDTS clientDTS) throws SQLException {
        ClientEntity client = prepareDataForClientEntity(clientDTS);
        return clientDao.updateClientWhereId(client);
    }

    private ClientEntity prepareDataForClientEntity(ClientDTS clientDTS) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstName(clientDTS.getFirstName());
        clientEntity.setLastName(clientDTS.getLastName());
        clientEntity.setPhoneNumber(clientDTS.getPhoneNumber());
        clientEntity.setEmail(clientDTS.getEmail());
        clientEntity.setId(clientDTS.getId());
        return clientEntity;
    }

    public ClientDTS prepareListChangesOfClientDTS(ClientEntity clientEntity) throws SQLException {
        clientEntity = clientDao.updateClientWhereId(clientEntity);
        return prepareDataForClientDTS(clientEntity);
    }


    public void deleteClient(ClientDTS clientDTS) throws SQLException {
        clientDao.deleteClient(clientDTS.getId());
    }
}
