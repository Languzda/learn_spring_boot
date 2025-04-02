package com.learnspring.restcrud.service;

import com.learnspring.restcrud.entity.Employee;
import jakarta.transaction.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
