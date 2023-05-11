package com.bjit.exception.controller;

import com.bjit.exception.exception.AdminNotFoundException;
import com.bjit.exception.model.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/details/{id}")
    public ResponseEntity<Object> getAdminDetails(@PathVariable Integer id) throws AdminNotFoundException {
        if (id == 2000) {
            Admin admin = new Admin(2000, "Admin hossain", "HR");
            return new ResponseEntity<>(admin, HttpStatus.OK);
        } else {
            throw new AdminNotFoundException("Admin page is not found");
        }

    }
    @GetMapping("/otherMethod")
    public ResponseEntity<Object> getOtherDetails() throws ClassNotFoundException {
        throw new ClassNotFoundException("Admin Class not found");
    }
}
