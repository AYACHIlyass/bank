package com.hps.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
    @Id
    private Long id;
    private String name;
    private String city;
    private String address;
    private Long turnover;

    public Bank() {
    }

    public Bank(Long id, String name, String city, String address, Long turnover) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.turnover = turnover;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getTurnover() {
        return turnover;
    }

    public void setTurnover(Long turnover) {
        this.turnover = turnover;
    }

    @Override
    public String toString() {
        return "bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", turnover=" + turnover +
                '}';
    }
}
