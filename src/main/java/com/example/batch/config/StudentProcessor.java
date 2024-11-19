package com.example.batch.config;

import com.example.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        // all business logic goes here
        student.setId(null);
        return student;
    }
}
