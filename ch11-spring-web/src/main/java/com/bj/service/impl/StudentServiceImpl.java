package com.bj.service.impl;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums=studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> studentList = studentDao.selectStudent();
        return studentList;
    }
}
