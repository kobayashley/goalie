package main.ui;

import main.model.OKR;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static int OKRCount = 0;
    static ArrayList<OKR> listofOKRs = new ArrayList();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("getting things goin");
        UserInput();

        Calendar deadlineCal = Calendar.getInstance();
//        deadlineDate.set(2020, 02, 24); or
//        deadlineCal.set(Calendar.YEAR, 2020);
//        deadlineCal.set(Calendar.MONTH, Calendar.FEBRUARY);
//        deadlineCal.set(Calendar.DAY_OF_MONTH, 24);
        Date dateRepresentation = deadlineCal.getTime();


        OKR okr = new OKR(dateRepresentation, "Ashley");
        addOKR();
        listofOKRs.add(okr);

        if(countOKRs() == 0){
            System.out.println("This team currently has no OKRs");
        }
        if(countOKRs() >= 5){
            System.out.println("This team has more than 5 OKRs! \n We recommend no more than 5 at a time.");
        }

        System.out.println("The current number of OKRs for this team is " + countOKRs());
    }

    public static void UserInput(){
        String option = ""; 
        while (scanner.hasNext()){
            System.out.println("Please select an option");
            System.out.println("\n add \n view \n quit");
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

                System.out.println("Continue? y/n");
                if(option.equals("n")){
                    break;
                }
                else{
                    option = scanner.nextLine();
                }
            }

            if(option.equals("view")){
                System.out.println("list of current OKRs: ");
                printTitlesListofOKRs();
            }
            if (option.equals("quit")){
                break;
            }

        }
        System.out.println("Thank you! Good luck!");

    }

    public static void printTitlesListofOKRs() {
        for(int i=0; i<listofOKRs.size(); i++){
            System.out.println(listofOKRs.get(i).getTitle());
        }
    }

    public static void addOKR(){
        OKRCount++;
    }

    public static int countOKRs(){
        return OKRCount;
    }

}

