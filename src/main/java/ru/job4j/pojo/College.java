package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nikita");
        student.setGroup("413");
        student.setCreated(new Date());

        System.out.println(student.getName() + " " + student.getGroup());
    }
}
