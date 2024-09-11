package com.codinglynx.sutt.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GeneratedValue;

@Entity
@Data
public class ApplicationProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;
    
}
