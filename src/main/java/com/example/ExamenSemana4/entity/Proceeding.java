package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name  = "proceedings")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Proceeding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date enrollDate;
    private Integer qualification;
    private Date endDate;
    @OneToOne(targetEntity = Course.class)
    private Course course;

    public Proceeding() {
    }

    public Proceeding(Date enrollDate, Integer qualification, Date endDate, Course course) {
        this.enrollDate = enrollDate;
        this.qualification = qualification;
        this.endDate = endDate;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Proceeding{" +
                "id=" + id +
                ", enrollDate=" + enrollDate +
                ", qualification=" + qualification +
                ", endDate=" + endDate +
                ", course=" + course +
                '}';
    }
}
