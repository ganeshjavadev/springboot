package com.nagra.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class UserDetails {

    @Id
    private int userId;
    private String userName;
    private String userAddress;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="user_vech", joinColumns =@JoinColumn(name = "v_id"),inverseJoinColumns =@JoinColumn(name ="user_id")  )
    //@OneToMany(mappedBy = "userDetails", fetch = FetchType.LAZY)
    private List<Veichal> veichals;


}
