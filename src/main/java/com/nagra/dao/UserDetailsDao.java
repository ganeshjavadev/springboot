package com.nagra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagra.model.UserDetails;

public interface UserDetailsDao extends JpaRepository<UserDetails, Integer> {

}
