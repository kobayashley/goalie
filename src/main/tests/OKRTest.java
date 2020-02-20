package main.tests;

import main.model.OKR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class OKRTest {
    OKR okr;
    String testTitle = "test title";
    String newTitle = "new title";
    Date testDate;
    String team;
    String newTeam;

    @BeforeEach
    public void setup(){
        okr = new OKR();
        testDate = new Date();
        testDate.setTime(3567);
        team = "test team";
        newTeam = "team2";
    }

    @Test
    public void setTitleFromEmptyTest(){
        //check title is empty as initialized
        //set title
        //check that title is now set
    }

    @Test
    public void setTitleFromNonEmptyTest(){
        //check title is empty as initialized
        //set title
        //check that title is now set
        //set new title
        //check that title is now set to the new title
    }

    @Test
    public void setStartDateTest(){
        //check startDate is initialized to today
        //call set start date to test date
        //check that startdate is now test date
    }

    @Test
    public void setEndDateTest(){
        //check that end date is initialized to null
        //call set end date to test date
        //check that end date is now test date
    }

    @Test
    public void setTodaysDateTest(){
        //check startDate is initialized to today
    }

    @Test
    public void setAssignedToFromEmptyTest(){
        //check assignedTo is empty string as initialized
        //call set assigned to a team
        //check that assignedTo is now equal to team
    }

    @Test
    public void setAssignedToFromNonEmptyTest(){
        //check assignedTo is empty string as initialized
        //call set assigned to a team
        //check that assignedTo is now equal to team
        //call set assigned to a new team
        //check that assignedTo is now equal to new team
    }

    @Test
    public void insertKRNotAlreadyThereTest(){
        //check that keyresults is empty as initialized
        //call insertKR to insert a test KR into the arraylist
        //check that keyresults now contains the test KR
        //check that keyresults is size 1

    }

    @Test
    public void insertKRAlreadyThereTest(){
        //check that keyresults is empty as initialized
        //call insertKR to insert a test KR into the arraylist
        //check that keyresults now contains the test KR
        //check that keyresults is size 1
        //call insertKR to insert the same test KR
        //check that the second test KR was not added ie it is in keyresults only once
    }

    @Test
    public void containsKRTrueTest(){
        //check that kr is empty as initialized
        //call insertKR to insert a test KR into the arraylist
        //check that keyresults now contains the test KR
        //check that keyresults is size 1
        //call containsKR
        //check containsKR correctly returns true
    }

    @Test
    public void containsKRFalseTest(){
        //check that kr is empty as initialized
        //check that keyresults is size 0, empty
        //call containsKR
        //check containsKR correctly returns false
    }
}
