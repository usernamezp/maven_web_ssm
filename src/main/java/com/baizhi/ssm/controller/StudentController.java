package com.baizhi.ssm.controller;

import com.baizhi.ssm.entity.Student;
import com.baizhi.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<Student> getAll() {
        return service.selectAll();
    }




}
