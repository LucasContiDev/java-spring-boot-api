package com.lucas.kairos.application.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Model class for UserContacts
 */
public class UserContacts {
    @Id
    private ObjectId _id;

    private String contact;
    private String type;
    private String contactName;
    private Users user;

    /**
     * Constructor method of UserContacts class
     */
    public UserContacts() {
    }

    /**
     * Constructor method of UserContacts class
     * 
     * @param pId          the ID of an UserContacts object
     * @param pContact     the contact information of an UserContacts object
     * @param pType        the type of the contact of an UserContacts object
     * @param pUser        the User object of an UserContacts object
     * @param pContactName the contact name of an UserContacts object
     */
    public UserContacts(ObjectId pId, String pContact, String pType, Users pUser, String pContactName) {
        this._id = pId;
        this.setContactName(pContactName);
        this.contact = pContact;
        this.type = pType;
        this.user = pUser;
    }

    /**
     * Retrieve the _id of an UserContact converted to String
     * 
     * @return _id
     */
    public String get_id() {
        return _id.toHexString();
    }

    /**
     * Insert the _id of an UserContact
     * 
     * @param pId
     */
    public void set_id(ObjectId pId) {
        this._id = pId;
    }

    /**
     * Retrieve the contact information of an UserContact
     * 
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Insert the contact information of an UserContact
     * 
     * @param pContact
     */
    public void setContact(String pContact) {
        this.contact = pContact;
    }

    /**
     * Retrieve the type of the contact of an UserContact
     * 
     * @param type
     */
    public String getType() {
        return type;
    }

    /**
     * Insert the type of the contact of an UserContact
     * 
     * @param pType
     */
    public void setType(String pType) {
        this.type = pType;
    }

    /**
     * Retrieve the contact name of an UserContact
     * 
     * @param contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Insert the contact name of an UserContact
     * 
     * @param pContactName
     */
    public void setContactName(String pContactName) {
        this.contactName = pContactName;
    }

    /**
     * Retrieve the User object of an UserContact
     * 
     * @param user
     */
    public Users getUser() {
        return user;
    }

    /**
     * Insert the User object of an UserContact
     * 
     * @param pUsers
     */
    public void setUser(Users pUsers) {
        this.user = pUsers;
    }
}
