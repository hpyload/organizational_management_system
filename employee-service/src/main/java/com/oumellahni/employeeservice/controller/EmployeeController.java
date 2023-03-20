package com.oumellahni.employeeservice.controller;

import com.oumellahni.employeeservice.dto.APIResponseDto;
import com.oumellahni.employeeservice.dto.EmployeeDto;
import com.oumellahni.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author nabil
 * @at 3/14/23 11:52 AM
 */
@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{employeeId}")
    public ResponseEntity<APIResponseDto> getEmployeeById(@PathVariable(value = "employeeId") Long employeeId) {
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }
}
