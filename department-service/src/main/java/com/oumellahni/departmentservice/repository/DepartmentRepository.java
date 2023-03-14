package com.oumellahni.departmentservice.repository;

import com.oumellahni.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nabil
 * @at 3/13/23 11:37 PM
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String departmentCode);
}
