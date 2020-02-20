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
    public void printTitlesListofOKRsTest() {

    }
}
