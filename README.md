# Banking-Application-for-Account-Management-
A simple banking application that allows users to manage bank accounts using Java concepts.   Supports creating accounts, deposit, withdrawal, viewing account details, and updating contact info.   This project demonstrates **Java control structures, arrays, string handling, exception handling, and OOP principles**.
Features

Add single or multiple student records.

Store details including:

Roll Number

Name

Course

Marks

Grade (calculated automatically)

Display student information in a formatted and readable manner.

Modular design with separate methods for input, grade calculation, and display.

Array-based storage of multiple student records.

Basic input validation for marks and user entries.

Technologies Used

Java (JDK 8 or higher)

Scanner class for user input

Arrays to store multiple student objects

OOP concepts: Classes, Encapsulation, Methods

How It Works

The Student class stores individual student information and calculates grades automatically.

The StudentRecordSystem class handles:

Creating multiple student objects.

Inputting student data from the user.

Storing students in an array.

Displaying all student records in a formatted table.

The system is menu-driven and allows the user to input as many students as desired.

Grade Calculation
Marks Range	Grade
90–100	A
80–89	B
70–79	C
60–69	D
<60	F

Note: The grade is calculated automatically when the marks are entered.

Sample Output
--- Task 1: Single Student Records ---
Roll Number: 1
Name       : Alice
Course     : Math
Marks      : 95
Grade      : A
---------------------------

--- Task 2 & Task 3: Multiple Students ---
Enter number of students: 2

Enter details for Student 1
Roll Number: 101
Name: Bob
Course: Science
Marks: 82
Student added successfully!

Enter details for Student 2
Roll Number: 102
Name: Carol
Course: English
Marks: 75
Student added successfully!

--- Student Records ---
Roll Number: 101
Name       : Bob
Course     : Science
Marks      : 82
Grade      : B
---------------------------
Roll Number: 102
Name       : Carol
Course     : English
Marks      : 75
Grade      : C
---------------------------

How to Run

Clone or download the repository.

Compile the Java files:

javac StudentRecordSystem.java


Run the program:

java StudentRecordSystem


Follow the on-screen prompts to input and display student records.
