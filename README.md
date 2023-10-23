# SQL School Explorer 📚🔍

### ✨ Explore the SQL School Database!
Welcome to the SQL School Explorer, your ticket to the world of SQL queries for a dynamic school database. This exciting journey is your chance to unravel the hidden gems of student and course information by crafting creative SQL queries.
- For a more detailed understanding on the layout of the database structure and the intriguing data concealed within each table, refer to the ["DATABASE_INFORMATION.md"](https://github.com/PJSalter/SQL-School-Explorer/blob/main/DATABASE_INFORMATION.md) page within the project.

### Your SQL Adventure Kit
In this engaging experience, I've been wielding Java's SQL library to perform your SQL queries. Since you're venturing into the world of Java, there are a few important things to remember:

- SQL statements are encapsulated in double quotation marks (" "). For string values, wrap them in single quotation marks (' ').
- Remember that SQL string values are case-sensitive. 'john smith' is not the same as 'John Smith.'
- Line breaks are obviously ok to use, and something to keep an eye out for is if any unintended formatting changes. Hitting ENTER may add extra characters like additional quotation marks or newline breaks ('/n').
- Ensuring that each line in a multi-line SQL statement ends with a space or '/n'.
- While semi-colons are optional in SQL statements, it's a good practice to include them.
- 🧪The JUnit 5 Java tests evaluate the results of my SQL queries and all have been identified as passing tests. While my SQL syntax has produced the expected outcomes.
- I had fun testing my SQL statements in MySQL Workbench before incorporating them into the Java application.
The full schema and data.sql for the database are stored in the "Resource" folder of my Java project. These resources are great to look closely at the database in MySQL Server when interested.

### Quest Objectives
In my SQL School Explorer adventure, I've embarked on a quest to conquer the following challenges:

1. `allStudents()`: Writing a query that returns all students (first name, last name only) sorted by last name.
2. `CS_Courses()`: Writing a query that lists the course code and course name for all courses in the Computer Science department.
3. `teacherCountByDept()`: Writing a query that displays the department and the total number of teachers assigned to each department. Name the aggregate field "teacherCount".
4. `studentsPerClass()`: Writing a query that lists the course code and course description for each course, with the number of students enrolled in each course.
This step includes two parts that must both be completed to pass the test:

Part 1: `addStudent()`: Writing a query to add the student Robert Dylan to the student table.

Part 2: `addStudentToClass()`: Writing a query to add Robert Dylan to the CS148 class.

Part 3: `editCourseDescription()`: Writing a query to change the course description for course CS305 to "Advanced Python with Flask".

Part 4: `deleteTeacher()`: Writing a query to remove David Mitchell as a teacher.

### Tests Pass 🙌🤩
<img width="532" alt="Screenshot 2023-10-23 at 18 32 01" src="https://github.com/PJSalter/SQL-School-Explorer/assets/45575016/85bd6792-e15c-41bb-8479-6faefc45324d">

### ⭐️🚀Project Completed by [Peter Salter](https://github.com/PJSalter)
