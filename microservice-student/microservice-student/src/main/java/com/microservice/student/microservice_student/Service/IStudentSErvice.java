package com.microservice.student.microservice_student.Service;

import java.util.List;
import com.microservice.student.microservice_student.Entities.Student;


public interface IStudentSErvice {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> finfByIdCourse(Long idCourse);

}
