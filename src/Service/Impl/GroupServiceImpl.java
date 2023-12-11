package Service.Impl;

import DataBase.DataBase;
import Service.GroupService;
import models.Gender;
import models.Group;
import models.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class GroupServiceImpl implements GroupService {
    @Override
    public String addGroup() {
        Group group = new Group();
        System.out.print("Enter group name: ");
        String namegroup = new Scanner(System.in).nextLine();
        group.setName(namegroup);
        System.out.print("Enter description: ");
        String descr = new Scanner(System.in).nextLine();
        group.setDescription(descr);
        System.out.print("Enter insturtor: ");
        String instrus = new Scanner(System.in).nextLine();
        group.setDescription(instrus);
        DataBase.groups.add(group);
        System.out.println("Succesfully saved!!!");
        return null;
    }

    @Override
    public Group getGroupByName() {
        System.out.print("Enter group name: ");
        String namegr = new Scanner(System.in).nextLine();
        for (Group group : DataBase.groups) {
            if (namegr.equalsIgnoreCase(group.getName())) {
                return group;
            }
        }
        return null;
    }

    @Override
    public LinkedList<Group> updateGroupByName() {
        System.out.println("Which group name  you want to update? ");
        String namegr = new Scanner(System.in).nextLine();
        for (Group group : DataBase.groups) {
            if (namegr.equalsIgnoreCase(group.getName())) {
                System.out.print("Enter new name: ");
                String newName = new Scanner(System.in).nextLine();
                ;
                group.setName(newName);
                System.out.print("Enter new Description: ");
                String newDescr = new Scanner(System.in).nextLine();
                ;
                group.setName(newDescr);
                System.out.print("Enter new instructor: ");
                String newInstr = new Scanner(System.in).nextLine();
                ;
                group.setName(newInstr);
                return DataBase.groups;

            }
        }
        return null;
    }

    @Override
    public LinkedList<Group> getAllGroups() {
        for (Group group : DataBase.groups) {
            System.out.println(group);
        }

        return DataBase.groups;

    }

    @Override
    public Student addNewStudentToGroup() {
        System.out.print("In whish group you  want to add: ");
        String group = new Scanner(System.in).nextLine();
        Student student = new Student();
        for (Group group1 : DataBase.groups) {
            if (group.equalsIgnoreCase(group1.getName())) {
                System.out.print("Enter name of student: ");
                String name = new Scanner(System.in).nextLine();
                student.setName(name);
                while (true) {
                    System.out.print("Enter email of student: ");
                    String email = new Scanner(System.in).nextLine();
                    if (email.endsWith("@gmail.com") && email.length()>=11 ) {
                        student.setEmail(email);
                        break;
                    } else {
                        System.out.println("Invalid");
                    }
                }
                System.out.print("Enter age of student: ");
                int age = new Scanner(System.in).nextInt();
                student.setAge(age);
                System.out.print("Enter gender of student: ");
                String gender = new Scanner(System.in).nextLine();
                if (gender.equalsIgnoreCase("m")) {
                    student.setPol(Gender.MALE);
                } else if (gender.equalsIgnoreCase("f")) {
                    student.setPol(Gender.FEMALE);
                } else {
                    System.out.println("Uncorrect gender!!!");
                }
                group1.students.add(student);
                System.out.println("Successfully saved student to group!!!");
                return student;
            }
        }
        return null;

    }

    @Override
    public String deleteGroupByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter group name: ");
        String namegr =  scanner.nextLine();
        for (Group group : DataBase.groups) {
            if (namegr.equalsIgnoreCase(group.getName())){
                DataBase.groups.remove(group);
                return "Successfully deleted!";
            }
        }
        return null;
    }
}
