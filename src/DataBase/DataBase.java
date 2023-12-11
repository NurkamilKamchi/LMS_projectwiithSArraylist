package DataBase;

import models.Gender;
import models.Group;
import models.Lesson;
import models.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
  static Lesson lesson = new Lesson("Java",15, 1);
  static Lesson lesson2 = new Lesson("English",12,2);
  static Lesson lesson3 = new Lesson("sOFTsKILL",11,3);
  static Lesson lesson4 = new Lesson("Typing",17,4);
  static LinkedList<Lesson> lessons = new LinkedList<>(List.of(lesson,lesson2));
  static LinkedList<Lesson> lessons1 = new LinkedList<>(List.of(lesson3,lesson4));
  static Student student = new Student("Nurkammil",22,"n@gmail.com", Gender.MALE);
  static Student student2 = new Student("Nurislam",25,"nurislam@gmail.com", Gender.MALE);
  static Student student3 = new Student("Gulimkan",20,"g@gmail.com", Gender.FEMALE);
  static Student student4 = new Student("Mirlan",20,"m@gmail.com", Gender.MALE);
  static LinkedList<Student>students = new LinkedList<>(List.of(student,student2));
  static LinkedList<Student>students2 = new LinkedList<>(List.of(student3,student4));
  static Group group = new Group("Java-12","Back","Muhammed",lessons,students);
  static Group group2 = new Group("Java-11","Backend","Ulan",lessons1,students2);
    public static LinkedList<Group> groups = new LinkedList<>(List.of(group,group2));
}
