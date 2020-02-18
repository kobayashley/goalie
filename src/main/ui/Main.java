package main.ui;

import main.model.OKR;

import java.util.Calendar;
import java.util.Date;

public class Main {
    //Make a main method that gets things going

    public static void main(String[] args) {
        System.out.println("getting things goin");
        Calendar deadline1 = new Calendar();
        long deadline1Time = deadline1.getTimeInMillis();
        Date deadlineDate = new Date(deadline1Time);

        //Construct an object (Note: this should probably happen within your main method)
        //Pass a parameter
        //Use a local variable
        OKR okr = new OKR(deadlineDate, "Ashley");

        defineOKR();
        updateProgress();
    }

    public static void defineOKR() {
        System.out.println("this is a new OKR!");
    }

    public static void updateProgress(){
        System.out.println("this OKR status updated");
    }
}

//ask Noa: Date is deprecated, how to convert between Calendar object and Date object
//also if passing a parameter in the constructor is also an example of a local variable,
// can this count for both requirements as met?