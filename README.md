# Job Portal Backend

A Spring Boot-based Job Portal backend application that provides REST APIs for managing job listings.

## Features

- Get all job postings
- Get job by ID
- Add new job postings
- Update existing job postings
- Delete job postings
- RESTful API architecture
- JSON data exchange

## Tech Stack

- Java 21
- Spring Boot
- Spring MVC
- Maven
- Lombok

## Project Structure

```text
src/
├── controller/
│   └── JobRestController.java
├── service/
│   └── JobService.java
├── repo/
│   └── JobRepo.java
├── model/
│   └── JobPost.java
└── JobPortalBackendApplication.java
```

## Installation

### Clone Repository

```bash
git clone https://github.com/Sathish292004/JobPortal_Backend.git
cd JobPortal_Backend
```

### Install Dependencies

```bash
mvn clean install
```

## Running Backend

```bash
mvn spring-boot:run
```

Application runs at:

```text
http://localhost:8080
```

## API Endpoints

### Get All Jobs

```http
GET /jobPosts
```

### Get Job By ID

```http
GET /jobPost/{id}
```

### Add New Job

```http
POST /jobPost
```

### Update Job

```http
PUT /jobPost
```

### Delete Job

```http
DELETE /jobPost/{id}
```

## Sample Response

```json
{
  "postId": 1,
  "postProfile": "Java Developer",
  "postDesc": "Experienced Java Developer",
  "reqExperience": 3,
  "postTechStack": [
    "Java",
    "Spring Boot",
    "MySQL"
  ]
}
```

## Future Enhancements

- Database integration (MySQL/PostgreSQL)
- Spring Security & JWT Authentication
- Search jobs by skill
- Pagination and sorting
- Swagger/OpenAPI documentation
- Cloud deployment

## Author

**Sathish Kumar B**

GitHub:
https://github.com/Sathish292004

---

⭐ If you found this project useful, don't forget to give it a star on GitHub!
