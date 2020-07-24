package com.nagra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagra.model.Veichal;

public interface Veichaldao extends JpaRepository<Veichal, Integer> {

}
