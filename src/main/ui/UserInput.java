package main.ui;

import main.model.OKR;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    //take user input
    Scanner scanner = new Scanner(System.in);

    public UserInput(){
        String option = "";
        while (scanner.hasNext()){
            System.out.println("Please select an option");
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
                listofOKRs.addOKR(newOKR);
            }

            if(option.equals("view"));{
                for(int i=0; i<listofOKRs.size(); i++){
                    System.out.println(listofOKRs.get(i));
                }
            }

            else if (option.equals("quit")) {
                break;
            }

        }
        System.out.println("Thank you! Good luck!");

    }

    public static void main(String[] args) {
        new UserInput();
    }

}
