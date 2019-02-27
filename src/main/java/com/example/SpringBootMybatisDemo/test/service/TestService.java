//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.SpringBootMybatisDemo.test.service;

import com.example.SpringBootMybatisDemo.test.entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    public TestService() {
    }

    public List<Student> getStudents() {
        List<Student> list = new ArrayList();

        for(int i = 0; i < 5; ++i) {
            Student stu = new Student();
            stu.setName("王" + i);
            stu.setNum(i);
            stu.setSex(i % 2 == 0 ? "男" : "女");
            list.add(stu);
        }

        return list;
    }
}
