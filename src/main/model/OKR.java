package main.model;

import java.util.Calendar;
import java.util.Date;

public class OKR {
    //Make at least one class named appropriately for your application

    private Date startDate;
    private Date endDate;
    private Date todaysDate;

    private boolean completed;

    private String assignedTo;

    public OKR(Date deadline, String name){
        //Declare a field and use it (not necessarily at the same time!)
        startDate = Calendar.getInstance().getTime();
        todaysDate = Calendar.getInstance().getTime();
        endDate = deadline;
        completed = false;
        assignedTo = name;

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
}
