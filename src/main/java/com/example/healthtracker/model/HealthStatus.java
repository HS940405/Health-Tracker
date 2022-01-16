package com.example.healthtracker.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.scheduling.quartz.LocalDataSourceJobStore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "health_status_table")

public class HealthStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(unique = true)
    private int weight;
    private int heartRate;
    private boolean cough;
    private boolean headache;
    private boolean stomachache;
    private boolean nausea;
    private int stressLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @CreatedDate
    private Date createDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthStatus that = (HealthStatus) o;
        return id == that.id && weight == that.weight && heartRate == that.heartRate && cough == that.cough && headache == that.headache && stomachache == that.stomachache && nausea == that.nausea && stressLevel == that.stressLevel && Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, heartRate, cough, headache, stomachache, nausea, stressLevel, createDate);
    }

    @Override
    public String toString() {
        return "HealthStatus{" +
                "id=" + id +
                ", weight=" + weight +
                ", heartRate=" + heartRate +
                ", cough=" + cough +
                ", headache=" + headache +
                ", stomachache=" + stomachache +
                ", nausea=" + nausea +
                ", stressLevel=" + stressLevel +
                ", createDate=" + createDate +
                '}';
    }
}

