# ⚙️ Job Portal Backend

A Spring Boot REST API for managing job postings — built with a clean layered architecture (controller → service → repository → model) and ready to power the [JobPortal_Frontend](https://github.com/Sathish292004/JobPortal_Frontend) application.

## Overview

This service exposes simple CRUD endpoints for job posts: create, read, update, and delete. It's intentionally lightweight right now — data lives in memory rather than a database — making it easy to run locally and a solid foundation to build on.

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot (Spring MVC) |
| Build Tool | Maven |
| Boilerplate | Lombok |
| Data Format | Jackson (JSON / XML) |

## Project Structure

```
src/
├── main/java/.../
│   ├── controller/
│   │   └── JobRestController.java   # REST endpoints
│   ├── service/
│   │   └── JobService.java          # Business logic
│   ├── repo/
│   │   └── JobRepo.java             # In-memory data storage
│   ├── model/
│   │   └── JobPost.java             # Job post entity
│   └── JobPortalBackendApplication.java
```

> **Note:** This project currently stores data in memory. Data resets every time the application restarts. Persistent storage (MySQL/PostgreSQL) is on the roadmap — see [Roadmap](#roadmap) below.

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.6+

### Clone & Run

```bash
git clone https://github.com/Sathish292004/JobPortal_Backend.git
cd JobPortal_Backend

# Install dependencies
mvn clean install

# Run the application
mvn spring-boot:run
```

The API will be available at:

```
http://localhost:8080
```

## API Reference

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/jobPosts` | Get all job postings |
| `GET` | `/jobPost/{id}` | Get a single job posting by ID |
| `POST` | `/jobPost` | Create a new job posting |
| `PUT` | `/jobPost` | Update an existing job posting |
| `DELETE` | `/jobPost/{id}` | Delete a job posting by ID |

### Sample Job Object

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

### Example Request

```bash
curl -X POST http://localhost:8080/jobPost \
  -H "Content-Type: application/json" \
  -d '{
        "postId": 2,
        "postProfile": "Frontend Developer",
        "postDesc": "React enthusiast wanted",
        "reqExperience": 2,
        "postTechStack": ["React", "JavaScript", "Material UI"]
      }'
```

## Roadmap

- [ ] Persistent storage with Spring Data JPA (MySQL/PostgreSQL)
- [ ] Spring Security & JWT authentication
- [ ] Search jobs by skill
- [ ] Pagination and sorting
- [ ] Swagger / OpenAPI documentation
- [ ] Cloud deployment

## Related Projects

- 💻 [JobPortal_Frontend](https://github.com/Sathish292004/JobPortal_Frontend) — React + Material UI client for this API

## Author

**Sathish Kumar B**
GitHub: [@Sathish292004](https://github.com/Sathish292004)

---

⭐ If you found this project useful, consider giving it a star!
