package com.example.SpringBootMybatisDemo.Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/indexpage")
    public String indexPage(Model model){
        model.addAttribute("linkurl","http://www.baidu.com");
        return "index";
    }
}
