package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents()
    {
        return List.of(
                new Student(
                        "Ahmed",
                        "Khiari",
                        LocalDate.now(),
                        "khiari@gmail.com",
                        22
                ),
                new Student(
                        "student3",
                        "barhoum",
                        LocalDate.now(),
                        "Ibrahime@gmail.com",
                        14
                )
        );
    }
}
