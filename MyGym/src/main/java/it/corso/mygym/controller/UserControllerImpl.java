package it.corso.mygym.controller;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDto;
import it.corso.mygym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Autowired
    public UserControllerImpl (final UserService userService) {
        this.userService=userService;
    }

    @PostMapping()
    @Override
    public ResponseEntity<User> save(@RequestBody UserDto userDto) {
        User userSaved = userService.save(userDto);
        return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }

    @GetMapping("findBy/{id}")
    @Override
    public ResponseEntity<User> findById(@PathVariable(value="id") Long id) {
        User userFind = userService.findById(id);
        return new ResponseEntity<>(userFind, HttpStatus.FOUND);
    }

    @GetMapping("findAll/{includeInactiveFlag}")
    @Override
    public ResponseEntity<List<User>> findAll(@PathVariable(value="includeInactiveFlag") boolean includeInactiveFlag) {
        List<User> findAllUsers = userService.findAll(includeInactiveFlag);
        return new ResponseEntity<>(findAllUsers, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<User> update(Long id, UserDto userDto) {
        return null;
    }


}
