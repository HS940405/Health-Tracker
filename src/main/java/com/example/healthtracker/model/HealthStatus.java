package com.example.healthtracker.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.history.RevisionMetadata;
import org.springframework.scheduling.quartz.LocalDataSourceJobStore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;


@Entity
@Audited //for history
//for joining two data tables (User, HealthStatus) into one
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "health_status_table")

public class HealthStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @ManyToOne //for history
    @JoinColumn (unique = true) //for history @Column
    private int weight;
    private int heartRate;
    private boolean cough;
    private boolean headache;
    private boolean stomachache;
    private boolean nausea;
    private int stressLevel;

    @JoinColumn (unique = true) //for history
    @CreatedDate
    private Date createDate;

    @Transient  //for history
    private RevisionMetadata<Integer> editVersion; //for history

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isStomachache() {
        return stomachache;
    }

    public void setStomachache(boolean stomachache) {
        this.stomachache = stomachache;
    }

    public boolean isNausea() {
        return nausea;
    }

    public void setNausea(boolean nausea) {
        this.nausea = nausea;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

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

