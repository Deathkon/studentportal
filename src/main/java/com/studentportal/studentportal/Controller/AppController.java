package com.studentportal.studentportal.Controller;

import com.studentportal.studentportal.Entity.CourseEntity;
import com.studentportal.studentportal.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    CourseRepository CourseRepository;

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("courses", new CourseEntity());
        model.addAttribute("CoursesList", CourseRepository.findAll());
        return "index";
    }
}
