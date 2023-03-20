package com.oumellahni.employeeservice.mapper;

import com.oumellahni.employeeservice.dto.EmployeeDto;
import com.oumellahni.employeeservice.entity.Employee;

/**
 * @author nabil
 * @at 3/14/23 11:34 AM
 */
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartmentCode()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode()
        );
    }
}
