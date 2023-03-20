package com.oumellahni.employeeservice.dto;

import lombok.*;

/**
 * @author nabil
 * @at 3/14/23 12:29 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
