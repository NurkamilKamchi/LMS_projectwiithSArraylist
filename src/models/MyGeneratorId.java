package models;

public class MyGeneratorId {
    public static long idLesson=4;
    public static long LibraryId(){
        return ++idLesson;
    }
}
