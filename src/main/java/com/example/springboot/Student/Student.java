package com.example.springboot.Student;
// define class which contains id and name
public class Student {
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
