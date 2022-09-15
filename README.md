# SpringBootJPA

## curl

### get all employee
curl -X GET "http://localhost:8080/employee/show"

### post a emproyee
curl -X POST localhost:8080/employee/add -d 'name=hogehoge&department=2'

### get all Employee value and all Department.
curl -X GET "http://localhost:8080/employee/allvalue/1"
