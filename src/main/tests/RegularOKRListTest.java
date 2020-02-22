package main.tests;

import main.model.RegularOKR;
import main.model.OKRList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularOKRListTest {
    OKRList okrList;
    Scanner scanner;
    RegularOKR regularOkr = new RegularOKR();

    @BeforeEach
    public void setup() {
        okrList = new OKRList();
        scanner = new Scanner(System.in);
    }


//    @Test
//    public void uiContinueNoTest(){
//        String yesnotest = "n";
//        assertEquals(false, okrList.uiContinue());
//    }
//
//    @Test
//    public void uiContinueYesTest(){
//        String yesnotest = "y";
//        assertEquals(true, okrList.uiContinue());
//    }

//    @Test
//    public void uiContinueErrortest(){
//        String yesnotest = "gibberish";
//        assertEquals(false, okrList.uiContinue());
//
//    }

    @Test
    public void reportCountOKRsZeroTest(){
        assertEquals(0, okrList.getCountOKRs());
        assertEquals("This team currently has no OKRs", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsTwoTest(){
        assertEquals(0, okrList.getCountOKRs());
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        assertEquals(2, okrList.getCountOKRs());
        assertEquals("The current number of OKRs for this team is 2", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsFiveTest(){
        assertEquals(0, okrList.getCountOKRs());
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        okrList.addToCountOKR();
        assertEquals(5, okrList.getCountOKRs());
        assertEquals("The current number of OKRs for this team is 5", okrList.reportCountOKRs());
    }

    @Test
    public void reportCountOKRsSevenTest(){
        assertEquals(0, okrList.getCountOKRs());
        okrList.addToCountOKR(); //1
        okrList.addToCountOKR(); //2
        okrList.addToCountOKR(); //3
        okrList.addToCountOKR(); //4
        okrList.addToCountOKR(); //5
        okrList.addToCountOKR(); //6
        okrList.addToCountOKR(); //7
        assertEquals(7, okrList.getCountOKRs());
        assertEquals("This team has more than 5 OKRs! \n We recommend no more than 5 at a time.",
                okrList.reportCountOKRs());
    }

    @Test
    public void printTitlesListofOKRsTest() {
        okrList.getListofOKRS().add(regularOkr);
        okrList.addToCountOKR();
        assertEquals(1, okrList.getCountOKRs());
        assertEquals("", okrList.printTitlesListofOKRs().get(0));

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
}
