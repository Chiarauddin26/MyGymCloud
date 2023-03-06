package it.corso.mygym.controller;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
public interface UserController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    ResponseEntity<User> save(@RequestBody UserDto userDto);

    @GetMapping("findBy/{id}")
    ResponseEntity<User> findById(@PathVariable(value="id") Long id);

    @GetMapping("findAll/{includeInactiveFlag}")
    ResponseEntity<List<User>> findAll(@PathVariable(value="includeInactiveFlag") boolean includeInactiveFlag);

    @PutMapping("/update/{id}")
    ResponseEntity<User> update(@PathVariable(value = "id") Long id, UserDto userDto);

}
