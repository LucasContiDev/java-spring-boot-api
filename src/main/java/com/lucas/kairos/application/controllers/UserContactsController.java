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

import com.lucas.kairos.application.models.UserContacts;
import com.lucas.kairos.application.repositories.UserContactsRepository;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/userContacts")
public final class UserContactsController {

    @Autowired
    private UserContactsRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserContacts> getAllUserContacts() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserContacts getUserContactsById(@PathVariable("id") ObjectId pId) {
        return repository.findBy_id(pId);
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public List<UserContacts> getUserContactsByUserName(@RequestParam(value="name") String pName) {
        return repository.findByUserName(pName);
    }
    
    @RequestMapping(value = "/contactname", method = RequestMethod.GET)
    public List<UserContacts> getUserContactsByContactName(@RequestParam(value="name") String pName) {
        return repository.findByContactName(pName);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyUserContactsById(@PathVariable("id") ObjectId pId, @Valid @RequestBody UserContacts pUserContacts) {
        pUserContacts.set_id(pId);
        repository.save(pUserContacts);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public UserContacts createUserContacts(@Valid @RequestBody UserContacts pUserContacts) {
        pUserContacts.set_id(ObjectId.get());
        repository.save(pUserContacts);
        return pUserContacts;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserContacts(@PathVariable("id") ObjectId pId) {
        repository.delete(repository.findBy_id(pId));
    }
}
