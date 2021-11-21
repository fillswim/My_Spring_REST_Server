package com.fillswim.spring.rest;

import com.fillswim.spring.rest.Configuration.MyConfig;
import com.fillswim.spring.rest.Controller.RESTController;
import com.fillswim.spring.rest.DAO.EmployeeDAOImpl;
import com.fillswim.spring.rest.Entity.Employee;
import com.fillswim.spring.rest.Service.EmployeeServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.List;


public class Test {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(MyConfig.class)) {

            //myConfig
            //RESTController
            //employeeDAOImpl
            //employeeServiceImpl
            //dataSource
            //sessionFactory
            //transactionManager

            // Получение всех бинов
//            String[] beanDefinitionNames = context.getBeanDefinitionNames();
//            for (String bean : beanDefinitionNames) {
//                System.out.println(bean);
//            }

//            EmployeeDAOImpl employeeDAO = context.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
//            EmployeeServiceImpl employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
            RESTController restController = context.getBean("RESTController", RESTController.class);

            //==============================================================================================
            // Работа с RESTController

            // Сохранение работника в БД через RESTController
//            Employee employee = new Employee("Nina", "Petrova", "IT", 1500);
//            System.out.println(employee);
//            Employee employeeNew = restController.addNewEmployee(employee);
//            System.out.println(employeeNew);

            // Получение работника из БД
//            Employee employee = restController.getEmployee(8);
//            System.out.println(employee);

            // Получение всех работников из БД
//            List<Employee> employees = restController.getAllEmployees();
//            for (Employee employee : employees) {
//                System.out.println(employee);
//            }

            // Обновление данных в БД
//            Employee employee = restController.getEmployee(8);
//            System.out.println(employee);
//            employee.setSalary(2500);
//            System.out.println(employee);
//            restController.updateEmployee(employee);

            // Удаление работника из БД
//            restController.deleteEmployee(8);

            //==============================================================================================
            // Работа с EmployeeService
            // Сохранение работника в БД
//            Employee employee = new Employee("Mike", "Smith", "HR", 1000);
//            employeeService.saveEmployee(employee);

            // Получение работника из БД
//            Employee employee = employeeDAO.getEmployee(3);
//            System.out.println(employee);

            // Получение всех работников из БД
//            List<Employee> employees = employeeDAO.getAllEmployees();
//            for (Employee employee : employees) {
//                System.out.println(employee);
//            }

            // Удаление работника из БД
//            employeeDAO.deleteEmployee(4);

            // Обновление данных в БД
//            Employee employee = employeeService.getEmployee(5);
//            System.out.println(employee);
//            employee.setSalary(1000);
//            System.out.println(employee);
//            employeeService.saveEmployee(employee);

        }
    }
}
