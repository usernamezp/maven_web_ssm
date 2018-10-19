package com.baizhi.ssm.test;

import com.baizhi.ssm.entity.Student;
import com.baizhi.ssm.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestA {
    @Test
    public void test1() {
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        StudentService service = (StudentService) con.getBean("studentServiceImpl");
        List<Student> students = service.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
