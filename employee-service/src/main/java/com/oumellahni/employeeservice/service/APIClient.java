package com.oumellahni.employeeservice.service;

import com.oumellahni.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author nabil
 * @at 3/22/23 1:45 PM
 */
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
