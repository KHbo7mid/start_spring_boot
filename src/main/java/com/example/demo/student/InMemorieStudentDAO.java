package com.example.demo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemorieStudentDAO {
    private List<Student> students=new ArrayList<Student>();

    public Student save(Student student) {
         students.add(student);
         return student;
    }
    public List<Student> findAllStudents() {
        return students;
    }

    public Student findByEmail(String email) {
        return students.stream().
                filter(student -> student.getEmail().equals(email)).
                findFirst().
                orElse(null);
    }


    public void delete(String email) {
            var student=findByEmail(email);
            if(student!=null) {
                students.remove(student);
            }
    }


    public Student update(Student student) {
        var studentIndex= IntStream.range(0,students.size())
                .filter(index->students.get(index).getEmail()
                        .equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1)
        {
            students.set(studentIndex,student);
            return student;
        }

        return null;
    }

}
