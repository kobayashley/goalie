package main.model;

import main.exceptions.EmptyTitleException;

public class Objective {
    private String title;
    private boolean priority;

    public Objective(){
        title = "";
        priority = false;
    }

    //REQUIRES: non-empty title.
    //EFFECTS: returns this title.
    public String getTitle() throws EmptyTitleException {
        if(this.title.isEmpty()){
            throw new EmptyTitleException();
        }
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

    //MODIFIES: this
    //EFFECTS: this updated without priority flag.
    public void setNotPriority(){
        this.priority=false;
    }

    //REQUIRES: non-null priority value (true or false).
    //EFFECTS: returns true if this objective is a priority, false otherwise.
    public boolean isPriority(){
        return this.priority;
    }
}
