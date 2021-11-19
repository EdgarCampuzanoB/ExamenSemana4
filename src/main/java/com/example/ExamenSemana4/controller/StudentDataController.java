package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.Service.StudentDataService;
import com.example.ExamenSemana4.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentDataController {

    @Autowired
    private final StudentDataService studentDataService;

    public StudentDataController(StudentDataService studentDataService) {
        this.studentDataService = studentDataService;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentDataService.getStudents();
    }

    @PostMapping("/newStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        studentDataService.addStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/findStudent/{dni}")
    public Optional<Student> findStudentByDni(@PathVariable ("dni") Integer dni){
        return studentDataService.getStudentsByDni(dni);
    }

    @PutMapping("/updateStudent/{dni}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable ("dni") Integer dni){
        Student updateStudent = studentDataService.updateStudent(dni, student);
        if(updateStudent == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(updateStudent);
        }
    }

    @DeleteMapping("/deleteStudent/{dni}")
    public ResponseEntity<Object> deleteStudent(@PathVariable ("dni") Integer dni){
        studentDataService.deleteStudent(dni);
        return ResponseEntity.noContent().build();
    }
}
