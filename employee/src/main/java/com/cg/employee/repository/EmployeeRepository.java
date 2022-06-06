package com.cg.employee.repository;

import com.cg.employee.bean.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
