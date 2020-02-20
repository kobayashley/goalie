package main.tests;

import main.model.KeyResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        //mark it completed
        //check that kr is still marked completed
    }

    @Test
    public void markIncompleteAlreadyCompleteTest(){
        //check that kr is already marked completed
        //mark it incomplete
        //check that kr is now marked incomplete
    }

    @Test
    public void markIncompleteAlreadyIncompleteTest(){
        //check that kr is already marked incomplete
        //mark it incomplete
        //check that kr is still incomplete
    }

    @Test
    public void isCompletedTrueTest(){
        //check that kr is already marked complete
        //ask if this kr is marked complete
        //check that true is returned
    }

    @Test
    public void isCompletedFalseTest(){
        //check that kr is already marked incomplete
        //ask if this kr is marked complete
        //check that false is returned
    }

    @Test
    public void setMetricFromEmptyTest(){
        //check that kr has an empty metric
        //set the metric to something
        //check that kr's metric has been set to that.
    }

    @Test
    public void getMetricTest(){
        //check that kr's metric is not empty
        //ask fo the metric
        //check that the returned metric matches what we set it to.
    }
}
