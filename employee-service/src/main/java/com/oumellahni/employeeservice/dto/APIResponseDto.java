package com.oumellahni.employeeservice.dto;

import lombok.*;

/**
 * @author nabil
 * @at 3/14/23 10:34 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
}
