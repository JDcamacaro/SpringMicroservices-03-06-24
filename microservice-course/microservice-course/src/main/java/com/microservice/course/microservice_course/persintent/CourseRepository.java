package com.microservice.course.microservice_course.persintent;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservice.course.microservice_course.Entities.Course;

@Repository

public interface CourseRepository extends CrudRepository<Course, Long> {

}
