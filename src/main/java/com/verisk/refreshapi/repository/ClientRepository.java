package com.verisk.refreshapi.repository;

import com.verisk.refreshapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
