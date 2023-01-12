package com.example.springboot.Student;

import jakarta.persistence.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

// define class which contains id and name
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student-sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;

    public Student() {
    }
// constructor with id
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    // constructor without id
    public Student(String name) {
        this.name = name;
    }
// Getter and setter for all
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
