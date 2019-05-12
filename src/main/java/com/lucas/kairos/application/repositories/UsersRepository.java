package com.lucas.kairos.application.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.lucas.kairos.application.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
    Users findBy_id(ObjectId _id);

    List<Users> findByName(String name);
}