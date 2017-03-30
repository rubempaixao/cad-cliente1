package com.rpxIT.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpxIT.clientes.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
