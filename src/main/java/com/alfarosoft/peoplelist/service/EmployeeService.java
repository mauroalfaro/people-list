package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.EmployeeMockDataBuilder;
import com.alfarosoft.peoplelist.exception.PeopleListException;
import com.alfarosoft.peoplelist.model.Customer;
import com.alfarosoft.peoplelist.model.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private EmployeeMockDataBuilder employeeMockDataBuilder;
    private List<Employee> employeeList;

    public EmployeeService() {
        this.employeeMockDataBuilder = new EmployeeMockDataBuilder();
        employeeList = employeeMockDataBuilder.buildMockedData();
    }

    public Employee getEmployee(String id){
        if(employeeList.stream().anyMatch(employee1 -> employee1.getId().equals(id))){
            Optional<Employee> employeeOptional = employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst();
            if (employeeOptional.isPresent()){
                return employeeOptional.get();
            }
        }
        throw new PeopleListException("Employee with id " + id + " not found");
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Employee addEmployee (Employee employee){
        if(employeeList.stream().noneMatch(employee1 -> employee1.getName().equals(employee.getName()))){
            employeeList.add(employee);
        }
        return employee;
    }

    public Employee updateEmployee (String id, Employee employee){
        return employee;
    }

    public void removeEmployee (String id){
        if(employeeList.stream().anyMatch(employee1 -> employee1.getId().equals(id))){
            Optional<Employee> employeeOptional = employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst();
            employeeOptional.ifPresent(employee -> employeeList.remove(employee));
        }
        else{
            throw new PeopleListException("Employee with id " + id + " not found");
        }
    }
}
