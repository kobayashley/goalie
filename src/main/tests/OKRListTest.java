package main.tests;

import main.model.OKR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class OKRListTest {
    int OKRcount;
    ArrayList<OKR> listofOKRs;
    Scanner scanner;

    @BeforeEach
    public void setup() {
        OKRcount = 0;
        listofOKRs = new ArrayList();
        scanner = new Scanner(System.in);
    }

    @Test
    public void startTest() {

    }

    @Test
    public void UserInputTest() {

    }

    @Test
    public void reportCountOKRsZeroTest(){
        //check that OKRCount is initialized to0
        //check that OKRCount is equal to 0
        //check that reportCountOKRs correctly reports 0
    }

    @Test
    public void reportCountOKRsTwoTest(){
        //check that OKRCount is initialized to 0
        //add OKRs to 2
        //check that OKRCount is equal to 2
        //check that reportCountOKRs correctly reports 2
    }

    @Test
    public void reportCountOKRsFiveTest(){
        //check that OKRCount is initialized to 0
        //add OKRs to 5
        //check that OKRCount is equal to 5
        //check that reportCountOKRs correctly reports 5
    }

    @Test
    public void reportCountOKRsSevenTest(){
        //check that OKRCount is initialized to 0
        //add OKRs to 7
        //check that OKRCount is equal to 7
        //check that reportCountOKRs correctly reports 7
    }

    @Test
    public void printTitlesListofOKRsTest() {
        //listofOKR has one OKR
        //check that size of listofOKR is 1
        //call method
        //check that what was printed is what we wanted to print
    }
}
