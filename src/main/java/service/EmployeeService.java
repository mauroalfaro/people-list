package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public EmployeeService() {
    }

    public Employee getEmployee(String id){
        return new Employee();
    }

    public List<Employee> getEmployees() {
        return new ArrayList<Employee>();
    }

    public Employee addEmployee (Employee employee){
        return new Employee();
    }

    public Employee updateEmployee (String id, Employee employee){
        return new Employee();
    }

    public void removeEmployee (String id){

    }
}
