package main.tests;

import main.model.RegularKeyResult;
import main.model.RegularOKR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularOKRTest {
    RegularOKR regularOkr;
    String testTitle;
    String newTitle = "new title";
    Date testDate;
    String team;
    String newTeam;
    RegularKeyResult kr;

    @BeforeEach
    public void setup(){
        regularOkr = new RegularOKR();
        testTitle = "test title";
        testDate = new Date();
        testDate.setTime(3567);
        team = "test team";
        newTeam = "team2";
        kr = new RegularKeyResult();
    }

    @Test
    public void setTitleFromEmptyTest(){
        //check title is empty as initialized
        assertEquals("", regularOkr.getTitle());
        //set title
        regularOkr.setTitle(testTitle);
        //check that title is now set
        assertEquals(testTitle, regularOkr.getTitle());
    }

    @Test
    public void setTitleFromNonEmptyTest(){
        //check title is empty as initialized
        assertEquals("", regularOkr.getTitle());
        //set title
        regularOkr.setTitle(testTitle);
        //check that title is now set
        assertEquals(testTitle, regularOkr.getTitle());
        //set new title
        regularOkr.setTitle(newTitle);
        //check that title is now set to the new title
        assertEquals(newTitle, regularOkr.getTitle());
    }

    @Test
    public void setStartDateTest(){
        //check startDate is initialized to today
        assertEquals(Calendar.getInstance().getTime().toString(), regularOkr.getStartDate().toString());
        //call set start date to test date
        regularOkr.setStartDate(testDate);
        //check that startdate is now test date
        assertEquals(testDate.toString(), regularOkr.getStartDate().toString());
    }

    @Test
    public void setEndDateTest(){
        //check that end date is initialized to null
        assertEquals(null, regularOkr.getEndDate());
        //call set end date to test date
        regularOkr.setEndDate(testDate);
        //check that end date is now test date
        assertEquals(testDate, regularOkr.getEndDate());
    }

    @Test
    public void setTodaysDateTest(){
        //check startDate is initialized to today
        assertEquals(Calendar.getInstance().getTime().toString(), regularOkr.getTodaysDate().toString());
    }

    @Test
    public void setAssignedToFromEmptyTest(){
        //check assignedTo is empty string as initialized
        assertEquals("", regularOkr.getAssignedTo());
        //call set assigned to a team
        regularOkr.setAssignedTo(team);
        //check that assignedTo is now equal to team
        assertEquals(team, regularOkr.getAssignedTo());
    }

    @Test
    public void setAssignedToFromNonEmptyTest(){
        //check assignedTo is empty string as initialized
        assertEquals("", regularOkr.getAssignedTo());
        //call set assigned to a team
        regularOkr.setAssignedTo(team);
        //check that assignedTo is now equal to team
        assertEquals(team, regularOkr.getAssignedTo());
        //call set assigned to a new team
        regularOkr.setAssignedTo(newTeam);
        //check that assignedTo is now equal to new team
        assertEquals(newTeam, regularOkr.getAssignedTo());
    }

    @Test
    public void insertKRNotAlreadyThereTest(){
        //check that keyresults is empty as initialized
        assertTrue(regularOkr.getRegkeyresults().isEmpty());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        regularOkr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(regularOkr.getRegkeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, regularOkr.getRegkeyresults().size());

    }

    @Test
    public void insertKRAlreadyThereTest(){
        //check that keyresults is empty as initialized
        assertTrue(regularOkr.getRegkeyresults().isEmpty());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        regularOkr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(regularOkr.getRegkeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, regularOkr.getRegkeyresults().size());
        //call insertKR to insert the same test KR
        regularOkr.insertKR(kr);
        //check that the second test KR was not added ie it is in keyresults only once
        assertEquals(1, regularOkr.getRegkeyresults().size());
    }

    @Test
    public void containsKRTrueTest(){
        //check that kr is empty as initialized
        assertEquals(0 , regularOkr.getRegkeyresults().size());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        regularOkr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(regularOkr.getRegkeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, regularOkr.getRegkeyresults().size());
        //call containsKR
        //check containsKR correctly returns true
        assertTrue(regularOkr.containsKR(kr));

    }

    @Test
    public void containsKRFalseTest(){
        //check that kr is empty as initialized
        assertTrue(regularOkr.getRegkeyresults().isEmpty());
        //check that keyresults is size 0, empty
        assertEquals(0, regularOkr.getRegkeyresults().size());
        //call containsKR
        //check containsKR correctly returns false
        assertFalse(regularOkr.containsKR(kr));
    }
}
