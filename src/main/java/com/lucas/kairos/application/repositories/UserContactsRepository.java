package com.lucas.kairos.application.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.lucas.kairos.application.models.UserContacts;

public interface UserContactsRepository extends MongoRepository<UserContacts, String> {
    UserContacts findBy_id(ObjectId _id);

    @Query("{ 'user.name' : ?0 }")
    UserContacts findByUserName(String name);

}