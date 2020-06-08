package controller;

import exception.PeopleListException;
import model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.StoreService;

@RestController
@RequestMapping(value = "/services/stores")
public class StoreController {
    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Store> lookupEmployee (@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(storeService.getStore(id));
    }

    @ExceptionHandler(PeopleListException.class)
    public ResponseEntity<String> handleException(final PeopleListException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
