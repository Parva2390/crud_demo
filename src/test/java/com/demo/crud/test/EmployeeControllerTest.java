//package com.demo.crud.test;
//
//import com.demo.crud.controller.EmployeeController;
//import com.demo.crud.service.EmployeeService;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest(EmployeeController.class)
//public class EmployeeControllerTest {
//
//    @Autowired
//    private MockMvc mockmvc;
//
//    @MockBean
//    private EmployeeService employeeService;
//
//    @Test
//    public void testGetEmployeeById() throws Exception{
//        when(employeeService.fetchEmployeeById()).thenReturn(Collections.singletonList(employee));
//
//        mockmvc.perform(get("/api/employees")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].id").value(1))
//                .andExpect(jsonPath("$[0].firstName").value("John"))
//                .andExpect(jsonPath("$[0].lastName").value("Doe"));
//    }
//
//}
