package com.oumellahni.departmentservice.mapper;

import com.oumellahni.departmentservice.dto.DepartmentDto;
import com.oumellahni.departmentservice.entity.Department;

/**
 * @author nabil
 * @at 3/14/23 11:24 AM
 */
public class DepartmentMapper {
    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
    }
}

