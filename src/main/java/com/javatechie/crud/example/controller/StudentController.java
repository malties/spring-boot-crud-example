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

    @PostMapping("/addProduct")
    public Student addProduct(@RequestBody Student product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Student> addProducts(@RequestBody List<Student> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Student> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Student findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Student findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Student updateProduct(@RequestBody Student product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
