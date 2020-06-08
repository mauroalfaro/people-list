package controller;

import exception.PeopleListException;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

@RestController
@RequestMapping(value = "/services/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Employee> lookupEmployee (@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(id));
    }

    @ExceptionHandler(PeopleListException.class)
    public ResponseEntity<String> handleException(final PeopleListException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
