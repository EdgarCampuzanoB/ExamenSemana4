package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepository {

    @Autowired
    CourseRepositoryDao courseRepositoryDao;

    public List<Course> getCourses() {
        return (List<Course>) courseRepositoryDao.findAll();
    }

    public void addCourse(Course course) {
        courseRepositoryDao.save(course);
    }

    public Optional<Course> getCourseByDni(Integer id) {
        return courseRepositoryDao.findById(id);
    }

    public Course updateCourse(Integer id, Course course) {
         courseRepositoryDao.deleteById(id);
        return courseRepositoryDao.save(course);

    }

    public void deleteCourse(Integer id) {
        courseRepositoryDao.deleteById(id);
    }
}
