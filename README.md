# DevOpsQAP2 - March 24th, 2025

This project is a SpringBoot application for managing a golf club’s tournaments and memberships. It allows users to add and retrieve members, create tournaments, and assign members to tournaments. It is built using SpringBoot, MySQL Workbench as the database, Docker for support, and Postman for testing.

# Beginning Steps
1. Clone The Repository
- https://github.com/Twall09/DevOpsQAP2.git
2. Make sure MySQL Server is running on PC & open MySQL Workbench and Create Schema
- MYSQL_USER = root 
- MYSQL_PASSWORD = wall.11
- MYSQL_DATABASE = GolfTourny

# Running In Docker
1. Build and Run the Docker Container:
- "docker build -t GolfTourny . docker-compose up"
2. Check the Running Container (optional):
- "docker ps"

# Servers
- API: localhost:8080
- MySQL: localhost:3306

# Postman Testing:
# Members
1. Create a Member
- POST http://localhost:8080/member
2. Get All Members 
- GET http://localhost:8080/member
3. Get Member by ID
- GET http://localhost:8080/member/1
4. Update Member
- PUT http://localhost:8080/member/1
5. Delete Member
- DELETE http://localhost:8080/member/1

# Tournaments:
1. Create a Tournament
- POST http://localhost:8080/tournaments
2. Get All Tournaments
- GET http://localhost:8080/tournaments
3. Get Tournament by ID
- GET http://localhost:8080/tournaments/1
4. Update Tournament
- PUT http://localhost:8080/tournaments/1
5. Delete Tournament
- DELETE http://localhost:8080/tournaments/1
6. Add Member to Tournament
- PUT http://localhost:8080/tournaments/1/addMember/1
