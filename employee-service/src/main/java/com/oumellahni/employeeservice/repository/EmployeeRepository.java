package com.oumellahni.employeeservice.repository;

import com.oumellahni.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nabil
 * @at 3/14/23 11:36 AM
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
