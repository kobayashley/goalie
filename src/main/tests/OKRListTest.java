package main.tests;

import main.model.OKR;
import main.model.OKRList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OKRListTest {
    OKRList okrList;
    Scanner scanner;
    OKR okr = new OKR();

    @BeforeEach
    public void setup() {
        okrList = new OKRList();
        scanner = new Scanner(System.in);
    }

//    @Test
//    public void startTest() {
//
//    }
//
//    @Test
//    public void UserInputTest() {
//
//    }

    @Test
    public void reportCountOKRsZeroTest(){
        //check that OKRCount is initialized to0
        //check that OKRCount is equal to 0
        assertEquals(0, okrList.getCountOKRs());
        //check that reportCountOKRs correctly reports 0
        assertEquals("This team currently has no OKRs", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsTwoTest(){
        //check that OKRCount is initialized to 0
        assertEquals(0, okrList.getCountOKRs());
        //add OKRs to 2
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        //check that OKRCount is equal to 2
        assertEquals(2, okrList.getCountOKRs());
        //check that reportCountOKRs correctly reports 2
        assertEquals("The current number of OKRs for this team is 2", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsFiveTest(){
        //check that OKRCount is initialized to 0
        assertEquals(0, okrList.getCountOKRs());
        //add OKRs to 5
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        //check that OKRCount is equal to 5
        assertEquals(5, okrList.getCountOKRs());
        //check that reportCountOKRs correctly reports 5
        assertEquals("The current number of OKRs for this team is 5", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsSevenTest(){
        //check that OKRCount is initialized to 0
        assertEquals(0, okrList.getCountOKRs());
        //add OKRs to 7
        okrList.addToCountOKR(); //1
        okrList.addToCountOKR(); //2
        okrList.addToCountOKR(); //3
        okrList.addToCountOKR(); //4
        okrList.addToCountOKR(); //5
        okrList.addToCountOKR(); //6
        okrList.addToCountOKR(); //7
        //check that OKRCount is equal to 7
        assertEquals(7, okrList.getCountOKRs());
        //check that reportCountOKRs correctly reports 7
        assertEquals("This team has more than 5 OKRs! \n We recommend no more than 5 at a time.",
                okrList.reportCountOKRs());
    }

    @Test
    public void printTitlesListofOKRsTest() {
        //listofOKR has one OKR
        okrList.getListofOKRs().add(okr);
        okrList.addToCountOKR();
        //check that size of listofOKR is 1
        assertEquals(1, okrList.getCountOKRs());
        //call method
        //check that what was printed is what we wanted to print
        assertEquals("", okrList.printTitlesListofOKRs().get(0));

    }
}
