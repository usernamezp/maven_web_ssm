package com.baizhi.ssm.service.impl;

import com.baizhi.ssm.dao.StudentDao;
import com.baizhi.ssm.entity.Student;
import com.baizhi.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao dao;

    public List<Student> selectAll() {
        return dao.selectAll();
    }

    public Student selectOne() {
        return dao.selectOne();
    }

    public void update(Student student) {
        dao.update(student);
    }

    public void delete(int id) {
        dao.delete(id);
    }

    public void insert(Student student) {
        dao.insert(student);
    }
}
