
# Spring Boot CRUD Backend

This is a Spring Boot-based backend project for a CRUD platform that manages indicator data. The project demonstrates basic CRUD operations (Create, Read, Update, Delete) and integrates with a MySQL database using Spring Data JPA.

## Features

- **RESTful API Endpoints:**  
  Create, read, update (using PATCH), and delete indicator records.
  
- **MySQL Integration:**  
  Uses Spring Data JPA to persist data in a MySQL database.
  
- **File Parsing:**  
  Utilizes Apache POI (Mammoth) to extract data from Word documents.
  
- **Partial Updates:**  
  Implements PATCH endpoints to update only the changed fields.
  
- **Error Handling:**  
  Returns appropriate response messages based on operation success.

## Prerequisites

- Java 11 or higher
- Maven
- MySQL

## Setup

1. **Clone the Repository:**

   ```bash
   git clone <repository-url>
   cd <repository-folder>
   
2. **Configure the Database:**
   
   - Create a MySQL database
   - Update the src/main/resource/application/properties file with your database connection details. For Example:
     
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update

 3. **Build the Project:**

    ```bash
     mvn clean install

 4. **Run the Application**  

    ```bash
     mvn spring-boot:run


## API Endpoints

  - **Create Indicator:**  
  POST /api/indicators
  
- **Read Indicator**  
  GET /api/indicators/{id}
  
- **Update Indicator:**  
  PATCH /api/indicators/{id}
  
- **Delete Indicator:**  
  DELETE /api/indicators/{id}

  

  This README provides a clear, technical overview of  the backend and instructions on how to set up and run the project.
