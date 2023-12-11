import Service.Impl.GroupServiceImpl;
import Service.Impl.LessonServiceImpl;
import Service.Impl.StudentServiceImpl;
import Service.Impl.UserServiceImpl;
import models.Group;
import models.Lesson;
import models.Student;
import models.User;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

//import static com.sun.tools.javac.util.Constants.format;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();

        Scanner scanner = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);
        GroupServiceImpl groupService = new GroupServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
       boolean istrue = true;
        while (istrue){
            int correct = LocalTime.now().getHour();
            if (correct >6 && correct < 11){
                System.out.println("************* Good morning ->"+ " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+" *************");
            } else if (correct>=11 && correct<17 ) {
                System.out.println("************* Good day ->"+ " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+" *************");
            } else if (correct>=17 && correct<23) {
                System.out.println("************* Good evening ->"+ " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+" *************");
            }else {
                System.out.println("************* Good night ->"+ " " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+" *************");
            }

            System.out.println("""
                1. log
                2. change passeord
                3. exit
                """);
            switch (scanner.nextLine().toLowerCase()){
                case "1" -> {
                    User login = userService.login(user);
                    if (login == null){
                        System.out.println("Incorrect password or login!!!");
                    } else {
                        System.out.println("Welcome ");
                        while (true) {
                            System.out.println("""
                    1.Add group.
                    2.Get group by name.
                    3.Update group by name.
                    4.Get all groups.
                    5.Add new student to group.
                    6.Add lesson.
                    7.Update student.
                    8.Find student by first name.
                    9.Get all students by group name.
                    10.Delete student email.
                    11.Get all students lesson
                    12.Get lesson by name.
                    13.Get all lesson by group name.
                    14.Delete lesson by id.
                    15.Delete group by name.
                    16.Exit.
                    Enter your choice
                    """);

                            switch (scanner.nextLine()) {
                                case "1" -> {
                                    groupService.addGroup();
                                }
                                case "2" -> {
                                    Group gr = groupService.getGroupByName();
                                    if (gr == null) {
                                        System.out.println("INVALID 3 ");
                                    } else {
                                        System.out.println(gr);
                                    }
                                }
                                case "3" -> {
                                    LinkedList<Group> gg = groupService.updateGroupByName();
                                    if (gg == null) {
                                        System.out.println("Invalidnyi 4 ");
                                    } else {
                                        System.out.println(gg);
                                    }
                                }
                                case "4" -> {
                                    groupService.getAllGroups();
                                }
                                case "5" -> {
                                    Student student1 = groupService.addNewStudentToGroup();
                                    if (student1 == null) {
                                        System.out.println("Invalid 5");
                                    } else {
                                        System.out.println(student1);
                                    }
                                }
                                case "6" -> {
                                    Lesson rr = lessonService.addLesson();
                                    if (rr == null) {
                                        System.out.println("Invalid 7");
                                    } else {
                                        System.out.println(rr);
                                    }
                                }
                                case "7" -> {
                                    String pp = studentService.updateStudent();
                                    if (pp == null) {
                                        System.out.println("Invalid 7");
                                    } else {
                                        System.out.println(pp);
                                    }
                                }
                                case "8" -> {
                                    studentService.findStudentByStudentFirstname();
                                }
                                case "9" -> {
                                    LinkedList<Student> df = studentService.getAllStudentsByGroupName();
                                    if (df == null) {
                                        System.out.println("Uncorrecr info!!!");
                                    } else {
                                        System.out.println(df);
                                    }
                                }
                                case "10" -> {
                                    String df = studentService.deleteStudentByEmail();
                                    if (df == null) {
                                        System.out.println("Uncorrect 10");
                                    } else {
                                        System.out.println(df);
                                    }
                                }
                                case "11" -> {
                                    studentService.getAllStudentsLessons();
                                }
                                case "12" -> {
                                    Lesson gh = lessonService.getLessonByName();
                                    if (gh == null) {
                                        System.err.println("Lesson with this name nit found!!!");
                                    } else {
                                        System.out.println(gh);
                                    }
                                }
                                case "13" -> {
                                    LinkedList<Lesson> ju = lessonService.getAllLessonByGroupName();
                                    if (ju == null) {
                                        System.out.println("Group with this name not found!!!");
                                    } else {
                                        System.out.println(ju);
                                    }
                                }
                                case "14" -> {
                                    String jh = lessonService.deleteLessonById();
                                    if (jh == null) {
                                        System.out.println("Lesson with this id not found!!!");
                                    } else {
                                        System.out.println(jh);
                                    }
                                }
                                case "15" -> {
                                    String gf = groupService.deleteGroupByName();
                                    if (gf == null) {
                                        System.out.println("Group with this name not found!!!");

                                    } else {
                                        System.out.println(gf);
                                    }
                                }case "16"->{
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
                case "2" -> {
                    User password = userService.updatePassword(user);
                    if (password == null){
                        System.out.println("Successfully changed!!!");
                    } else {
                        System.out.println(password);
                    }
                }case "3"->{
                    istrue = false;
                }
            }
        }
    }
}
