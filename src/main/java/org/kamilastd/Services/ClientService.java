package org.kamilastd.Services;

import org.kamilastd.Controller.SessionsController;
import org.kamilastd.DTS.ClientDTS;
import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Dao.SessionDao;
import org.kamilastd.Entity.ClientEntity;
import org.kamilastd.Entity.PhotoSessionEntity;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    ClientDao clientDao;
    ClientEntity clientEntity;

    public List<ClientEntity> getAllClientsFromDatabase() {
        // do dao idziesz
        // robisz sql query
        // zwracasz calą liste albo np tylko przyszle
        return new ArrayList<ClientEntity>();
    }

    public ClientDTS prepareDataForClientDTS(ClientEntity clientEntity){

        ClientDTS clientDTS = new ClientDTS();
        clientDTS.setId(clientEntity.id());
        clientDTS.setFirstName(clientEntity.firstName());
        clientDTS.setLastName(clientEntity.lastName());
        clientDTS.setPhoneNumber(clientEntity.phoneNumber());
        clientDTS.setEmail(clientEntity.email());
        return clientDTS;
    }

    public List<ClientDTS> prepareListOfClientsDTS(){
        List<ClientEntity> list = getAllClientsFromDatabase();
        return list.stream().map(this::prepareDataForClientDTS).sorted().toList();
    }

    public ClientEntity createNewClient(String firstName, String lastName, String email, Long phoneNumber) {
        Long newClientId = clientDao.findClientWithHighestId() + 1;
        return new ClientEntity(newClientId, firstName, lastName, email, phoneNumber);
    }

    public void updateClientDetails(ClientEntity clientEntity){
        prepareDataForClientDTS(clientEntity);
    }

    public ClientDTS prepareListChangesOfClientDTS(ClientEntity clientEntity){
        clientDao.updateClientWhereId(clientEntity);
        return prepareDataForClientDTS(clientEntity);
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
