package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Dont think API mapping here follows convention

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/studentByLastName/{lastName}")
    public Student findStudentByLastName(@PathVariable String lastName) {
        return service.getStudentByLastName(lastName);
    }

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
