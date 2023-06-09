package com.oumellahni.departmentservice.dto;

import lombok.*;

/**
 * @author nabil
 * @at 3/13/23 11:39 PM
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
