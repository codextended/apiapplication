package dev.codextended.apiapplication.service;

import dev.codextended.apiapplication.model.Employee;

import java.util.List;

public interface EmployeeService {

    // Save an employee
    Employee addEmployee(Employee employee);

    // Get employees
    List<Employee> getAllEmployees();

    // Get an employee
    Employee findById(Integer id);

    // Update an employee
    void updateEmployee(Employee employee);

    // Delete an employee
    Boolean deleteById(Integer id);
}
