package IntroToOOP;

public class Exam {
    private int id;
    private int score;

    public Exam(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Exam(Exam OriginalExam) {
        this.id = OriginalExam.id;
        this.score = OriginalExam.score;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
