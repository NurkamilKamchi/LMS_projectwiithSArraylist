package models;

public class Lesson {
    private long id;
    private String lessonName;
    private int whetitStarts;

    public Lesson() {
    }

    public Lesson(String lessonName, int whetitStarts,int id) {
        this.id = id;
        this.lessonName = lessonName;
        this.whetitStarts = whetitStarts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getWhetitStarts() {
        return whetitStarts;
    }

    public void setWhetitStarts(int whetitStarts) {
        this.whetitStarts = whetitStarts;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                ", whetitStarts=" + whetitStarts +
                '}';
    }
}
