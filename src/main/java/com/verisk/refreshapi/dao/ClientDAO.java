package com.verisk.refreshapi.dao;

import com.verisk.refreshapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDAO {

    @Autowired
    private ClientRepository clientRepository;

}
