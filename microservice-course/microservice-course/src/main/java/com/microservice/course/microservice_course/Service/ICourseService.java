package com.microservice.course.microservice_course.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.course.microservice_course.Entities.Course;
import com.microservice.course.microservice_course.http.Response.StudentByCourseResponse;

@Service
public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findByIdCourse(Long idCourse);


}