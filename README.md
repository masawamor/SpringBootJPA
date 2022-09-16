# SpringBootJPA

## curl

### get all employee
curl -X GET "http://localhost:8080/employee/show"

### post a emproyee
curl -X POST -H "Content-Type: application/json" -d '{"name": "Tsuchiya", "department": {"id": 1}}' localhost:8080/employee/add

### get all Employee value and all Department.
curl -X GET "http://localhost:8080/employee/allvalue/1"
