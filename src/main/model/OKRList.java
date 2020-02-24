package main.model;

import java.util.ArrayList;
import java.util.Scanner;

public class OKRList {
    int OKRCount = 0;
    ArrayList<OKR> listofOKRS = new ArrayList();
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
        while (true) {
            option = getUIOption();

            if (option.equals("add")) {
                uiAddOption();
                if(!uiContinue()){
                    break;
                }
            }
            if (option.equals("view")) {
                System.out.println("list of current OKRs: ");
                System.out.println(printTitlesListofOKRs());
                if(!uiContinue()){
                    break;
                }
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
    //MODIFIES: title, newOKR, OKRcount, listofOKRS
    //EFFECTS:  creates a new RegularOKR and sets its title to the inputted title, adds this RegularOKR to the listofOKRS in this list
    //          and increments the OKRCount.
    public void uiAddOption() {
        System.out.println("Would you like to add a new Regular RegularOKR [r] or a Moonshot RegularOKR [m]?");
//        String okrType = scanner.next();
        Scanner input = new Scanner(System.in);
        String okrType = input.next();
        if(okrType.equals("r") || okrType.equals("R")){
            RegularOKR newRegularOKR = new RegularOKR();
            System.out.println("Please enter a title for this RegularOKR");
            String title;
            title = scanner.nextLine();
            System.out.println("you entered: " + title);
            newRegularOKR.setTitle(title);
            System.out.println("RegularOKR title has been set.");
            listofOKRS.add(newRegularOKR);
            addToCountOKR();
        } else if (okrType.equals("m") || okrType.equals("M") ) {
            MoonShotOKR newMSOKR = new MoonShotOKR();
            System.out.println("Please enter a title for this MoonshotOKR");
            String title = scanner.nextLine();
            System.out.println("you entered: " +title);
            newMSOKR.setTitle(title);
            System.out.println("MoonshotOKR title has been set");
            listofOKRS.add(newMSOKR);
            addToCountOKR();
        }
    }

    //REQUIRES: param String yesno has received scanner's next
    //EFFECTS: returns true if user has inputted "y", and false if user has inputted "n" or anything else.
    public boolean uiContinue() {
        System.out.println("Continue? y/n");
        Scanner input = new Scanner(System.in);
        String yesno = input.next();
        if (yesno.equals("y") || yesno.equals("Y")) {
            return true;
        } else if (yesno.equals("n") || yesno.equals("N")){
            return false;
        } else {
            System.out.println("error");
            return false;
        }
    }

    //REQUIRES: non-empty listofOKRS.
    //EFFECTS: returns ArrayList of titles of each RegularOKR in the ListofOKRs.
    public ArrayList<String> printTitlesListofOKRs() {
        ArrayList<String> titles = new ArrayList();
        for (int i = 0; i < listofOKRS.size(); i++) {
            titles.add(listofOKRS.get(i).getTitle());
        }
        return titles;
    }

    //REQUIRES: a new RegularOKR instance has been created.
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
        if (getCountOKRs() > 5) {
            return "This team has more than 5 OKRs! \n We recommend no more than 5 at a time.";
        }

        return "The current number of OKRs for this team is " + getCountOKRs();
    }

    //EFFECTs: returns this OKRCount
    public int getOKRCount() {
        return OKRCount;
    }

    //REQUIRES: non-empty listofOKRS
    //EFFECTS: returns this listofOKRS
    public ArrayList<OKR> getListofOKRS() {
        return listofOKRS;
    }

}

