package org.kamilastd.Controller;

import org.kamilastd.DTS.ClientDTS;
import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.ClientEntity;
import org.kamilastd.Entity.PhotoSessionEntity;
import org.kamilastd.Services.ClientService;
import org.kamilastd.Services.PhotoSessionService;

import java.util.List;

public class ClientController {
    ClientService clientService;

    public List<ClientDTS> displayAllClients(){
        return clientService.prepareListOfClientsDTS();
    }

    public ClientDTS displaySingleClientToUpdate(ClientEntity clientEntity){
        clientService.updateClientDetails(clientEntity);
        return clientService.prepareListChangesOfClientDTS(clientEntity);
    }
}
