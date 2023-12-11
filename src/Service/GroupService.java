package Service;

import models.Group;
import models.Lesson;
import models.Student;

import java.util.LinkedList;

public interface GroupService {
    String addGroup();

    Group getGroupByName();

    LinkedList<Group> updateGroupByName();

    LinkedList<Group> getAllGroups();

    Student addNewStudentToGroup();


    String deleteGroupByName();
}
