package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}

