package com.example.ExamenSemana4.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "topics")
public class Topic extends Content{

    public Integer getDuration(){
        return 0;
    }
}
