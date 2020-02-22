package main.model;

import java.util.ArrayList;

public class MoonShotKR {
    //Moonshots are stretch-goals in the form of Key Results, towards an overall Objective

    private boolean wellPositioned;
    private boolean extraResources;
    private ArrayList<String> milestones;

    
    public void setWellPositioned(boolean b){
        this.wellPositioned = b;
    }

    public void setExtraResources(boolean b){
        this.extraResources = b;
    }

    public void addMilestone(String m){
        this.milestones.add(m);
    }

    public boolean isWellPositioned(){
        return this.wellPositioned;
    }

    public boolean isExtraResources(){
        return this.extraResources;
    }

    public String getMilestone(int i){
        return this.milestones.get(i);
    }
}
