package main.ui;

import main.model.OKR;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
    //Make a main method that gets things going
    static int OKRCount = 0;
    static ArrayList<OKR> listofOKRs = new ArrayList();
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("getting things goin");

        Calendar deadlineCal = Calendar.getInstance();
//        deadlineDate.set(2020, 02, 24); or
//        deadlineCal.set(Calendar.YEAR, 2020);
//        deadlineCal.set(Calendar.MONTH, Calendar.FEBRUARY);
//        deadlineCal.set(Calendar.DAY_OF_MONTH, 24);
        Date dateRepresentation = deadlineCal.getTime();

        //Construct an object (Note: this should probably happen within your main method)
        //Pass a parameter
        //Use a local variable
        OKR okr = new OKR(dateRepresentation, "Ashley");
        addOKR();
        listofOKRs.add(okr);
        
        //Use a condition, and a loop
        if(countOKRs() == 0){
            System.out.println("This team currently has no OKRs");
        }

        if(countOKRs() >= 5){
            System.out.println("This team has more than 5 OKRs! \n We recommend no more than 5 at a time.");
        }
        //use a local variable (loop variable)
        for(int i=0; i<listofOKRs.size(); i++){
            System.out.println(listofOKRs.get(i));
        }

        //Return a value and use it
        System.out.println("The current number of OKRs for this team is " + countOKRs());

        defineOKR();
        updateProgress();
    }

    //take user input
    public void UserInput(){
        String option = "";
        while (scanner.hasNext()){
            System.out.println("Please select an option");
            System.out.println("add \n view \n quit");
            option = scanner.nextLine();
            System.out.println("you selected: "+option);

            if (option.equals("add")) {
                String title;
                OKR newOKR = new OKR();
                System.out.println("Please enter a title for this OKR");
                title = scanner.nextLine();
                System.out.println("you entered: " +title);
                newOKR.setTitle(title);
                System.out.println("OKR title has been set.");
                listofOKRs.add(newOKR);
                addOKR();
            }

            if(option.equals("view"));{
                for(int i=0; i<listofOKRs.size(); i++){
                    System.out.println(listofOKRs.get(i));
                }
            }

            if (option.equals("quit")){
                break;
            }

        }
        System.out.println("Thank you! Good luck!");

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

