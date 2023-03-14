package com.oumellahni.departmentservice.service;

import com.oumellahni.departmentservice.dto.DepartmentDto;

/**
 * @author nabil
 * @at 3/14/23 11:21 AM
 */
public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}