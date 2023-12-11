package models;

import java.util.Arrays;
import java.util.LinkedList;

public class Group {
    private String name;
    private String description;
    private String instructor;
    public LinkedList<Lesson> lessons = new LinkedList<>();
    public LinkedList<Student> students = new LinkedList<>();
//
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this./\pol = pol;
//        this.lesson = lesson;
//        this.lessons = lessons;
    public Group() {
    }

    public Group(String name, String description, String instructor, LinkedList<Lesson> lessons, LinkedList<Student> students) {
        this.name = name;
        this.description = description;
        this.instructor = instructor;
        this.lessons = lessons;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public LinkedList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(LinkedList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group: " +
                "name: " + name +
                "description:" + description + '\'' +
                "instructor: " + instructor + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}
