package main.model;

import java.util.Calendar;
import java.util.Date;

public class OKR {
    private String title;
    private Date startDate;
    private Date endDate;
    private Date todaysDate;

    private boolean completed;

    private String assignedTo;

    public OKR(Date deadline, String name){
        startDate = Calendar.getInstance().getTime();
        todaysDate = Calendar.getInstance().getTime();
        endDate = deadline;
        completed = false;
        assignedTo = name;

    }

    public OKR() {
        title = "";
        startDate = Calendar.getInstance().getTime();
        endDate = null;
        todaysDate = Calendar.getInstance().getTime();
        completed = false;
        assignedTo = "";
    }

    public void setTitle(String title){
        this.title=title;
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

    public void setCompleted(){
        this.completed = true;
    }

    public void setAssignedTo(String name){
        this.assignedTo = name;
    }

    public String getTitle(){
        return this.title;
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

    public boolean isCompleted(){
        return this.completed;
    }

    public String getAssignedTo(){
        return this.assignedTo;
    }
}
