package com.nagra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Veichal {

    @Id
    private int vid;
    private String vName;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable =true)
    private UserDetails userDetails;

}
