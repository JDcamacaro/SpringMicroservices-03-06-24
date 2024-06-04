package com.microservice.course.microservice_course.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.course.microservice_course.DTO.StudentDTO;

@FeignClient(name = "msvc-student" , url = "localhost:8090/api/student")
public class StudentClient {

    @GetMapping("/search-my-course/{idCourse}")
    public List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse){
        return null;
    };
}
