package com.studentportal.studentportal.Controller; 
import com.studentportal.studentportal.Entity.StudentEntity;
import com.studentportal.studentportal.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping("/Students")
    public String viewStudents(Model model) {
        model.addAttribute("StudentsList", repository.findAll());
        return "Students";
    }

    @PostMapping("/addSt")
    public String addSt(StudentEntity student, Model model) {
        model.addAttribute("student", new StudentEntity());
        repository.save(student);
        return "redirect:/Students";
    }
    // delete the data using the id 

    
    // // Edit
    // @GetMapping("/edit/{id}")
    // public String editStudent(@PathVariable("id") Integer id, Model model) {
    //     model.addAttribute("student", repository.findById(id).get());
    //     return "editStudent";
    // }
}