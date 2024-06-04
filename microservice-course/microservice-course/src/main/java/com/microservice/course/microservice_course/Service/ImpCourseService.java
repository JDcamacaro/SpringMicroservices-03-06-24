package com.microservice.course.microservice_course.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.course.microservice_course.Client.StudentClient;
import com.microservice.course.microservice_course.DTO.StudentDTO;
import com.microservice.course.microservice_course.Entities.Course;
import com.microservice.course.microservice_course.http.Response.StudentByCourseResponse;
import com.microservice.course.microservice_course.persintent.CourseRepository;


public class ImpCourseService implements ICourseService {


    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentClient studentClient;

    

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

@Override
public StudentByCourseResponse findByIdCourse(Long idCourse) {
    Course course = courseRepository.findById(idCourse).orElse(new Course());
    List<StudentDTO> studentDTOlist = studentClient.findAllStudentByCourse(idCourse);
return StudentByCourseResponse.builder()
.courseName(course.getCourse())
.teacher(course.getTeacher())
.studentDTOList (studentDTOlist)
.build();
}

}
