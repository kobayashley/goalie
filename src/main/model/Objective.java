package main.model;

public class Objective {
    private String title;
    private boolean priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPriority(){
        this.priority=true;
    }

    public boolean isPriority(){
        return this.priority;
    }
}
