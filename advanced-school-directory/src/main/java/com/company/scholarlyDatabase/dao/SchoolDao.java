package com.company.database.dao;

import com.company.database.model.*;
import com.wileyedge.database.model.*;
import java.util.List;

public interface SchoolDao {
    List<Student> allStudents();
    List<Student> studentsCS148();
    List<Course> csCourses();
    List<TeacherCount> teacherCountByDept();
    List<StudentClassCount> studentsPerClass();
    List<Teacher> listAllTeachers();
    void addStudent();
    void addStudentToClass();
    void editCourseDescription();
    void deleteTeacher();
}
