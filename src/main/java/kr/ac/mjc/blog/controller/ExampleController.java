package kr.ac.mjc.blog.controller;

import kr.ac.mjc.blog.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ExampleController {
    @GetMapping("/example")
    public String example(Model model){
        Person examplePerson=new Person();
        examplePerson.setId(2l);
        examplePerson.setName("민원형");
        examplePerson.setAge(23);
        examplePerson.setHobbies(List.of("운동","게임"));

        model.addAttribute("person",examplePerson);
        model.addAttribute("today", LocalDate.now());

        return "example";
    }
}
