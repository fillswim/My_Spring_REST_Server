package com.fillswim.spring.rest.Service;

import com.fillswim.spring.rest.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(int id);
}
