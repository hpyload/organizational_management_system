package com.oumellahni.employeeservice.service.impl;

import com.oumellahni.employeeservice.dto.APIResponseDto;
import com.oumellahni.employeeservice.dto.DepartmentDto;
import com.oumellahni.employeeservice.dto.EmployeeDto;
import com.oumellahni.employeeservice.entity.Employee;
import com.oumellahni.employeeservice.mapper.EmployeeMapper;
import com.oumellahni.employeeservice.repository.EmployeeRepository;
import com.oumellahni.employeeservice.service.APIClient;
import com.oumellahni.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author nabil
 * @at 3/14/23 11:49 AM
 */
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private APIClient apiClient;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeRepository.save(EmployeeMapper.mapToEmployee(employeeDto));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public APIResponseDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();

        DepartmentDto departmentDto = apiClient.getDepartment(employee.getDepartmentCode());
        EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployee(employeeDto);
        apiResponseDto.setDepartment(departmentDto);
        return apiResponseDto;
    }
}
