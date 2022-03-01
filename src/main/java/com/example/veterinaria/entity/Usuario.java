package com.example.veterinaria.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable=false)
    private String first_name;

    @Column(nullable=false)
    private String last_name;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private int document;

    private Date birth_date;
}
