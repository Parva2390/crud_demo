package com.demo.crud.mapper;

import com.demo.crud.dto.EmployeeDTO;
import com.demo.crud.dto.EmployeeDTOForList;
import com.demo.crud.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface MapstructMapper {
//    @Mapping(source = "",target = "") // need to write when source and target have different name of field

    // for single employee
    @Mapping(target = "noOfAssets",ignore = true)
    Employee dtoToEntity(EmployeeDTO dto);
    List<Employee> dtoToEntityList(List<EmployeeDTO> dto);
    @Mapping(target = "noOfAssets",ignore = true)
    EmployeeDTO entityToDto(Employee employee);
    List<EmployeeDTO> entityToDtoList(List<Employee> employee);

    // for employee list
    Employee dtoToEntityForList(EmployeeDTOForList dto);
    List<Employee> dtoToEntityForList(List<EmployeeDTOForList> dto);

    EmployeeDTOForList entityToDtoForList(Employee employee);
    List<EmployeeDTOForList> entityToDtoForList(List<Employee> employee);
}
