package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InMemerieStudentService implements StudentService{
    private final InMemorieStudentDAO dao;

    public InMemerieStudentService(InMemorieStudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public void delete(String email) {
   dao.delete(email);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }
}
