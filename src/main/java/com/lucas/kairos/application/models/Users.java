package com.lucas.kairos.application.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Model class for Users.
 */
public class Users {
    @Id
    private ObjectId _id;

    private String name;

    /**
     * Constructor method of Users class
     */
    public Users() {
    }

    /**
     * Constructor method of Users class.
     * 
     * @param pId   the id of an User object.
     * @param pName the name of an User object.
     */
    public Users(ObjectId pId, String pName) {
        this._id = pId;
        this.name = pName;
    }

    /**
     * Retrieve the _id of an User converted to String
     * 
     * @return _id
     */
    public String get_id() {
        return _id.toHexString();
    }

    /**
     * Insert the _id of an User object.
     * 
     * @param pId
     */
    public void set_id(ObjectId pId) {
        this._id = pId;
    }

    /**
     * Retrieve the name of an User object.
     * 
     * @param name
     */
    public String getName() {
        return name;
    }

    /**
     * Insert the name of an User object.
     * 
     * @param pName
     */
    public void setName(String pName) {
        this.name = pName;
    }
}
