package com.lucas.kairos.application.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {
    @Id
    public ObjectId _id;

    public String name;

 // Constructors
    public Users() {}

    public Users(ObjectId pId, String pName) {
      this._id = pId;
      this.name = pName;
    }

    // ObjectId needs to be converted to string
    public String get_id() { 
        return _id.toHexString();
    }

    public void set_id(ObjectId pId) {
        this._id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        this.name = pName;
    }
}
