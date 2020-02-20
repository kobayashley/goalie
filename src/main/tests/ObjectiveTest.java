package main.tests;

import main.model.Objective;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObjectiveTest {
    Objective ob;
    String testTitle = "test";

    @BeforeEach
    public void setup() {
        ob = new Objective();
    }

    @Test
    public void setTitleFromEmptyTest(){
        //check that title is empty as initialized
        assertEquals(ob.getTitle(),"");
        //call setTitle
        ob.setTitle(testTitle);
        //check that ob's title equals what we set it to
        assertEquals(ob.getTitle(), testTitle);
    }

    @Test
    public void setTitleFromNonEmptyTest(){
        //check that title is empty as initialized
        assertEquals(ob.getTitle(), "");
        //call setTitle
        ob.setTitle(testTitle);
        //check that ob's title equals what we set it to
        assertEquals(ob.getTitle(), testTitle);
        //call setTitle to a different title
        ob.setTitle(testTitle);
        //check that ob's title equals the second title
        assertEquals(ob.getTitle(), testTitle;
    }

    @Test
    public void getTitleTest(){
        //check that title is empty as initialized
        assertEquals(ob.getTitle(), "");
        //call setTitle
        ob.setTitle(testTitle);
        //check that ob's title equals what we set it to
        assertEquals(ob.getTitle(), testTitle);
    }

    @Test
    public void setPriorityFromFalseTest(){
        //check that ob is not set as priority
        assertFalse(ob.isPriority());
        //call set priority
        checkObIsPriority();
    }

    @Test
    public void setPriorityFromTrueTest(){
        //set and check that ob is set as priority already
        checkObIsPriority();
        //call set priority
        checkObIsPriority();
    }

    @Test
    public void setNotPriorityFromTrueTest(){
        //check that ob is set as priority already
        checkObIsPriority();
        //call set not priority
        ob.setNotPriority();
        //check that ob is now set as not a priority
        assertFalse(ob.isPriority());
    }


    @Test
    public void setNotPriorityFromFalseTest(){
        //check that ob s set as not priority already
        assertFalse(ob.isPriority());
        //call set not priority
        ob.setNotPriority();
        //check that ob is still not set as a priority
        assertFalse(ob.isPriority());
    }

    public void checkObIsPriority() {
        ob.setPriority();
        assertTrue(ob.isPriority());
    }

}
