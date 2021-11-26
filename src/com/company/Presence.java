package com.company;

public class Presence {
    private boolean isPresent;
    private String date;
    public Presence(boolean isPresent, String date) {
        this.isPresent = isPresent;
        this.date = date;
    }
    public boolean getIsPresent() {
        return isPresent;
    }
    public void setIsPresent(boolean isPresent) {

        this.isPresent = isPresent;
    }
    @Override
    public String toString() {
        return "Date: " + this.date + "\nPresence: " + this.isPresent;
    }
}
