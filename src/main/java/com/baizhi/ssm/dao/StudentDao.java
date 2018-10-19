package com.baizhi.ssm.dao;

import com.baizhi.ssm.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectAll();//查询全部

    public Student selectOne();//根据id查

    public void update(Student student);//修改

    public void delete(int id);//根据id删除

    public void insert(Student student);//添加

}
