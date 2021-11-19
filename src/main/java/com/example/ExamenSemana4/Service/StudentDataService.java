package com.example.ExamenSemana4.Service;

import com.example.ExamenSemana4.entity.Student;
import com.example.ExamenSemana4.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentDataService {

    @Autowired
    private StudentDataRepository studentDataRepository;

    //Student Services
    public void addStudent(Student student){
        studentDataRepository.createStudent(student);
    }

    public List<Student> getStudents(){
        return studentDataRepository.getStudents();
    }

    public Optional<Student> getStudentsByDni(Integer dni) {
        return studentDataRepository.getStudentsByDni(dni);
    }

    public Student updateStudent(Integer dni, Student student) {
        return studentDataRepository.updateStudent(dni, student);
    }

    public void deleteStudent(Integer dni) {
        studentDataRepository.deleteStudent(dni);
    }
}
