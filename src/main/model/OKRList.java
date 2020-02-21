package main.model;

import java.util.ArrayList;
import java.util.Scanner;

public class OKRList {
    int OKRCount = 0;
    ArrayList<OKR> listofOKRs = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    //EFFECTS: starts the user interaction with this program.
    public void start() {
        System.out.println("say hi");
        UserInput();

        //Calendar deadlineCal = Calendar.getInstance();
//        deadlineDate.set(2020, 02, 24); or
//        deadlineCal.set(Calendar.YEAR, 2020);
//        deadlineCal.set(Calendar.MONTH, Calendar.FEBRUARY);
//        deadlineCal.set(Calendar.DAY_OF_MONTH, 24);
        //Date dateRepresentation = deadlineCal.getTime();

        System.out.println(reportCountOKRs());
    }

    //MODIFIES: this
    //EFFECTS: takes user inputs and adds or prints OKRs, or quits to break.
    public void UserInput() {
        String option = "";
        while (scanner.hasNext()) {
            option = getUIOption();

            if (option.equals("add")) {
                uiAddOption();

                if(!uiContinue()){
                    break;
                }
            }

            if (option.equals("view")) {
                System.out.println("list of current OKRs: ");
                printTitlesListofOKRs();
            }

            if (option.equals("quit")) {
                break;
            }

        }
        System.out.println("Thank you! Good luck!");

    }

    //MODIFIES: option
    //EFFECTS: asks for user to select from a pre-determined menu, and print the feedback for what was selected.
    public String getUIOption() {
        String option;
        System.out.println("Please select an option");
        System.out.println("\n add \n view \n quit");
        option = scanner.nextLine();
        System.out.println("you selected: " + option);
        return option;
    }

    //REQUIRES: user input has selected "add"
    //MODIFIES: title, newOKR, OKRcount, listofOKRs
    //EFFECTS:  creates a new OKR and sets its title to the inputted title, adds this OKR to the listofOKRs in this list
    //          and increments the OKRCount.
    public void uiAddOption() {
        String title;
        OKR newOKR = new OKR();
        System.out.println("Please enter a title for this OKR");
        title = scanner.nextLine();
        System.out.println("you entered: " + title);
        newOKR.setTitle(title);
        System.out.println("OKR title has been set.");
        listofOKRs.add(newOKR);
        addToCountOKR();
    }

    public boolean uiContinue() {
        System.out.println("Continue? y/n");
        String yesno = scanner.next();
        if (yesno == "n"){
            return false;
        } else if (yesno == "y") {
            return true;
        } else {
            System.out.println("error");
            return false;
        }
    }

    //REQUIRES: non-empty listofOKRs.
    //EFFECTS: prints each OKR in the ListofOKRs.
    public void printTitlesListofOKRs() {
        for (int i = 0; i < listofOKRs.size(); i++) {
            System.out.println(listofOKRs.get(i).getTitle());
        }
    }

    //REQUIRES: a new OKR instance has been created.
    //MODIFIES: OKRCount, which tracks the number of OKRs we currently have.
    //EFFECTS: adds one to the OKRCount.
    public void addToCountOKR() {
        OKRCount++;
    }

    //EFFECTS: returns the current number of OKRs.
    public int getCountOKRs(){
        return OKRCount;
    }

    //REQUIRES: OKRCount is >=0
    //EFFECTS: returns a string describing whether this countOKRs
    public String reportCountOKRs(){
        if (getCountOKRs() == 0) {
            return "This team currently has no OKRs";
        }
        if (getCountOKRs() >= 5) {
            return "This team has more than 5 OKRs! \n We recommend no more than 5 at a time.";
        }

        return "The current number of OKRs for this team is " + getCountOKRs();
    }
}

//System.out.println("Continue? y/n");
//        String yesno = scanner.next();
//        if (yesno.equals("n")) {
//        break;
//        } else {
//        option = scanner.next();
//        return;
//        }



