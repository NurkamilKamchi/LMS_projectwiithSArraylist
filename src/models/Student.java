package models;

import java.util.LinkedList;

public class Student {
    private String name;
    private int age;
    private String email;
    private Gender pol;
//    private Lesson lesson;
//    public LinkedList<Lesson> lessons = new LinkedList<>();

    public Student() {
    }

    public Student(String name, int age, String email, Gender pol) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.pol = pol;
//        this.lesson = lesson;
//        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getPol() {
        return pol;
    }

    public void setPol(Gender pol) {
        this.pol = pol;
    }

//    public Lesson getLesson() {
//        return lesson;
//    }

//    public void setLesson(Lesson lesson) {
//        this.lesson = lesson;
//    }
//
//    public LinkedList<Lesson> getLessons() {
//        return lessons;
//    }
//
//    public void setLessons(LinkedList<Lesson> lessons) {
//        this.lessons = lessons;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", pol=" + pol +
                '}';
    }
}
