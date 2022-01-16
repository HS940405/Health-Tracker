package com.example.healthtracker.model;

import java.sql.Timestamp;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "users_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true)
    private String login;
    private String name;
    private String password;
    private int[] weight;
    private int[] heartRate;
    private boolean[] cough;
    private boolean[] headache;
    private boolean[] stomachache;
    private boolean[] nausea;
    private int[] stressLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public int[] getWeight() {
        return weight;
    }

    public void setWeight(int[] weight) {
        this.weight = weight;
    }

    public int[] getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int[] heartRate) {
        this.heartRate = heartRate;
    }

    public boolean[] getCough() {
        return cough;
    }

    public void setCough(boolean[] cough) {
        this.cough = cough;
    }

    public boolean[] getHeadache() {
        return headache;
    }

    public void setHeadache(boolean[] headache) {
        this.headache = headache;
    }

    public boolean[] getStomachache() {
        return stomachache;
    }

    public void setStomachache(boolean[] stomachache) {
        this.stomachache = stomachache;
    }

    public boolean[] getNausea() {
        return nausea;
    }

    public void setNausea(boolean[] nausea) {
        this.nausea = nausea;
    }

    public int[] getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int[] stressLevel) {
        this.stressLevel = stressLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(login, user.login) && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Arrays.equals(weight, user.weight) && Arrays.equals(heartRate, user.heartRate) && Arrays.equals(cough, user.cough) && Arrays.equals(headache, user.headache) && Arrays.equals(stomachache, user.stomachache) && Arrays.equals(nausea, user.nausea) && Arrays.equals(stressLevel, user.stressLevel);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, login, name, password);
        result = 31 * result + Arrays.hashCode(weight);
        result = 31 * result + Arrays.hashCode(heartRate);
        result = 31 * result + Arrays.hashCode(cough);
        result = 31 * result + Arrays.hashCode(headache);
        result = 31 * result + Arrays.hashCode(stomachache);
        result = 31 * result + Arrays.hashCode(nausea);
        result = 31 * result + Arrays.hashCode(stressLevel);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + Arrays.toString(weight) +
                ", heartRate=" + Arrays.toString(heartRate) +
                ", cough=" + Arrays.toString(cough) +
                ", headache=" + Arrays.toString(headache) +
                ", stomachache=" + Arrays.toString(stomachache) +
                ", nausea=" + Arrays.toString(nausea) +
                ", stressLevel=" + Arrays.toString(stressLevel) +
                '}';
    }
}
