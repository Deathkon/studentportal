package com.studentportal.studentportal.Controller;

import com.studentportal.studentportal.Entity.CourseEntity;
import com.studentportal.studentportal.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository repository;
    @GetMapping("/Courses")
    public String viewCourse(Model model){
        model.addAttribute("CoursesList",repository.findAll());
        return "Courses";
    }

    @PostMapping("/coadd")
    public String coadd(CourseEntity course, Model model){
        model.addAttribute("course",new CourseEntity());
        repository.save(course);
        return "redirect:/Courses";
    }

    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/Courses";
    }

    @GetMapping("/edit/{id}")
    public String editCourse(@PathVariable("id") Integer id, Model model){
        model.addAttribute("course", repository.findById(id).get());
        return"editCourse";
    }

}

