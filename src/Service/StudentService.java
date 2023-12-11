package Service;

import models.Lesson;
import models.Student;

import java.util.LinkedList;

public interface StudentService {

    String updateStudent();

    void findStudentByStudentFirstname();

    LinkedList<Student> getAllStudentsByGroupName();

    String deleteStudentByEmail();

    LinkedList<Lesson>getAllStudentsLessons();
}
