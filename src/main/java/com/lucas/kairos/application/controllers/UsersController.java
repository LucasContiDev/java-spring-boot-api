package com.lucas.kairos.application.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.kairos.application.models.Users;
import com.lucas.kairos.application.repositories.UsersRepository;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public final class UsersController {

    @Autowired
    private UsersRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Users getUsersById(@PathVariable("id") ObjectId pId) {
        return repository.findBy_id(pId);
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public Users getUsersByName(@RequestParam(value="name") String pName) {
        return repository.findByName(pName);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyUsersById(@PathVariable("id") ObjectId pId, @Valid @RequestBody Users pUsers) {
        pUsers.set_id(pId);
        repository.save(pUsers);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Users createUsers(@Valid @RequestBody Users pUsers) {
        pUsers.set_id(ObjectId.get());
        repository.save(pUsers);
        return pUsers;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUsers(@PathVariable("id") ObjectId pId) {
        repository.delete(repository.findBy_id(pId));
    }
}
