package Service.Impl;

import DataBase.DataBase;
import Service.LessonService;
import models.Group;
import models.Lesson;
import models.MyGeneratorId;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class LessonServiceImpl implements LessonService {
    @Override
    public Lesson addLesson() {
        Lesson lesson = new Lesson();
        System.out.print("Enter group: ");
        String name = new Scanner(System.in).nextLine();
        for (Group group : DataBase.groups) {
            if (name.equalsIgnoreCase(group.getName())) {
                lesson.setId(MyGeneratorId.idLesson);
                while (true) {
                    System.out.print("Enter lesson name: ");
                    String lessonName1 = new Scanner(System.in).nextLine();
                    if (lessonName1.isEmpty()) {
                        System.out.println("Empty blank!!!");
                    } else {
                        lesson.setLessonName(lessonName1);
                        break;
                    }
                }
                while (true) {
                    try {
                        System.out.print("Enter when it starts: ");
                        int start = new Scanner(System.in).nextInt();
                        lesson.setWhetitStarts(start);
                        if (start > 0 && start <= 24) {
                            group.lessons.add(lesson);
                            break;
                        } else {
                            System.out.println("Uncorrect time!!!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Uncorrect type( provided int!)");
                        new Scanner(System.in).nextLine();
                    }
                }
                System.out.println("Successfully added!");
                return lesson;
            }
        }
        return null;
    }

    @Override
    public Lesson getLessonByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lesson name: ");
        String namelesson = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Lesson lesson : group.lessons) {
                if (namelesson.equalsIgnoreCase(lesson.getLessonName())) {
                    System.out.println("In this group " + group.getName());
                    return lesson;
                }
            }
        }
        return null;
    }

    @Override
    public LinkedList<Lesson> getAllLessonByGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter group name: ");
        String namegr = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if (namegr.equalsIgnoreCase(group.getName())) {
                return group.lessons;
            }
        }
        return null;
    }

    @Override
    public String deleteLessonById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lesson id: ");
        long id = scanner.nextLong();
        for (Group group : DataBase.groups) {
            group.lessons.removeIf(lesson -> id == lesson.getId());
            return "success";
        }
        return null;
    }
}
