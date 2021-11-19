package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Table(name = "Module")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Module extends Content{

    @OneToMany(targetEntity = Content.class)
    @Column(name = "contents")
    private List<Content> contentList;

    public Integer getDuration(){
        return 0;
    }


}
