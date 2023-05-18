package com.ua.robot.springbootproject.service;

import com.ua.robot.springbootproject.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    public List<Student> findAll() {
        return List.of(
                new Student("Ihor", 20, 15),
                new Student("Maryna", 21, 16),
                new Student("Andriy", 22, 15),
                new Student("Olena", 23, 15),
                new Student("Serhiy", 24, 16)
        );
    }
}
