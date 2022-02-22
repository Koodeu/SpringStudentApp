package com.example.koodev.amigoscode.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;
    @Transient
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(String name,  LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
