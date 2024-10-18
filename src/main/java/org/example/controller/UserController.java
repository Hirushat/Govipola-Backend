package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    final UserService service;

    @GetMapping("/get-all-farmers")
    public List<UserEntity> getFarmers(){
        return service.getFarmers();
    }

    @GetMapping("/get-all-middlemen")
    public List<UserEntity> getMiddleman(){
        return service.getMiddleman();
    }

    @GetMapping("/get-all-millers")
    public List<UserEntity> getMiller(){
        return service.getMiller();
    }

    @PostMapping("/add-user")
    public boolean addFarmer(@RequestBody User user){

        return service.addFarmer(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFarmer(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("/find-by-username/{username}")
    public UserEntity findUserByUsername(@PathVariable String username){
        return service.findByUserName(username);
    }
    @GetMapping("/is-exist-user/{userName}")
    public Boolean isExistUser(@PathVariable String userName){
        return service.isExistUser(userName);
    }





}

