package com.company.scholarlyDatabase.controller;

import com.company.scholarlyDatabase.model.Course;
import com.company.scholarlyDatabase.dao.SchoolDao;
import com.company.scholarlyDatabase.model.*;
import com.company.scholarlyDatabase.model.Student;
import com.company.scholarlyDatabase.model.StudentClassCount;
import com.company.scholarlyDatabase.model.TeacherCount;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
@CrossOrigin
public class SchoolController {

    private final SchoolDao dao;

    public SchoolController(SchoolDao dao) {
        this.dao = dao;
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return dao.allStudents();
    }

    @GetMapping("/cs_courses")
    public List<Course> getCSCourses() {
        return dao.csCourses();
    }

    @GetMapping("/teacher_dept_count")
    public List<TeacherCount> teacherDeptCount() {
        return dao.teacherCountByDept();
    }

    @GetMapping("/students_per_class")
    public List<StudentClassCount> studentsPerClass() {
        return dao.studentsPerClass();
    }

    @GetMapping("/addstudent")
    public void addNewStudent() {
        dao.addStudent();
    }

    @GetMapping("/addstudenttoclass")
    public void addNewStudentToClass() {
        dao.addStudentToClass();
    }

}
