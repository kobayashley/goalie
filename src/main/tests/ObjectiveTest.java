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
        assertEquals(ob.getTitle(),"");
        ob.setTitle(testTitle);
        assertEquals(ob.getTitle(), testTitle);
    }

    @Test
    public void setTitleFromNonEmptyTest(){
        assertEquals(ob.getTitle(), "");
        ob.setTitle(testTitle);
        assertEquals(ob.getTitle(), testTitle);
        ob.setTitle(testTitle);
        assertEquals(ob.getTitle(), testTitle);
    }

    @Test
    public void getTitleTest(){
        assertEquals(ob.getTitle(), "");
        ob.setTitle(testTitle);
        assertEquals(ob.getTitle(), testTitle);
    }

    @Test
    public void setPriorityFromFalseTest(){
        assertFalse(ob.isPriority());
        checkObIsPriority();
    }

    @Test
    public void setPriorityFromTrueTest(){
        checkObIsPriority();
        checkObIsPriority();
    }

    @Test
    public void setNotPriorityFromTrueTest(){
        checkObIsPriority();
        ob.setNotPriority();
        assertFalse(ob.isPriority());
    }


    @Test
    public void setNotPriorityFromFalseTest(){
        assertFalse(ob.isPriority());
        ob.setNotPriority();
        assertFalse(ob.isPriority());
    }

    public void checkObIsPriority() {
        ob.setPriority();
        assertTrue(ob.isPriority());
    }

}
