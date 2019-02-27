//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.SpringBootMybatisDemo.test.controller;

import com.example.SpringBootMybatisDemo.test.entity.Student;
import com.example.SpringBootMybatisDemo.test.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/test"})
public class TestController {
    @Autowired
    TestService service;

    public TestController() {
    }

    @ResponseBody
    @RequestMapping({"/getStudents"})
    public List<Student> getStus() {
        return this.service.getStudents();
    }

    @ResponseBody
    @RequestMapping({"/getInfos"})
    public String getInfos() {
        return "<u>this is demo</u>";
    }
}
