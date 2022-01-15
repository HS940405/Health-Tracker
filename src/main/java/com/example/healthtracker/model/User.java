package com.example.healthtracker.model;

import java.sql.Timestamp;

import lombok.Data;

@SuppressWarnings("FieldCanBeLocal")

public class User {

    private String id;
    private String name;
    private String password;
//    private int weight;
//    private int heartRate;
//    private boolean cough;
//    private boolean headache;
//    private boolean stomachache;
//    private boolean nausea;
//    private int stressLevel;

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}