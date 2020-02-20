package main.model;

public class Objective {
    private String title;
    private boolean priority;

    public Objective(){
        title = "";
        priority = false;
    }

    //REQUIRES: non-empty title.
    //EFFECTS: returns this title.
    public String getTitle() {
        return title;
    }

    //MODIFIES: this
    //EFFECTS: this updated with title.
    public void setTitle(String title) {
        this.title = title;
    }

    //MODIFIES: this
    //EFFECTS: this updated with priority flag.
    public void setPriority(){
        this.priority=true;
    }

    //REQUIRES: non-null priority value (true or false).
    //EFFECTS: returns true if this objective is a priority, false otherwise.
    public boolean isPriority(){
        return this.priority;
    }
}
