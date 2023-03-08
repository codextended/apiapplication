package dev.codextended.apiapplication.service.impl;

import dev.codextended.apiapplication.model.Employee;
import dev.codextended.apiapplication.repository.InMemoryRepository;
import dev.codextended.apiapplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Qualifier(value = "inMemory")
public class InMemoryEmployeeServiceImpl implements EmployeeService {

    private final InMemoryRepository inMemoryRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        inMemoryRepository.addEmployee(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryRepository.getAllEmployees();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryRepository.findById(id);
    }

    // Assignment
    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryRepository.deleteById(id);
    }
}
