# Training Center API for Traini8

A RESTful API built using **Spring Boot** for managing Training Centers. It provides functionality to **create** a new training center and **retrieve** all training centers stored in the database.

---

## Features

- ✅ Create Training Center (POST API)
- ✅ Get All Training Centers (GET API)
- ✅ Validation with Bean Validation Annotations
- ✅ Global Exception Handling with `@RestControllerAdvice`
- ✅ Server-generated `createdOn` timestamp
- ✅ Returns empty list if no training centers are available
- ✅ Clean Project Structure following best practices

---

## Technology Stack

| Technology         | Description                          |
|--------------------|--------------------------------------|
| Java               | Programming Language (Java 17+)      |
| Spring Boot        | Backend Framework (Spring Boot 3.x) |
| Spring Web         | RESTful APIs Development             |
| Spring Data JPA    | ORM (Object Relational Mapping)      |
| Hibernate Validator| Validation Framework (JSR 380)      |
| H2 Database        | In-Memory Database (For Development)|
| MySQL (Optional)   | Relational Database (For Production)|
| Maven              | Build Tool                          |
| REST API (JSON)    | Communication Format                 |
| Postman            | API Testing Tool                    |
| IntelliJ / Eclipse | IDE for Development                 |

---

## API Endpoints

### 1 Retrieve a New Training Center  
**GET** `http://localhost:9191/training-center`
```Example Success Response
[
  {
    "centerId": 1,
    "centerName": "ABC Training Center",
    "centerCode": "ABC123XYZ789",
    "address": {
      "detailedAddress": "123 Main Street",
      "city": "New York",
      "state": "NY",
      "pincode": "10001"
    },
    "studentCapacity": 100,
    "coursesOffered": [
      "Java",
      "Spring Boot"
    ],
    "createdOn": 1709952659,
    "contactEmail": "contact@abctraining.com",
    "contactPhone": "9876543210"
  },
  {
    "centerId": 2,
    "centerName": "XYZ Training Center",
    "centerCode": "XYZ456LMN123",
    "address": {
      "detailedAddress": "456 Secondary Road",
      "city": "Los Angeles",
      "state": "CA",
      "pincode": "90001"
    },
    "studentCapacity": 80,
    "coursesOffered": [
      "Python",
      "Data Science"
    ],
    "createdOn": 1709952750,
    "contactEmail": "contact@xyztraining.com",
    "contactPhone": "9123456780"
  }
]
```
```Example Empty Response
[]

```
**RESPONSE**
***200 OK***
### 2 Create a New Training Center  
**POST** `http://localhost:9191/training-center`

#### Request Body (JSON)
```json
{
  "centerName": "ABC Training Center",
  "centerCode": "ABC123XYZ789",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "New York",
    "state": "NY",
    "pincode": "10001"
  },
  "studentCapacity": 100,
  "coursesOffered": [
    "Java",
    "Spring Boot"
  ],
  "contactEmail": "contact@abctraining.com",
  "contactPhone": "9876543210"
}

```
#### ✅ H2 Configuration in `application.properties`

``` Properties
spring.application.name=TrainingCenters

server.port=9191

# H2 in-memory database
spring.datasource.url=jdbc:h2:mem:traini8
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

# Optional
## MySQL Database Configuration
#spring.datasource.url=jdbc:mysql://localhost:3306/traini8
#spring.datasource.username=root
#spring.datasource.password=aditya
#


```
#### ✅ Required Dependency in `pom.xml`

``` Dependencies
I have used both the databases but for the setup simplicity i have added h2 
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

<!--		<dependency>-->
<!--			<groupId>com.mysql</groupId>-->
<!--			<artifactId>mysql-connector-j</artifactId>-->
<!--			<scope>runtime</scope>-->
<!--		</dependency>-->

		<!-- H2 In-Memory Database -->
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

```
## How to Clone, Build, and Run Locally

### 1 Clone the Repository
```bash
git clone https://github.com/Adityakumarsinghstm/Backend_Traini8_AdityaKumar/
cd TrainingCenters
```
### 2 Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```
## Author
### Aditya Kumar


