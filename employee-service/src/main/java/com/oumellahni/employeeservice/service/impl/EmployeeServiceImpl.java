package com.oumellahni.employeeservice.service.impl;

import com.oumellahni.employeeservice.dto.EmployeeDto;
import com.oumellahni.employeeservice.entity.Employee;
import com.oumellahni.employeeservice.mapper.EmployeeMapper;
import com.oumellahni.employeeservice.repository.EmployeeRepository;
import com.oumellahni.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author nabil
 * @at 3/14/23 11:49 AM
 */
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee saveDEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(saveDEmployee);
    }
}
