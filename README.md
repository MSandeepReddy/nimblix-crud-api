# Nimblix Employee Management API

A Java Spring Boot REST API for managing employee records, featuring MySQL integration and full CRUD capabilities.

## 🚀 Features
- **Create:** Add new employees with unique IDs.
- **Read:** Fetch all employees or specific records.
- **Update:** Modify employee name, ID, or email.
- **Delete:** Remove records from the database.

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Hibernate
- **Database:** MySQL
- **Testing:** Postman

## 📋 API Endpoints
- `GET /api/tasks` - Get all employees
- `POST /api/tasks` - Create employee
- `PUT /api/tasks/{id}` - Update employee
- `DELETE /api/tasks/{id}` - Delete employee

### Sample JSON
```json
{
    "employeeId": "NTIT1390",
    "name": "Sandeep Kumar Reddy M",
    "email": "sandeepreddy@nimblix.com"
}
