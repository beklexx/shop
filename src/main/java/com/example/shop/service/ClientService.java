package com.example.shop.service;

import com.example.shop.dto.ClientDTO;
import com.example.shop.model.Client;
import com.example.shop.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    @Autowired
    ClientRepo clientRepo;
    public ArrayList<Client> getClients(){
        return (ArrayList<Client>) clientRepo.findAll();
    }
    public void addClient(ClientDTO clientDTO){
        Client client = new Client();
        client.setName(clientDTO.getName());
        clientRepo.save(client);
    }
}
