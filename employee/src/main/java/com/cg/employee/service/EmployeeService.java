package com.cg.employee.service;

import com.cg.employee.bean.Employee;
import com.cg.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public Employee getEmployeeDetailsById(int employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    public void saveEmployeeDetails(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployeeDetails(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
