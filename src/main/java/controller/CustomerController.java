package controller;

import exception.PeopleListException;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/services/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> lookupCustomer (@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomer(id));
    }

    @PostMapping(value = "/add", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> addCustomer (@RequestBody Customer customer){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerService.addCustomer(customer));
    }

    @ExceptionHandler(PeopleListException.class)
    public ResponseEntity<String> handleException(final PeopleListException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
