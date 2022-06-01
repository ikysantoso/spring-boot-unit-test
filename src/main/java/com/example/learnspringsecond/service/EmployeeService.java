package com.example.learnspringsecond.service;

import com.example.learnspringsecond.data.model.Employee;
import com.example.learnspringsecond.data.payload.request.EmployeeRequest;
import com.example.learnspringsecond.data.payload.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {
    MessageResponse createEmployee(EmployeeRequest employeeRequest);
    List<Employee> getAllEmployee();
}
