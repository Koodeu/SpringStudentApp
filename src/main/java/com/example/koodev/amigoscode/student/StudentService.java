package com.example.koodev.amigoscode.student;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {



    public List<Student> getStudents() {
        return List.of(new Student(
                "Adam",
                21,
                LocalDate.of(2001, 12, 01),
                "adam@gmail.com"), new Student(
                "Mateusz",
                24,
                LocalDate.of(1982, Month.JANUARY, 04),
                "matt@wp.pl"
        ));


    }
}
