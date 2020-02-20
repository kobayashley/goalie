package main.tests;

import main.model.KeyResult;
import main.model.OKR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OKRTest {
    OKR okr;
    String testTitle;
    String newTitle = "new title";
    Date testDate;
    String team;
    String newTeam;
    KeyResult kr;

    @BeforeEach
    public void setup(){
        okr = new OKR();
        testTitle = "test title";
        testDate = new Date();
        testDate.setTime(3567);
        team = "test team";
        newTeam = "team2";
        kr = new KeyResult();
    }

    @Test
    public void setTitleFromEmptyTest(){
        //check title is empty as initialized
        assertEquals("", okr.getTitle());
        //set title
        okr.setTitle(testTitle);
        //check that title is now set
        assertEquals(testTitle, okr.getTitle());
    }

    @Test
    public void setTitleFromNonEmptyTest(){
        //check title is empty as initialized
        assertEquals("", okr.getTitle());
        //set title
        okr.setTitle(testTitle);
        //check that title is now set
        assertEquals(testTitle, okr.getTitle());
        //set new title
        okr.setTitle(newTitle);
        //check that title is now set to the new title
        assertEquals(newTitle, okr.getTitle());
    }

    @Test
    public void setStartDateTest(){
        //check startDate is initialized to today
        assertEquals(Calendar.getInstance().getTime().toString(), okr.getStartDate().toString());
        //call set start date to test date
        okr.setStartDate(testDate);
        //check that startdate is now test date
        assertEquals(testDate.toString(), okr.getStartDate().toString());
    }

    @Test
    public void setEndDateTest(){
        //check that end date is initialized to null
        assertEquals(null, okr.getEndDate());
        //call set end date to test date
        okr.setEndDate(testDate);
        //check that end date is now test date
        assertEquals(testDate, okr.getEndDate());
    }

    @Test
    public void setTodaysDateTest(){
        //check startDate is initialized to today
        assertEquals(Calendar.getInstance().getTime().toString(), okr.getTodaysDate().toString());
    }

    @Test
    public void setAssignedToFromEmptyTest(){
        //check assignedTo is empty string as initialized
        assertEquals("", okr.getAssignedTo());
        //call set assigned to a team
        okr.setAssignedTo(team);
        //check that assignedTo is now equal to team
        assertEquals(team, okr.getAssignedTo());
    }

    @Test
    public void setAssignedToFromNonEmptyTest(){
        //check assignedTo is empty string as initialized
        assertEquals("", okr.getAssignedTo());
        //call set assigned to a team
        okr.setAssignedTo(team);
        //check that assignedTo is now equal to team
        assertEquals(team, okr.getAssignedTo());
        //call set assigned to a new team
        okr.setAssignedTo(newTeam);
        //check that assignedTo is now equal to new team
        assertEquals(newTeam, okr.getAssignedTo());
    }

    @Test
    public void insertKRNotAlreadyThereTest(){
        //check that keyresults is empty as initialized
        assertTrue(okr.getKeyresults().isEmpty());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        okr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(okr.getKeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, okr.getKeyresults().size());

    }

    @Test
    public void insertKRAlreadyThereTest(){
        //check that keyresults is empty as initialized
        assertTrue(okr.getKeyresults().isEmpty());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        okr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(okr.getKeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, okr.getKeyresults().size());
        //call insertKR to insert the same test KR
        okr.insertKR(kr);
        //check that the second test KR was not added ie it is in keyresults only once
        assertEquals(1, okr.getKeyresults().size());
    }

    @Test
    public void containsKRTrueTest(){
        //check that kr is empty as initialized
        assertEquals(0 , okr.getKeyresults().size());
        //call insertKR to insert a test KR into the arraylist
        kr.setMetric("testmetric");
        okr.insertKR(kr);
        //check that keyresults now contains the test KR
        assertTrue(okr.getKeyresults().contains(kr));
        //check that keyresults is size 1
        assertEquals(1, okr.getKeyresults().size());
        //call containsKR
        //check containsKR correctly returns true
        assertTrue(okr.containsKR(kr));

    }

    @Test
    public void containsKRFalseTest(){
        //check that kr is empty as initialized
        assertTrue(okr.getKeyresults().isEmpty());
        //check that keyresults is size 0, empty
        assertEquals(0, okr.getKeyresults().size());
        //call containsKR
        //check containsKR correctly returns false
        assertFalse(okr.containsKR(kr));
    }
}
