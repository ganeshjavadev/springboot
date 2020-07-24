package com.nagra.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nagra.dao.UserDetailsDao;
import com.nagra.dao.Veichaldao;
import com.nagra.model.UserDetails;
import com.nagra.model.Veichal;

@Component
public class UserVechialService implements CommandLineRunner {
    @Autowired
    private UserDetailsDao userDetailsDao;
    @Autowired
    private Veichaldao veichaldao;
    @Override
    public void run(String... args) throws Exception {
        Veichal veichal1=new Veichal();
        veichal1.setVid(1);
        veichal1.setVName("HONDA");

        Veichal veichal2=new Veichal();
        veichal2.setVid(2);
        veichal2.setVName("BMW");
        veichaldao.saveAll(Arrays.asList(veichal1,veichal2));

        UserDetails userDetails=new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("ganesh");
        userDetails.setUserAddress("Bangalore");
        userDetails.setVeichals(Arrays.asList(veichal1,veichal2));
        userDetailsDao.save(userDetails);



    }

}
