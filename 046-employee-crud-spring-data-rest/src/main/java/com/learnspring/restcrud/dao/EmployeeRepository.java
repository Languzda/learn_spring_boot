package com.learnspring.restcrud.dao;

import com.learnspring.restcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Ta annotacja jest opcjonalna, bez niej odpointy by były nazwane id Employee -> /employees
// (pierwsza litera lowerCase, i dodanie s na końcu, plural form)
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
