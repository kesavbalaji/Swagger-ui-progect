package com.training.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer_info")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public int id;

    @Column (name = "address")
    public String address;

    @Column (name = "city")
    public String city;

    @Column (name = "country")
    public String country;

    @Column (name = "postal_code")
    public String postal_code;

    @Column (name = "state")
    public String state;

}
