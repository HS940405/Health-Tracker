package com.example.healthtracker.model;

import java.sql.Timestamp;

import lombok.Data;

@SuppressWarnings("FieldCanBeLocal")

public class User {

    private final String id;
    private final String name;
    private final String password;
    private int weight;
    private int heartRate;
    private boolean cough;
    private boolean headache;
    private boolean stomachache;
    private boolean nausea;
    private int stressLevel;

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


}
