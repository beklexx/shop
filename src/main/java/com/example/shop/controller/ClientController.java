package com.example.shop.controller;

import com.example.shop.dto.ClientDTO;
import com.example.shop.exception.ClientNotFoundException;
import com.example.shop.model.Client;
import com.example.shop.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/clients")
    ArrayList<Client> getClients() {
        return clientService.getClients();
    }

    @PostMapping(value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    void addClient(@RequestBody ClientDTO clientDTO) {
        clientService.addClient(clientDTO);
    }

    @DeleteMapping(value = "/clients/{id}")
    void deleteClient(@PathVariable(value = "id") Long clientId) throws ClientNotFoundException {
        clientService.deleteClient(clientId);
    }

    @PutMapping(value = "/clients/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    void updateClient(@RequestBody ClientDTO clientDTO, @PathVariable(value = "id") Long clientId) throws ClientNotFoundException{
        clientService.updateClient(clientDTO, clientId);
    }


}
