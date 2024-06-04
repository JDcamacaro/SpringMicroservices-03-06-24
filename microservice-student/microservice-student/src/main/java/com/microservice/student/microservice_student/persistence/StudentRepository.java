package com.microservice.student.microservice_student.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.student.microservice_student.Entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

    @Query("SELECT s FROM Student s WHERE s.course_id = :idCourse")
    List<Student> findAllCourse(Long Course);

/*     List<Student> findAllByCourse(Long Course); */

}
