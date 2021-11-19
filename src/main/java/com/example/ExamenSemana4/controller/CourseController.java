package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Course;
import com.example.ExamenSemana4.entity.Student;
import com.example.ExamenSemana4.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getStudents(){
        return courseRepository.getCourses();
    }

    @PostMapping("/newCourse")
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        courseRepository.addCourse(course);
        return ResponseEntity.ok(course);
    }

    @GetMapping("/findCourse/{id}")
    public Optional<Course> findStudentByDni(@PathVariable ("id") Integer id){
        return courseRepository.getCourseByDni(id);
    }

    @PutMapping("/updateCurse/{id}")
    public ResponseEntity<Course> updateStudent(@RequestBody Course course, @PathVariable ("id") Integer id){
        Course updateCourse = courseRepository.updateCourse(id, course);
        if(updateCourse == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(updateCourse);
        }
    }

    @DeleteMapping("/deleteCourse/{id}")
    public ResponseEntity<Object> deleteCourse(@PathVariable ("dni") Integer id){
        courseRepository.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
