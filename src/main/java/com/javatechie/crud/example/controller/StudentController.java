package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

/*     @GetMapping("/product/{first_name}")
    public Student findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    } */

/*     @PutMapping("/update")
    public Student updateProduct(@RequestBody Student product) {
        return service.updateProduct(product);
    }
 */
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
