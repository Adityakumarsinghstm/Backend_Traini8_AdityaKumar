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

## API Endpoints

### 1 Retrieve a New Training Center  
**GET** `/training-center`
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
**RESPONSE**
***200 OK***
### 2 Create a New Training Center  
**POST** `/training-center`

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


