package com.iqmsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iqmsoft.model.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String sayHello(Model model) {

        List<Person> lijstje = new ArrayList<>();
        lijstje.add(new Person("Test1",64));
        lijstje.add(new Person("Test2", 28));
        lijstje.add(new Person("Test3",49));

        Person p = new Person("Test4",30);

        model.addAttribute("lijstje", lijstje);

        model.addAttribute("message","Spring Boot Mustache Hello World");
        model.addAttribute("person", p);

        model.addAttribute("title","Spring Boot Mustache");

        return "welcome";
    }

}
