# JDBC_PROJECT_01

This is a Cricketer database connected JDBC program

This Java-based application manages cricketer information using JDBC (Java Database Connectivity). It allows users to perform CRUD (Create, Read, Update, Delete) operations on a MySQL database through a console-based interface.

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

Software Required:

Eclipse Developer Tool
MySQL

🗃️ Database Setup

Execute the following SQL command to create the database:
CREATE DATABASE jdbc;
  
Create Table:
CREATE TABLE `jdbc`.`cricketer` (
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
  
create stored procedures in MySQL workbench:

1. For deleteById execute the below stored procedure

CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteById`(id int)
BEGIN
delete from cricketer where cid=id;
END

2. For fetch execute the below stored procedure

CREATE DEFINER=`root`@`localhost` PROCEDURE `fetch`()
BEGIN
select * from cricketer;
END

3. For fetchbyid execute the below stored procedure

CREATE DEFINER=`root`@`localhost` PROCEDURE `fetchbyid`(id int)
BEGIN
select * from cricketer where cid=id;
END

3. For updateName execute the below stored procedure

CREATE DEFINER=`root`@`localhost` PROCEDURE `updateName`( id int, name varchar(10))
BEGIN
update cricketer set cname=name where cid=id;
END

Update the ConnectionUtils.java file with your MySQL credentials:

String url = "jdbc:mysql://localhost:3306/jdbc";
String username = "your_mysql_username";
String password = "your_mysql_password";


🚀 How to Run

Clone the Repository:
git clone https://github.com/Revathi331/JDBC_PROJECT_01.git
Import the Project
Open your Java IDE (preferably Eclipse).
Set Up the Database
Ensure MySQL is running.
Execute the SQL commands mentioned in the Database Setup section to create the database and table.
Run the Application:
Navigate to App.java.

Run the file to start the console-based application.


🧑‍💻 Author
Name: Revathi M
GitHub: https://github.com/Revathi331
