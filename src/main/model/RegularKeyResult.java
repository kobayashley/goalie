package main.model;

public class RegularKeyResult extends KeyResult{

    public RegularKeyResult(){
        completed = false;
        metric = "";
    }


    //REQUIRES: completed is not null
    //MODIFIES: this
    //EFFECTS: marks this as a completed KR, prints message to confirm
    @Override
    public void markCompleted() {
        this.completed = true;
        System.out.println("Congrats! You've completed this KR!");
    }
}
