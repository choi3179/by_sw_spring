package com.example.department_service.service;

import com.example.department_service.dto.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
