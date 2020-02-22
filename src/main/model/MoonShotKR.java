package main.model;

import java.util.ArrayList;

public class MoonShotKR extends KeyResult {
    //Moonshots are stretch-goals in the form of Key Results, towards an overall Objective

    private boolean wellPositioned;
    private boolean extraResourcesAvailable;
    private ArrayList<String> milestones;

    //MODIFIES: this
    //EFFECTS: sets this wellPositioned to true or false, given as param.
    public void setWellPositioned(boolean b){
        this.wellPositioned = b;
    }

    //MODIFIES: this
    //EFFECTS: sets this extraResourcesAvailable to true or false, given as param.
    public void setExtraResources(boolean b){
        this.extraResourcesAvailable = b;
    }

    //REQUIRES: non-empty, valid String describing a milestone
    //MODIFIES: this
    //EFFECTS: adds m to this list of milestones
    public void addMilestone(String m){
        this.milestones.add(m);
    }

    //REQUIRES: wellPositioned is not null
    //EFFECTS: returns whether this moonshot is well-positioned
    public boolean isWellPositioned(){
        return this.wellPositioned;
    }

    //REQUIRES: extraResourcesAvailable is not null
    //EFFECTS: returns whether there are extra resources available to accomplish this moonshot
    public boolean isExtraResourcesAvailable(){
        return this.extraResourcesAvailable;
    }

    //REQUIRES: non-empty list of milestones
    //EFFECTS: returns the milestone at index i
    public String getMilestone(int i){
        return this.milestones.get(i);
    }

    //REQUIRES: completed is not null
    //MODIFIES: this
    //EFFECTS: marks this as a completed KR, prints message to confirm
    @Override
    void markCompleted() {
        this.completed = true;
        System.out.println("Wow! You reached the moon with this one!");
    }
}
