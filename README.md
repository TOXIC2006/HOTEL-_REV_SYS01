# HOTEL-_REV_SYS01
# Java Hotel Reservation System (CLI)

This is a simple, command-line interface (CLI) application for managing hotel room reservations. It's built using Java and connects to a MySQL database to perform CRUD (Create, Read, Update, Delete) operations.

## Features

- **Reserve a Room:** Add a new reservation for a guest, including their name, room number, and contact information.
- **View All Reservations:** Display a formatted table of all current reservations in the database.
- **Get Room Number:** Look up a specific room number using the reservation ID and guest name.
- **Update a Reservation:** Modify the details of an existing reservation.
- **Delete a Reservation:** Remove a reservation from the system.

## Technologies Used

- **Language:** Java
- **Database:** MySQL
- **Connector:** MySQL Connector/J (JDBC Driver)

## Prerequisites

Before you begin, ensure you have the following installed on your system:
-   Java Development Kit (JDK) 8 or later
-   MySQL Server
-   An IDE like IntelliJ IDEA or Eclipse (optional, but recommended)

## Setup and Installation

Follow these steps to get the project up and running on your local machine.

### 1. Database Setup

You need to create a database and a table in MySQL for the application to store its data.

1.  Open your MySQL client (e.g., MySQL Workbench, or the command line).
2.  Run the following SQL script to create the `hotel_db` database and the `reservations` table:

    ```sql
    -- Create the database if it doesn't exist
    CREATE DATABASE IF NOT EXISTS hotel_db;

    -- Switch to the new database
    USE hotel_db;

    -- Create the reservations table
    CREATE TABLE reservations (
        reservation_id INT AUTO_INCREMENT PRIMARY KEY,
        guest_name VARCHAR(255) NOT NULL,
        room_number INT NOT NULL,
        contact_number VARCHAR(20) NOT NULL,
        reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    ```

### 2. Configure Database Connection

Open the `hotelreservationsystem.java` file and update the database connection details if they are different from the defaults.

```java
public static final String url = "jdbc:mysql://127.0.0.1:3306/hotel_db";
public static final String user = "root";
public static final String password = "YOUR_MYSQL_PASSWORD"; // <-- CHANGE THIS


Add MySQL Connector/J
This project requires the MySQL JDBC driver to connect to the database.

If using an IDE (IntelliJ/Eclipse): Add the MySQL Connector/J JAR file to your project's build path or library dependencies.

If compiling from the command line: You need to include the JAR in your classpath. You can download it from the official MySQL website.

How to Run the Application
Using the Command Line
Place the MySQL Connector/J JAR file in your project directory. Let's assume the file is named mysql-connector-j-8.x.x.jar.

Navigate to your project's source directory in the terminal.

Compile the Java files. (Replace * with your JAR file name)

For Windows:

Bash

javac -cp ".;mysql-connector-j-8.x.x.jar" *.java

WELCOME TO HOTEL MANAGEMENT SYSTEM
1. Reserve a room
2. View Reservations
3. Get Room Number
4. Update Reservations
5. Delete Reservations
0. Exit
choice option
