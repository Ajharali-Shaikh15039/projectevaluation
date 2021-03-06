package com.mastek.Pizzania.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastek.Pizzania.model.Pizzania;

@Repository
public interface PizzaniaDao extends JpaRepository<Pizzania, Integer>{

}