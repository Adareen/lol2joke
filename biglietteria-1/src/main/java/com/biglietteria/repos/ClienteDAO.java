package com.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biglietteria.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
