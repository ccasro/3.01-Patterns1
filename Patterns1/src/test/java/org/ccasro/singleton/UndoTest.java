package org.ccasro.singleton;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class UndoTest {

    Undo undo;

    @BeforeEach
    void setup(){
        undo = Undo.getInstance();
        undo.clear();
    }

    @Test
    void testSingletonInstance(){
        Undo u1 = Undo.getInstance();
        Undo u2 = Undo.getInstance();

        assertSame(u1, u2, "should return the same instance");
    }

    @Test
    void testAddCommand(){
        undo.addCommand("Hello!");
        undo.addCommand("Bye! ");

        List<String> history = undo.getHistory();

        assertEquals(2, history.size());
        assertEquals("Hello!", history.getFirst());
        assertEquals("Bye! ", history.get(1));
    }

    @Test
    void testUndoLastCommand(){
        undo.addCommand("gg");
        undo.addCommand("1234");

        undo.undo();

        List<String> history = undo.getHistory();

        assertEquals(1, history.size());
        assertEquals("gg", history.getFirst());
    }

    @Test
    void testGetHistoryReturnsCopy(){
        undo.addCommand("test");

        List<String> cp = undo.getHistory();
        cp.clear();

        assertEquals(1, undo.getHistory().size(), "Modifying returned history shouldn't affect original history. ");
    }
}
