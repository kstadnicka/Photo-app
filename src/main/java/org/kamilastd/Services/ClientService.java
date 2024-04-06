package org.kamilastd.Services;

import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Entity.ClientEntity;

public class ClientService {

    ClientDao clientDao;

    public ClientEntity createNewClient(String firstName, String lastName, String email, Long phoneNumber){
        clientDao = new ClientDao();
        Long newClientId = clientDao.findClientWithHighestId();
        return new ClientEntity(newClientId, firstName, lastName, email, phoneNumber);
    }
}
