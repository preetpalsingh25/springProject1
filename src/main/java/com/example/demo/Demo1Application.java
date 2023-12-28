package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @GetMapping
    public List<Student> hello()
    {
//        Long id,String name,Integer age,LocalDate dob,String email
        return List.of(
                new Student(
                        1L,
                        "preet pal",
                        23,
                        LocalDate.of(2001, Month.AUGUST,4),
                        "palpreet25@gmail.com"
                )
        );
    }

}
