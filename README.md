# JDBC_PROJECT_01

This is a Cricketer database connected JDBC program

This Java-based application manages cricketer information using JDBC (Java Database Connectivity). It allows users to perform CRUD (Create, Read, Update, Delete) operations on a MySQL database through a console-based interface.

📁 Project Structure

JDBC_PROJECT_01/
├── src/
│   └── com/
│       └── jdbc/
│           └── cricketer/
│               ├── model/
│               │   └── Cricketer_Model.java      # POJO class for cricketer data
│               │
│               ├── utils/
│               │   ├── ConnectionUtils.java      # Handles JDBC DB connection
│               │   └── Cricketer.java            # Cricketer class with constructors, getters & setters
│               │
│               └── App.java                      # Main class with CRUD Operations


Feature Descriptions:

1. Insert data into cricketer
Adds a new cricketer’s details into the database.

2. Fetch all data
Retrieves and displays all cricketers.

3. Fetch all data in reverse order
Displays cricketers in reverse insertion order.

4. Fetch data by Id
Fetches a specific cricketer by ID.

5. Update Name
Updates a cricketer's name using basic SQL update logic.

6–9. Procedure-based Operations
Calls MySQL stored procedures to fetch, update, or delete cricketer data by ID.

🛠️ Technologies Used

Java (Core)

JDBC API

MySQL

Stored Procedures (for certain operations)

Console-based interface

🗃️ Database Setup

Execute the following SQL command to create the database:
CREATE DATABASE cricketer;
  
Create Table:
CREATE TABLE `jdbc`.`new_table` (
  `cid` INT NOT NULL AUTO_INCREMENT,
  `cname` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  `age` INT NULL,
  `matches` INT NULL,
  `runs` INT NULL,
  `wickets` INT NULL,
  `catches` INT NULL,
  `mom` INT NULL,
  `avg` DOUBLE NULL,
  PRIMARY KEY (`cid`));
  
Configure Database Connection:
Update the DBConnection.java file with your MySQL credentials:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/cricketerdb";
String username = "your_mysql_username";
String password = "your_mysql_password";
🚀 How to Run
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/Revathi331/JDBC_PROJECT_01.git
Import the Project:

Open your preferred Java IDE (e.g., Eclipse, IntelliJ IDEA).

Import the project as a Java project.

Set Up the Database:

Ensure MySQL is running.

Execute the SQL commands mentioned in the Database Setup section to create the database and table.

Run the Application:

Navigate to CricketerMain.java.

Run the file to start the console-based application.

📋 Features
Add Cricketer: Insert new cricketer details into the database.

Update Cricketer: Modify existing cricketer information.

Delete Cricketer: Remove a cricketer's record from the database.

Display Cricketers: Retrieve and display all cricketer records.

🧑‍💻 Author
Name: Revathi R

GitHub: Revathi331
