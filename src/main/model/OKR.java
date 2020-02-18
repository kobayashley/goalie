package main.model;

import java.util.Calendar;
import java.util.Date;

public class OKR {

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
}
