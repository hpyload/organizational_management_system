package com.oumellahni.employeeservice.dto;

import lombok.*;

/**
 * @author nabil
 * @at 3/14/23 11:33 AM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;
}
