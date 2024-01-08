package com.example.order_management_app.controller;

import com.example.order_management_app.dto.Employee;
import com.example.order_management_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployeeAll(){
        return employeeService.getEmployeeAll();
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PostMapping("/update")
    public String updateEmployee(@RequestParam(name = "employeeId") String employeeId, @RequestBody Employee employee){
        Employee newEmployee = employeeService.updateEmployee(employeeId, employee);
        employeeService.saveEmployee(newEmployee);

        if(newEmployee != null)
            return newEmployee.getEmployeeName() + " / " + newEmployee.getSalary();
        return "";
    }

    @GetMapping("/delete")
    public void deleteEmployee(@RequestParam String employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}
