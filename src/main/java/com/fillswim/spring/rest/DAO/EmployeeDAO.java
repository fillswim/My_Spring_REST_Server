package com.fillswim.spring.rest.DAO;

import com.fillswim.spring.rest.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(int id);
}
