package com.bjit.exception.controller;

import com.bjit.exception.exception.StudentNotFoundException;
import com.bjit.exception.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/details/{id}")
    public ResponseEntity<Object> getStudentDetails(@PathVariable Integer id) throws StudentNotFoundException {
        if (id == 1000) {
            Student student = new Student(1000, "jubayer", "10", "group");
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        throw new StudentNotFoundException("Student data are not be found");
    }
    @GetMapping("/otherMethod")
    public ResponseEntity<Object> getOtherDetails() throws ClassNotFoundException {
            throw new ClassNotFoundException("Student Class not found");
    }
}