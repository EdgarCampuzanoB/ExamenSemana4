package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;
    private String name;
    private  String lastName;
    private String address;
    private String email;

    @OneToMany(targetEntity = Proceeding.class)
    @Column(name = "proceeding")
    private List<Proceeding> proceedingList;

    public Student() {
    }

    public Student(String name, String lastName, String address, String email, List<Proceeding> proceedingList) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.proceedingList = proceedingList;
    }

    public Integer getId() {
        return dni;
    }

    public void setId(Integer id) {
        this.dni = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Proceeding> getProceedingList() {
        return proceedingList;
    }

    public void setProceedingList(List<Proceeding> proceedingList) {
        this.proceedingList = proceedingList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", proceedingList=" + proceedingList +
                '}';
    }
}
