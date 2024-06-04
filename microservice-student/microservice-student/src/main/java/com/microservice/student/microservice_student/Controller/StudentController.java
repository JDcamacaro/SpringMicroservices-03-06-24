package com.microservice.student.microservice_student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.student.microservice_student.Entities.Student;
import com.microservice.student.microservice_student.Service.IStudentSErvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/api/student")

public class StudentController {


    @Autowired
    private IStudentSErvice studentSErvice;

    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentSErvice.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent(){
        return ResponseEntity.ok(studentSErvice.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(Long id){
        return ResponseEntity.ok(studentSErvice.findById(id));
    }



    }