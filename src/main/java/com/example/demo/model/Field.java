package com.example.demo.model;

public class Field {
    private int score1;
    private int score2;
    private int score3;
    private int score4;

    public Field(int score1, int score2, int score3, int score4) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public String assignCategory(boolean art, boolean practical) {
        if (art && !practical) {
            return "humanities";
        } else if (art && practical) {
            return "social science";
        } else if (!art && !practical) {
            return "science";
        } else {
            return "applied science";
        }
    }

    private boolean isArts(int score1, int score2) {
        if (score1 + score2 <= 6) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isPractical(int score3, int score4) {
        if (score3 + score4 <= 6) {
            return true;
        } else {
            return false;
        }
    }

    //GETTERS
    public int getScore1() {
        return this.score1;
    }

    public int getScore2() {
        return this.score2;
    }

    public int getScore3() {
        return this.score3;
    }

    public int getScore4() {
        return this.score4;
    }

    public boolean getIsArts() {
        return this.isArts(score1,score2);
    }

    public boolean getIsPractical() {
        return this.isArts(score3,score4);
    }
}
