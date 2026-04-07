# Spring Data JPA (Hibernate) Main

This is a Spring Boot project demonstrating CRUD operations using Spring Data JPA and Hibernate. It handles `Alien` entities and maps them to a MySQL database.

## Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/aliens` | Returns a list of all aliens. |
| **GET** | `/aliens/{id}` | Returns a single alien by its ID. |
| **POST** | `/aliens` | Adds a new alien (expects JSON body). |
| **PUT** | `/aliens` | Updates an existing alien (expects JSON body). |
| **DELETE** | `/aliens/{id}` | Deletes an alien by its ID. |

## Operations & SQL Equivalents

| Operation | JPA Method | Equivalent SQL |
| :--- | :--- | :--- |
| **Insert** | `repo.save(alien)` | `INSERT INTO alien (id, name, age) VALUES (?, ?, ?);` |
| **Select** | `repo.findAll()` | `SELECT * FROM alien;` |
| **Update** | `repo.save(alien)` | `UPDATE alien SET name = ?, age = ? WHERE id = ?;` |
| **Delete** | `repo.deleteById(id)` | `DELETE FROM alien WHERE id = ?;` |

## How to use in Postman

### Adding Data (POST)
- **URL**: `http://localhost:8080/aliens`
- **Method**: `POST`
- **Body (raw JSON)**:
```json
{
    "id": 101,
    "name": "Aryan",
    "age": 20
}
```
