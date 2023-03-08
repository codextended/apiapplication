package dev.codextended.apiapplication.repository;

import dev.codextended.apiapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEmployeeRepository extends JpaRepository<Employee, Integer> {
}
