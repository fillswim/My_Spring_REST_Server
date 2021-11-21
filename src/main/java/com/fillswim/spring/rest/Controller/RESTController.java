package com.fillswim.spring.rest.Controller;

import com.fillswim.spring.rest.Entity.Employee;
import com.fillswim.spring.rest.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    // Метод GET        /api/employees                  Получение всех работников
    // Метод GET        /api/employees{employeeID}      Получение одного работника
    // Метод POST       /api/employees                  Добавление работника
    // Метод PUT        /api/employees                  Изменение работника
    // Метод DELETE     /api/employees{employeeID}      Удаление работника

    private final EmployeeService employeeService;

    public RESTController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        employeeService.deleteEmployee(id);

        return "Employee with ID = " + id + " was deleted";
    }


}
