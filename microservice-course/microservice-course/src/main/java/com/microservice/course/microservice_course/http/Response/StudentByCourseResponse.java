package com.microservice.course.microservice_course.http.Response;

import java.util.List;

import com.microservice.course.microservice_course.DTO.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;

}
