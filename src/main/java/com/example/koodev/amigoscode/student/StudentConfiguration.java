package com.example.koodev.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student adam = new Student("Adam", LocalDate.of(1981, 12, 12), "adam@wp.pl");
            Student iza = new Student("iza", LocalDate.of(1992, 12, 5), "iza@wp.pl");
            studentRepository.saveAll(List.of(adam, iza));
        };

    }


}
