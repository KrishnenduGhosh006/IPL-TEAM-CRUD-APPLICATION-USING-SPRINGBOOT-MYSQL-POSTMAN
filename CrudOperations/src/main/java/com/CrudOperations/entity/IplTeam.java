package com.CrudOperations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "iplteams")
public class IplTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int trophies;
    private String captainName;

    // ✅ Required by JPA (Hibernate uses this)
    public IplTeam() {
    }

    // Optional parameterized constructor (for convenience)
    public IplTeam(int id, String name, int trophies, String captainName) {
        this.id = id;
        this.name = name;
        this.trophies = trophies;
        this.captainName = captainName;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }
}
