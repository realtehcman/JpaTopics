# JPA topics to choose

    Spring Data JPA
    Connect to a real database (mysql)
    Mapping classes to tables
    Hibernate Entity Life Cycle
    Queries
    Relationships

## Requirements
- Have the access to a database
- Installed Postman or other API platforms

## How to run it
- Open the project and set up the properties file
  - You should put your database username, password and url (optionally)
  ```java
  spring.datasource.username=
  spring.datasource.password=
  spring.datasource.url=jdbc:mysql://mysql.wmi.amu.edu.pl:port_number/database_name
  ```
 - Perform requests using POSTMAN or URL
 ```json
    POST request localhost:666/topics
    body:
        {
            "id": "0",
            "topicName": "java core",
            "importance": "very"
        }
 ```
 or
 ```url
 http://localhost:666/topics/111 (deletes topic with ID 111)
 ```
 - View data in Database
 Put SQL commands to view what database consists of 
