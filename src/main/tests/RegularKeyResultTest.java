package main.tests;

import main.model.RegularKeyResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularKeyResultTest {
    RegularKeyResult kr;

    @BeforeEach
    public void setup(){
        kr = new RegularKeyResult();
    }

    @Test
    public void markCompletedNotAlreadyCompletedTest(){
        assertFalse(kr.isCompleted());
        kr.markCompleted();
        assertTrue(kr.isCompleted());
    }

    @Test
    public void markCompletedAlreadyCompletedTest(){
        kr.markCompleted();
        assertTrue(kr.isCompleted());
        kr.markCompleted();
        assertTrue(kr.isCompleted());
    }

    @Test
    public void markIncompleteAlreadyCompleteTest(){
        kr.markCompleted();
        assertTrue(kr.isCompleted());
        kr.markIncomplete();
        assertFalse(kr.isCompleted());
    }

    @Test
    public void markIncompleteAlreadyIncompleteTest(){
        assertFalse(kr.isCompleted());
        kr.markIncomplete();
        assertFalse(kr.isCompleted());
    }

    @Test
    public void isCompletedTrueTest(){
        kr.markCompleted();
        assertTrue(kr.isCompleted());

    }

    @Test
    public void isCompletedFalseTest(){
        kr.markIncomplete();
        assertFalse(kr.isCompleted());
    }

    @Test
    public void setMetricFromEmptyTest(){
        assertEquals(kr.getMetric(), "");
        kr.setMetric("test metric");
        assertEquals(kr.getMetric(), "test metric");
    }

    @Test
    public void getMetricTest(){
        assertEquals(kr.getMetric(), "");
        kr.setMetric("test metric");
        assertEquals(kr.getMetric(), "test metric");
    }
}
