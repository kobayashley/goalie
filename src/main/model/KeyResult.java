package main.model;

public class KeyResult {

    private boolean completed;
    private String metric;



    public void markCompleted(){
        this.completed = true;
    }

    public void markIncomplete(){
        this.completed = false;
    }

    public boolean isCompleted(){
        return this.completed;
    }

    public void setMetric(String metric){
        this.metric = metric;
    }

    public String getMetric(){
        return this.metric;
    }
}
