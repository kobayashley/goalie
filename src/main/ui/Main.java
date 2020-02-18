package main.ui;

import main.model.OKR;

import java.util.Calendar;
import java.util.Date;

public class Main {
    //Make a main method that gets things going
    static int OKRCount = 0;

    public static void main(String[] args) {
        System.out.println("getting things goin");

        // todo: let user define a deadline for the task using Calendar/Date classes
        Calendar deadlineCal = Calendar.getInstance();
//        deadlineDate.set(2020, 02, 24);
        deadlineCal.set(Calendar.YEAR, 2020);
        deadlineCal.set(Calendar.MONTH, Calendar.FEBRUARY);
        deadlineCal.set(Calendar.DAY_OF_MONTH, 24);
        Date dateRepresentation = deadlineCal.getTime();

        //Construct an object (Note: this should probably happen within your main method)
        //Pass a parameter
        //Use a local variable
        OKR okr = new OKR(dateRepresentation, "Ashley");
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

