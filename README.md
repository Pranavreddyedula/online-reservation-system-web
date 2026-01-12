# 🚆 Online Reservation System

A Java-based **Online Reservation System** developed using **Core Java, JDBC, and MySQL**.  
The system allows authenticated users to **log in**, **book train reservations**, **generate PNR numbers**, and **cancel tickets** efficiently.

This project is designed as a **menu-driven console application** and follows a clean modular structure, making it suitable for **college submissions, viva exams, and GitHub portfolios**.

---

## 🔐 Login Credentials (Demo)
Username: admin
Password: admin123

---

## 🛠️ Technologies Used

- **Java (JDK 17+)**
- **JDBC**
- **MySQL**
- **Eclipse IDE**
- **Apache Maven**
- **Apache Tomcat (optional – for web extension)**

---

## ✨ Features

- Secure **Login Authentication**
- **Train Reservation** with auto-generated PNR
- **Ticket Cancellation** using PNR number
- Centralized **MySQL Database**
- Menu-driven, user-friendly interface
- Modular Java classes

---

## 📂 Project Structure
online-reservation-system/
│
├── src/
│ └── com/
│ └── reservation/
│ ├── DBConnection.java
│ ├── Login.java
│ ├── Reservation.java
│ ├── Cancellation.java
│ └── Main.java
│
├── database/
│ └── reservation_system.sql
│
├── README.md
└── .gitignore


---

## 🗄️ Database Schema

### `users` table
```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

reservations table
CREATE TABLE reservations (
    pnr VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    train_no VARCHAR(20),
    class_type VARCHAR(20),
    journey_date DATE,
    from_place VARCHAR(50),
    to_place VARCHAR(50)
);

▶️ How to Run the Project
1️⃣ Clone the Repository
https://pranavreddyedula.github.io/online-reservation-system-web/ 

2️⃣ Open in Eclipse

File → Open Projects from File System

Select the project folder

3️⃣ Configure MySQL

Update credentials in:

DBConnection.java

DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/reservation_system",
    "javauser",
    "your_password"
);

4️⃣ Run the Application

Right-click Main.java

Run As → Java Application

🧪 Sample Output
Login ID: admin
Password: admin123

Login Successful!

=================================
 ONLINE RESERVATION SYSTEM
=================================
1. Make Reservation
2. Cancel Ticket
3. Exit

📸 Screenshots

Add screenshots here after running the project

Login Screen

Reservation Success with PNR

Cancellation Confirmation

/screenshots/login.png
/screenshots/reservation.png
/screenshots/cancellation.png

🎓 Academic Use

Suitable for JNTUK / R20 / R19 / R18

Ideal for DBMS + Java mini project

Covers CRUD operations using JDBC

🚀 Future Enhancements

Web version using Servlets & JSP

Admin dashboard

Train availability check

Payment module

Spring Boot integration

👨‍💻 Author

Sai Pranav Reddy
🎓 Computer Science & Engineering
🔗 GitHub: https://github.com/Pranavreddyedula


📜 License

This project is for educational purposes only.



