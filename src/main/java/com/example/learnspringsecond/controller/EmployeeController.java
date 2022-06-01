package com.example.learnspringsecond.controller;

import com.example.learnspringsecond.data.model.Employee;
import com.example.learnspringsecond.data.payload.request.EmployeeRequest;
import com.example.learnspringsecond.data.payload.response.MessageResponse;
import com.example.learnspringsecond.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployee();

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addEmployee(@RequestBody EmployeeRequest request) {
        MessageResponse messageResponse = employeeService.createEmployee(request);

        return new ResponseEntity<>(messageResponse, HttpStatus.OK);
    }
}
