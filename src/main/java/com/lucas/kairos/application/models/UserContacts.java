package com.lucas.kairos.application.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class UserContacts {
      @Id
      public ObjectId _id;

      public String contact;
      public String type;
      public Users user;

      // Constructors
      public UserContacts() {}

      public UserContacts(ObjectId pId, String pContact, String pType, Users pUser) {
        this._id = pId;
        this.contact = pContact;
        this.type = pType;
        this.user = pUser;
      }

      // ObjectId needs to be converted to string
      public String get_id() { 
          return _id.toHexString();
      }

      public void set_id(ObjectId pId) {
          this._id = pId;
      }

      public String getContact() {
          return contact;
      }

      public void setContact(String pContact) {
          this.contact = pContact;
      }

      public String getType() {
          return type;
      }

      public void setType(String pType) {
          this.type = pType;
      }

      public Users getUser() {
          return user;
      }
      
      public void setUser(Users pUsers) {
          this.user = pUsers;
      }
}
