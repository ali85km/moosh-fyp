package model.forms;

public class Question {

    private int choice;
    private String comment;

    public Question(int choiceIn, String commentIn) {
        this.choice = choiceIn;
        this.comment = commentIn;
    }

    public int getChoice() {
        return this.choice;
    }

    public String getComment() {
        return this.comment;
    }
}
