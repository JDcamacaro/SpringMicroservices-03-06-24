package com.microservice.student.microservice_student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.student.microservice_student.Entities.Student;
import com.microservice.student.microservice_student.persistence.StudentRepository;

public class ImpStudentService implements IStudentSErvice {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
        }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
        }

    @Override
    public void save(Student student) {
    studentRepository.save(student);
    }

    @Override
    public List<Student> finfByIdCourse(Long idCourse) {
        return studentRepository.findAllCourse(idCourse);
        }

}
