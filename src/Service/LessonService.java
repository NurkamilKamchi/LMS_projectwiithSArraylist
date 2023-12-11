package Service;

import models.Lesson;

import java.util.LinkedList;

public interface LessonService {
    Lesson addLesson();

    Lesson getLessonByName();

    LinkedList<Lesson> getAllLessonByGroupName();

    String deleteLessonById();
}
