package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Content.class)
    @JoinColumn(name = "content_id")
    private List<Content> contentList;

    public Course() {
    }

    public Course(String name, List<Content> contentList) {
        this.name = name;
        this.contentList = contentList;
    }

    public Course(List<Content> contentList) {
        this.contentList = contentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", contentList=" + contentList +
                '}';
    }
}
