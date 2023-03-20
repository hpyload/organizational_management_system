package com.oumellahni.employeeservice.service;

import com.oumellahni.employeeservice.dto.APIResponseDto;
import com.oumellahni.employeeservice.dto.EmployeeDto;

/**
 * @author nabil
 * @at 3/14/23 11:47 AM
 */
public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);

}