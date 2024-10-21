package com.example.demo.student;


import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    Student save(Student student);
    Student findByEmail(String email);
    void delete(String email);
    Student update(Student student);
      List<Student> findAllStudents();

}
