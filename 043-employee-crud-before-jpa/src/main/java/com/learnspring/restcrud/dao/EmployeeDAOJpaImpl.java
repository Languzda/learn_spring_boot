package com.learnspring.restcrud.dao;

import com.learnspring.restcrud.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id); // id is a PRIMARY KEY
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee); // merge will add/update employee zależnie od tego czy istnieje
        // if id==0 -> insert/save else -> update
    }

    @Override
    public void deleteById(Integer id) {
        Employee employeeToDelete = entityManager.find(Employee.class, id);
        entityManager.remove(employeeToDelete);
    }
}
