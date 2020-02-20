package main.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class OKR {
    private Objective objective;
    private ArrayList<KeyResult> keyresults;
    private Date startDate;
    private Date endDate;
    private Date todaysDate;

    private String assignedTo;

    //REQUIRES: deadline and team are non-empty values.
    //EFFECTS: this with initialized deadline and assigned team.
    public OKR(Date deadline, String team){
        startDate = Calendar.getInstance().getTime();
        todaysDate = Calendar.getInstance().getTime();
        endDate = deadline;
        for(int i=0; i<keyresults.size(); i++){
            keyresults.get(i).markIncomplete();
        }
        assignedTo = team;

    }

    //EFFECTS: this with initialized null title, metric, endDate, and assigned team, marked incomplete, and setting
    // startDate to be today.
    public OKR() {
        objective.setTitle("");
        for(int i=0; i<keyresults.size(); i++){
            keyresults.get(i).markIncomplete();
        }
        for(int i=0; i<keyresults.size(); i++){
            keyresults.get(i).setMetric("");
        }
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        assignedTo = "";
    }

    //MODIFIES: this
    //EFFECTS: this updated with objective's title.
    public void setTitle(String title){
        objective.setTitle(title);
    }

    //MODIFIES: this
    //EFFECTS: this updated with the OKR's start date.
    public void setStartDate(Date date){
        this.startDate = date;
    }

    //MODIFIES: this
    //EFFECTS: this updated with the OKR's end date.
    public void setEndDate(Date date){
        this.endDate = date;
    }

    //MODIFIES: this
    //EFFECTS: this updated with the OKR's current date.
    public void setTodaysDate(){
        this.todaysDate = Calendar.getInstance().getTime();
    }

    //MODIFIES: this
    //EFFECTS: this updated with OKR's assigned team.
    public void setAssignedTo(String name){
        this.assignedTo = name;
    }

    //REQUIRES: non-empty objective title.
    //EFFECTS: returns objective's title
    public String getTitle(){
        return objective.getTitle();
    }

    //REQUIRES: non-empty OKR start date.
    //EFFECTS: returns this start date.
    public Date getStartDate(){
        return this.startDate;
    }

    //REQUIRES: non-empty end date.
    //EFFECTS: returns this end date.
    public Date getEndDate(){
        return this.getEndDate();
    }

    //REQUIRES: non-empty today's date.
    //EFFECTS: returns today's date.
    public Date getTodaysDate(){
        return this.todaysDate;
    }

    //REQUIRES: non-empty assigned team.
    //EFFECTS: returns the name of the team that is assigned to this.
    public String getAssignedTo(){
        return this.assignedTo;
    }

    //EFFECTS: returns true if this OKR contains kr
    public boolean containsKR(KeyResult kr){
        if(keyresults.contains(kr)){
            return true;
        } else{
            return false;
        }
    }
}
