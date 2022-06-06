package com.cg.employee.controller;

import com.cg.employee.bean.Employee;
import com.cg.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employeeDetails")
    private List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{employeeId}")
    private Employee getEmployeeDetailsById(@PathVariable("employeeId") int employeeId){
        return employeeService.getEmployeeDetailsById(employeeId);
    }

    @PostMapping("/saveEmployee")
    private int saveEmployeeDetails(@RequestBody Employee employee){
        employeeService.saveEmployeeDetails(employee);
        return employee.getEmployeeId();
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    private void deleteEmployeeDetails(@PathVariable("employeeId") int employeeId){
        employeeService.deleteEmployeeDetails(employeeId);
    }
}
