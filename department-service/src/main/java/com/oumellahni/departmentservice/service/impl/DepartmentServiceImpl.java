package com.oumellahni.departmentservice.service.impl;

import com.oumellahni.departmentservice.dto.DepartmentDto;
import com.oumellahni.departmentservice.entity.Department;
import com.oumellahni.departmentservice.mapper.DepartmentMapper;
import com.oumellahni.departmentservice.repository.DepartmentRepository;
import com.oumellahni.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author nabil
 * @at 3/14/23 11:21 AM
 */
@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentMapper.mapToDepartmentDto(department);
    }
}
