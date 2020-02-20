package main.tests;

import main.model.Objective;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObjectiveTest {
    Objective ob;

    @BeforeEach
    public void setup() {
        ob = new Objective();
    }

    @Test
    public void setTitleFromEmptyTest(){
        //check that title is empty as initialized
        //call setTitle
        //check that ob's title equals what we set it to

    }

    @Test
    public void setTitleFromNonEmptyTest(){
        //check that title is empty as initialized
        //call setTitle
        //check that ob's title equals what we set it to
        //call setTitle to a different title
        //check that ob's title equals the second title
    }

    @Test
    public void getTitleTest(){
        //check that title is empty as initialized
        //call setTitle
        //check that ob's title equals what we set it to
    }

    @Test
    public void setPriorityFromFalseTest(){
        //check that ob is not set as priority
        //call set priority
        //check that ob is now set as priority
    }

    @Test
    public void setPriorityFromTrueTest(){
        //check that ob is set as priority already
        //call set priority
        //check that ob is still set as priority
    }

    @Test
    public void setNotPriorityFromTrueTest(){
        //check that ob is set as priority already
        //call set not priority
        //check that ob is now set as not a priority
    }

    @Test
    public void setNotPriorityFromFalseTest(){
        //check that ob s set as not priority already
        //call set not priority
        //check that ob is still not set as a priority
    }
}
