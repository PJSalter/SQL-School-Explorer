package com.company.scholarlyDatabase.dao;

import com.company.scholarlyDatabase.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SchoolDaoImpl implements SchoolDao {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public SchoolDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    /*
    * Implementing each SQL query within my methods.
    * The SQL query will be completely inside the quotation marks always
    * in the Java variable such as the example below:
    *   String sql = "";
    *
    * P.S.
    *   - Strings will be inside single quotation marks (' ').
    *   - Strings are always case-sensitive.
    *   - Semi-colons are optional at the end of the SQL statement.
     */
    @Override
    public List<Student> allStudents() {
        // Implementing a query that returns all students (first name, last name only)
        // sorted by last name.
        String sql = "SELECT fName, lName FROM student ORDER BY lName";
        return jdbcTemplate.query(sql, new StudentMapper());
    }
    @Override
    public List<Course> csCourses() {
        // Writing a query that lists the course code and course name
        // for all courses in the Computer Science department.
        String sql = "SELECT * FROM course where courseCode LIKE '%CS%'";
        return jdbcTemplate.query(sql, new CourseMapper());
    }
    @Override
    public List<TeacherCount> teacherCountByDept() {
        //  Implementing  a query that displays the department and the total number of teachers assigned to each department.
        //  Name the aggregate field `teacherCount`.
        String sql = "SELECT dept, COUNT(*) AS teacherCount FROM teacher GROUP BY dept";
        return jdbcTemplate.query(sql, new TeacherCountMapper());
    }
    @Override
    public List<StudentClassCount> studentsPerClass() {
        // Implementing a query that lists the course code and course description for each course,
        // with the number of students enrolled in each course.
        // Name the aggregate field `numStudents`.
        String sql = "SELECT c.courseCode, c.courseDesc, COUNT(cs.student_id) AS numStudents " +
                "FROM course c " +
                "INNER JOIN course_student cs ON c.cid = cs.course_id " +
                "GROUP BY c.courseCode, c.courseDesc";
        return jdbcTemplate.query(sql, new StudentCountMapper());
    }
    // This step includes two parts. Both parts must be completed to pass the test.
    // Create a new student and enroll the new student in a course
     @Override
    public void addStudent() {
        // Part 1: Write a query to add the student Robert Dylan to the student table.
        String sql = "INSERT INTO student (fName, lName) VALUES ('Robert', 'Dylan')";
        System.out.println(jdbcTemplate.update(sql));
    }
    @Override
    public void addStudentToClass() {
        // Part 2: Write a query to add Robert Dylan to CS148.
        String sql = "INSERT INTO course_student (student_id, course_id) " +
                "VALUES ((SELECT student.sid FROM student WHERE fName = 'Robert' AND lName = 'Dylan'), " +
                "(SELECT course.cid FROM course WHERE courseCode = 'CS148'))";
        jdbcTemplate.update(sql);
    }
    @Override
    public void editCourseDescription() {
        // Write a query to change the course description for course CS305 to "Advanced Python with Flask".
        String sql = "UPDATE course SET courseDesc = 'Advanced Python with Flask' WHERE courseCode = 'CS305'";
        jdbcTemplate.update(sql);
    }
    @Override
    public void deleteTeacher() {
        // Write a query to remove David Mitchell as a teacher.
        // Delete the 'teacher' table where the
        // teacher's first name is 'David' and last name is 'Mitchell'
        // all query stays within quotes.
        String sql = "DELETE FROM teacher WHERE tFName = 'David' AND tLName = 'Mitchell'";
        jdbcTemplate.update(sql);
    }
    @Override
    public List<Teacher> listAllTeachers() {
        String sql = "Select * from Teacher;";
        return jdbcTemplate.query(sql, new TeacherMapper());
    }
    @Override
    public List<Student> studentsCS148() {
        String sql = "select fname, lname\n" +
                "from student s \n" +
                "join course_student cs on s.sid = cs.student_id\n" +
                "where course_id = 1;";
        return jdbcTemplate.query(sql, new StudentMapper());
    }
}
