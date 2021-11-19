/* package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "StudentsData")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemStudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "content")
    private List<Content> contentList;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "student")
    private List<Student> studentList;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "course")
    private List<Course> courseList;

    public SystemStudentData() {
    }

    public SystemStudentData(List<Content> contentList, List<Student> studentList, List<Course> courseList) {
        this.contentList = contentList;
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "SystemStudentData{" +
                "id=" + id +
                ", contentList=" + contentList +
                ", studentList=" + studentList +
                ", courseList=" + courseList +
                '}';
    }
}
*/