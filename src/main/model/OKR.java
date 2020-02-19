package main.model;

import java.util.Calendar;
import java.util.Date;

public class OKR {
    private Objective objective;
    private KeyResult keyresult;
    private Date startDate;
    private Date endDate;
    private Date todaysDate;

    private String assignedTo;

    public OKR(Date deadline, String name){
        startDate = Calendar.getInstance().getTime();
        todaysDate = Calendar.getInstance().getTime();
        endDate = deadline;
        keyresult.markIncomplete();
        assignedTo = name;

    }

    public OKR() {
        objective.setTitle("");
        keyresult.markIncomplete();
        keyresult.setMetric("");
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        assignedTo = "";
    }

    public void setTitle(String title){
        objective.setTitle(title);
    }

    public void setStartDate(Date date){
        this.startDate = date;
    }

    public void setEndDate(Date date){
        this.endDate = date;
    }

    public void setTodaysDate(){
        this.todaysDate = Calendar.getInstance().getTime();
    }

    public void setAssignedTo(String name){
        this.assignedTo = name;
    }

    public String getTitle(){
        return objective.getTitle();
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public Date getEndDate(){
        return this.getEndDate();
    }

    public Date getTodaysDate(){
        return this.todaysDate;
    }

    public String getAssignedTo(){
        return this.assignedTo;
    }
}
