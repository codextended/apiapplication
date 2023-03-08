package dev.codextended.apiapplication.repository;

import dev.codextended.apiapplication.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepository {
    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1, "John", "Smith", "jsmith@gmail.com"));
        DATABASE.add(new Employee(1, "David", "Banner", "dbanner@gmail.com"));
        DATABASE.add(new Employee(1, "Michael", "Cane", "mcane@gmail.com"));
    }

    public void addEmployee(Employee employee) {
        DATABASE.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return List.copyOf(DATABASE);
    }

    public Employee findById(Integer id) {
        return DATABASE
                .stream()
                .filter(employee -> id.equals(employee.getId()))
                .findFirst()
                .orElseThrow();
    }

    // Assignment
    public void updateEmployee(Employee employee) {

    }

    public Boolean deleteById(Integer id) {
        Employee emp = DATABASE
                .stream()
                .filter(employee -> id.equals(employee.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.remove(emp);
        return Boolean.TRUE;
    }
}
