package com.example.daos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entidades.Pessoa;

@Repository
public interface ProdutosRepository<T, ID extends Serializable> extends JpaRepository<Pessoa, Long> {

}