package com.example.department_service.controller;

import com.example.department_service.dto.Department;
import com.example.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {

        Department saveDepartment = departmentService.saveDepartment(department);

        return new ResponseEntity<Department>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){

        Department department = departmentService.getDepartmentById(departmentId);

        return ResponseEntity.ok(department);
    }
}
