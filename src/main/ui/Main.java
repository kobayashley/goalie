package main.ui;

import main.model.OKR;

import java.util.Calendar;
import java.util.Date;

public class Main {
    //Make a main method that gets things going
    static int OKRCount = 0;

    public static void main(String[] args) {
        System.out.println("getting things goin");
        Calendar deadline1 = new Calendar();
        long deadline1Time = deadline1.getTimeInMillis();
        Date deadlineDate = new Date(deadline1Time);

        //Construct an object (Note: this should probably happen within your main method)
        //Pass a parameter
        //Use a local variable
        OKR okr = new OKR(deadlineDate, "Ashley");
        addOKR();
        //Use a condition, and a loop
        if(countOKRs() == 0){
            System.out.println("This team currently has no OKRs");
        }

        if(countOKRs() >= 5){
            System.out.println("This team has more than 5 OKRs! \n We recommend no more than 5 at a time.");
        }

        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        //Return a value and use it
        System.out.println("The current number of OKRs for this team is " + countOKRs());

        defineOKR();
        updateProgress();
    }

    public static void addOKR(){
        OKRCount++;
    }

    public static int countOKRs(){
        return OKRCount;
    }

    public static void defineOKR() {
        System.out.println("this is a new OKR!");
    }

    public static void updateProgress(){
        System.out.println("this OKR status updated");
    }
}

