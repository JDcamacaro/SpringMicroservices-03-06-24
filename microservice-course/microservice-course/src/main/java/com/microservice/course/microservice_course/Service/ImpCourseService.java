package com.microservice.course.microservice_course.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.microservice.course.microservice_course.Entities.Course;
import com.microservice.course.microservice_course.persintent.CourseRepository;


public class ImpCourseService implements ICourseService {


    @Autowired
    private CourseRepository courseRepository;

    

@Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
        }

@Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
        }

@Override
    public void save(Course course) {
        courseRepository.save(course);
    }


}
