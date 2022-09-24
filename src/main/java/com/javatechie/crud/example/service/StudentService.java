package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//No error handling which is a big yikes 

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    public Student getStudentById(int id){
        return repository.findById(id);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "student" + id +" removed! " ;
    }

     public Student updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getFirstName());
        existingStudent.setAge(student.getAge());
        existingStudent.setSubject(student.getSubject());
        return repository.save(existingStudent);
    }
 

}
