package main.tests;

import main.model.KeyResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyResultTest {
    KeyResult kr;

    @BeforeEach
    public void setup(){
        kr = new KeyResult();
    }

    @Test
    public void markCompletedNotAlreadyCompletedTest(){
        //check that kr is not marked completed already
        assertFalse(kr.isCompleted());
        //mark it completed
        kr.markCompleted();
        //check that kr is now marked completed
        assertTrue(kr.isCompleted());
    }

    @Test
    public void markCompletedAlreadyCompletedTest(){
        //check that kr is already marked completed
        assertTrue(kr.isCompleted());
        //mark it completed
        kr.markCompleted();
        //check that kr is still marked completed
        assertTrue(kr.isCompleted());
    }

    @Test
    public void markIncompleteAlreadyCompleteTest(){
        //check that kr is already marked completed
        assertTrue(kr.isCompleted());
        //mark it incomplete
        kr.markIncomplete();
        //check that kr is now marked incomplete
        assertFalse(kr.isCompleted());
    }

    @Test
    public void markIncompleteAlreadyIncompleteTest(){
        //check that kr is already marked incomplete
        assertFalse(kr.isCompleted());
        //mark it incomplete
        kr.markIncomplete();
        //check that kr is still incomplete
        assertFalse(kr.isCompleted());
    }

    @Test
    public void isCompletedTrueTest(){
        kr.markCompleted();
        //check that kr is already marked complete
        assertTrue(kr.isCompleted());

    }

    @Test
    public void isCompletedFalseTest(){
        kr.markIncomplete();
        assertFalse(kr.isCompleted());
    }

    @Test
    public void setMetricFromEmptyTest(){
        //check that kr has an empty metric
        assertEquals(kr.getMetric(), "");
        //set the metric to something
        kr.setMetric("test metric");
        //check that kr's metric has been set to that.
        assertEquals(kr.getMetric(), "test metric");
    }

    @Test
    public void getMetricTest(){
        //check that kr has an empty metric
        assertEquals(kr.getMetric(), "");
        //set the metric to something
        kr.setMetric("test metric");
        //check that kr's metric has been set to that.
        assertEquals(kr.getMetric(), "test metric");
    }
}
