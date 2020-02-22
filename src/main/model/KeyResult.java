package main.model;

public abstract class KeyResult {
    boolean completed;
    String metric;



    //MODIFIES: this
    //EFFECTS: this updated with completed flag.
    abstract void markCompleted();


    //MODIFIES: this
    //EFFECTS: this updated with incompleted flag.
    public void markIncomplete(){
        this.completed = false;
    }

    //REQUIRES: non-null completed value (true or false).
    //EFFECTS: returns true if this key result is marked as completed, false if it is marked as incomplete.
    public boolean isCompleted(){
        return this.completed;
    }

    //MODIFIES: this
    //EFFECTS: this updated with metric.
    public void setMetric(String metric){
        this.metric = metric;
    }

    //REQUIRES: non-empty metric.
    //EFFECTS: returns this key result's metric.
    public String getMetric(){
        return this.metric;
    }

}
