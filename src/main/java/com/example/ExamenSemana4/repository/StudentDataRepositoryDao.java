package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDataRepositoryDao extends CrudRepository<Student, Integer> {
}
