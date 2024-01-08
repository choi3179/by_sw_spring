package com.example.order_management_app.service;

import com.example.order_management_app.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployeeAll();
    Employee getEmployeeById(String employeeId);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(String employeeId, Employee employee);
    void deleteEmployee(String employeeId);
}
