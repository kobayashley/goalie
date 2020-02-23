package main.model;

import main.exceptions.EmptyTitleException;

import java.util.Calendar;
import java.util.Date;

public abstract class OKR {
    Objective objective;
    Date startDate;
    Date endDate;
    Date todaysDate;
    String assignedTo;


    //MODIFIES: this
    //EFFECTS: this updated with objective's title.
    public void setTitle(String title){
        objective.setTitle(title);
    }

    //MODIFIES: this
    //EFFECTS: this updated with the RegularOKR's start date.
    public void setStartDate(Date date){
        this.startDate = date;
    }

    //MODIFIES: this
    //EFFECTS: this updated with the RegularOKR's end date.
    public void setEndDate(Date date){
        this.endDate = date;
    }

    //MODIFIES: this
    //EFFECTS: this updated with the RegularOKR's current date.
    public void setTodaysDate(){
        this.todaysDate = Calendar.getInstance().getTime();
    }

    //MODIFIES: this
    //EFFECTS: this updated with RegularOKR's assigned team.
    public void setAssignedTo(String team){
        this.assignedTo = team;
    }

    //REQUIRES: non-null Objective
    //EFFECTS: returns this Objective
    public Objective getObjective() {
        return objective;
    }

    //REQUIRES: non-empty objective title.
    //EFFECTS: returns objective's title
    public String getTitle(){
        String title = "";
        try {
           title = objective.getTitle();
        } catch (EmptyTitleException e) {
            e.printStackTrace();
            System.out.println("Title is empty");
        }
        return title;
    }

    //REQUIRES: non-empty RegularOKR start date.
    //EFFECTS: returns this start date.
    public Date getStartDate(){
        return this.startDate;
    }

    //REQUIRES: non-empty end date.
    //EFFECTS: returns this end date.
    public Date getEndDate(){
        return this.endDate;
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
}
