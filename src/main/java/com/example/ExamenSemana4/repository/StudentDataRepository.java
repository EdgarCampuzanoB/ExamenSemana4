package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDataRepository {

    @Autowired
    StudentDataRepositoryDao studentDataRepositoryDao;

    public void createStudent(Student student){
        studentDataRepositoryDao.save(student);
    }

    public List<Student> getStudents(){
        return (List<Student>) studentDataRepositoryDao.findAll();
    }

    public Optional<Student> getStudentsByDni(Integer dni) {
        return studentDataRepositoryDao.findById(dni);

    }

    public Student updateStudent(Integer dni, Student student) {
         studentDataRepositoryDao.deleteById(dni);
         return studentDataRepositoryDao.save(student);
    }

    public void deleteStudent(Integer dni) {
        studentDataRepositoryDao.deleteById(dni);
    }
}
