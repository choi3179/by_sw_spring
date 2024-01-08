package com.example.order_management_app.service;

import com.example.order_management_app.dto.Employee;
import com.example.order_management_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId)
                .orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(String employeeId, Employee employee) {

        Employee existedEmployee = employeeRepository.findById(employeeId).orElse(null);
        System.out.println(existedEmployee.getEmployeeName());
        if (existedEmployee != null) {
            existedEmployee.setEmployeeName(employee.getEmployeeName());
            existedEmployee.setSalary(employee.getSalary());
        }


        return existedEmployee;
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
