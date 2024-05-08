package com.demo.crud.dto;

import com.demo.crud.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTOForList {


        private Long employeeId;

        private String employeeName;

        private String employeeEmail;

        private String employeeContact;

//    private Long departmentId;

        private Department department;

}
