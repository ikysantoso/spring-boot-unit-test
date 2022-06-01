package com.example.learnspringsecond;

import com.example.learnspringsecond.data.model.Employee;
import com.example.learnspringsecond.data.repository.EmployeeRepository;
import com.example.learnspringsecond.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {
    @InjectMocks
    EmployeeServiceImpl service;

    @Mock
    EmployeeRepository dao;

    @Test
    public void testFindAllEmployees() {
        List<Employee> list = new ArrayList<Employee>();

        when(dao.findAll()).thenReturn(list);

        // test begin
        List<Employee> employeeList = service.getAllEmployee();

        assertEquals(0, employeeList.size());
        verify(dao, times(1)).findAll();
    }
}
