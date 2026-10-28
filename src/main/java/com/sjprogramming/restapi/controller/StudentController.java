// Specifies the package where this controller class belongs
package com.sjprogramming.restapi.controller;

// Imports the List interface to store multiple Student objects
import java.util.List;

// Imports the annotation used to mark this class as a REST controller
import org.springframework.web.bind.annotation.RestController;

// Imports the Student entity class that represents student data
import com.sjprogramming.restapi.entity.Student;

// Marks this class as a REST controller.
// Spring Boot automatically detects this class and registers it as a bean.
// Methods return data directly in the HTTP response, usually as JSON.
@RestController
public class StudentController {

    // Handles HTTP GET requests to the "/students" URL.
    // @GetMapping maps this method to the specified URL.
    @org.springframework.web.bind.annotation.GetMapping("/students")
    public List<Student> getAllStudents() {

        // Currently returns null, so no student list will be returned.
        // Later, this should call a service or repository to fetch
        // all students from the database.
        return null;
    }
}