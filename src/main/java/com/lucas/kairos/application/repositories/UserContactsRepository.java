package com.lucas.kairos.application.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.lucas.kairos.application.models.UserContacts;

public interface UserContactsRepository extends MongoRepository<UserContacts, String> {
    UserContacts findBy_id(ObjectId _id);

    @Query("{ 'user.name' : ?0 }")
    List<UserContacts> findByUserName(String name);

    List<UserContacts> findByContactName(String contactName);

}