package Service.Impl;

import DataBase.DataBase;
import Service.StudentService;
import models.Gender;
import models.Group;
import models.Lesson;
import models.Student;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    @Override
    public String updateStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if (email.equalsIgnoreCase(student.getEmail())) {
                    System.out.print("Enter new student name: ");
                    String studname = scanner.nextLine();
                    student.setName(studname);
                    while (true) {
                        try {
                            System.out.print("Enter age: ");
                            int age = scannerForNum.nextInt();
                            if (age > 0 ) {
                                student.setAge(age);
                                break;
                            } else {
                                throw new InputMismatchException("Uncorrect age");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    while (true){
                        System.out.print("Enter email: ");
                        String email1 = scanner.nextLine();
                        if (email1.endsWith("@gmail.com")) {
                            student.setEmail(email1);
                            break;
                        } else {
                            System.out.println("Email must contain '@gmail.com'");
                        }
                    }
                    while (true) {
                        System.out.print("Enter gender: ");
                        String gender = scanner.nextLine();
                        if (gender.equalsIgnoreCase("m")) {
                            student.setPol(Gender.MALE);
                            break;
                        } else if (gender.equalsIgnoreCase("f")) {
                            student.setPol(Gender.FEMALE);
                            break;
                        } else {
                            System.out.println("Gender must be M/f");
                        }
                    }
                    return "Successsfully updated!";
                }
            }

        }
        return null;
    }


    @Override
    public void findStudentByStudentFirstname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if (name.equalsIgnoreCase(student.getName())) {
                    System.out.println(student + "\n" +
                            group.getLessons() + "\n" +
                            group.getName() + "\n" +
                            group.getInstructor() + "\n" +
                            group.getDescription());
                    break;
                } else {
                    System.out.println("Uncorrect info!!!");
                }

            }
        }
    }

    @Override
    public LinkedList<Student> getAllStudentsByGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter group name: ");
        String namegr = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if (namegr.equalsIgnoreCase(group.getName())) {
                for (Student student : group.students) {
                    System.out.println(student);

                }
            }
        }
        return null;
    }

    @Override
    public String deleteStudentByEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if (email.equalsIgnoreCase(student.getEmail())) {
                    group.students.remove(student);
                    return "Success deleted!!";
                }
            }
        }
        return null;
    }

    @Override
    public LinkedList<Lesson> getAllStudentsLessons() {
        for (Group group : DataBase.groups) {
            for (Lesson lesson : group.lessons) {
                System.out.println(lesson);
            }
        }
        return null;
    }
}

