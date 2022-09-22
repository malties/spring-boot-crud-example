package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveProduct(Student product) {
        return repository.save(product);
    }

    public List<Student> saveProducts(List<Student> products) {
        return repository.saveAll(products);
    }

    public List<Student> getProducts() {
        return repository.findAll();
    }

    public Student getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Student updateProduct(Student product) {
        Student existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
