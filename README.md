# java-spring-boot-api
A simple Java Spring Boot Restfull API with MongoDB

To set-up this project just follow above steps:

  1 - git clone this project to any desired folder.
  2 - inside the project folder, run the following command in the terminal: mvn clean package
  3 - open the target folder of the package process, and run the .jar file (not the "original" one)
  4 - the rest api will be available under the address: localhost:8080
  
  OR
  
  1 - git clone this project to any desired folder;
  2 - inside the project folder, run the following command in the terminal: mvn clean spring-boot:run;
  4 - Do Not close the terminal from the step 2;
  5 - the rest api will be available under the address: localhost:8080;
  
  OR
  
  1 - simply execute the .jar file in /target folder (not the "original" one);
  
  And, for testing, the requests can be done by:
  
  POST
  Insert a new userContacts:
  .../api/v1/userContacts/
  And in the body (in JSON/application format):
  {"contact":"12981105447", "type":"cellphone","users":{"_id": "<get the ID with GET from an user>", "name": "<get the NAME with GET from an user>"}}
  
  Insert a new user:
  .../api/v1/userContacts/
  And in the body (in JSON/application format):
  {"name":"<insert a name>"}
  
  GET
  Retrieve all userContacts:
  .../api/v1/userContacts/
  
  Retrieve a specific userContacts:
  .../api/v1/userContacts/{id}
  
  Retrieve a specific userContacts by the contact name:
  .../api/v1/userContacts/contactname?name=""
  
  Retrieve a specific userContacts by the user name:
  .../api/v1/userContacts/username?name=""
  
  Retrieve all users:
  .../api/v1/users/
  
  Retrieve a specific user:
  .../api/v1/users/{id}
  
  Retrieve a specific user by the username:
  .../api/v1/users/username?name=""
    
  PUT
  Update a userContacts:
  .../api/v1/userContacts/{id}
  And in the body (in JSON/application format):
  {"contact":"", "type":"","users":{"_id": "", "name": ""}}
  
  Update a user:
  .../api/v1/users/{id}
  And in the body (in JSON/application format):
  {"name":""}
  
  DELETE
  Delete a userContacts:
  .../api/v1/userContacts/{id}
  
  Delete a user:
  .../api/v1/users/{id}
  
  Any questions, mail me at: conty.lucas@gmail.com
