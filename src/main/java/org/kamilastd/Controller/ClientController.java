package org.kamilastd.Controller;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.kamilastd.DTS.ClientDTS;
import org.kamilastd.Entity.ClientEntity;
import org.kamilastd.Services.ClientService;

import java.sql.SQLException;
import java.util.List;

//@WebServlet(urlPatterns = "/client")
public class ClientController extends HttpServlet {
    ClientService clientService;

    public List<ClientDTS> displayAllClients(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        return clientService.prepareListOfClientsDTS();
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws SQLException {
//        clientService.prepareListOfClientsDTS();
//    }

    public ClientDTS updateSingleClient(ClientDTS clientDTS) throws SQLException {
        ClientEntity client = clientService.updateClientDetails(clientDTS);
        return clientService.prepareDataForClientDTS(client);
    }

    public void deleteSingleClient(ClientDTS clientDTS) throws SQLException {
        clientService.deleteClient(clientDTS);
    }
}
