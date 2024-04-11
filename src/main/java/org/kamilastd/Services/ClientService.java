package org.kamilastd.Services;

import org.kamilastd.Controller.SessionsController;
import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Entity.ClientEntity;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    ClientDao clientDao;
    ClientEntity clientEntity;

    public ClientEntity createNewClient(String firstName, String lastName, String email, Long phoneNumber) {
        Long newClientId = clientDao.findClientWithHighestId();
        return new ClientEntity(newClientId, firstName, lastName, email, phoneNumber);
    }

    public List<ClientEntity> getAllClients(ClientEntity clientEntity) {
       List<ClientEntity> allClients = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            allClients.add(clientEntity);
        }
        return allClients;
    }

    public void getClientById(long id) {
        if (id==0){
            throw new NullPointerException();
        }else if (id==clientEntity.id()){
            System.out.println(clientEntity);
        }
    }

    public void getClientByLastName(String lastName) {
        if (lastName==null){
            throw new NullPointerException();
        }else if (lastName.equals(clientEntity.lastName())){
            System.out.println(clientEntity);
        }
    }

    //czy w client entyti dodac equals ?

}
