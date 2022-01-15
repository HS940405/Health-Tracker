package com.example.healthtracker.model;

import java.util.UUID;

import java.sql.Timestamp;

import lombok.Data;

public class User {

    private final UUID id;
    private final String name;
    private String password;
    private int weight;
    private int heartRate;
    private boolean cough;
    private boolean headache;
    private boolean stomachache;
    private boolean nausea;
    private int stressLevel;

    public User(UUID id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.weight = weight;
        this.heartRate = heartRate;
    }

}
