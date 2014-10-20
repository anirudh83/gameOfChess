package com.anirudh.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anirudh on 20/10/14.
 */
public class TestCharacters {

    private King king;
    private Queen queen;
    private Bishop bishop;

    @Before
    public void init() {
        king = new King();
        queen = new Queen();
        bishop = new Bishop();
    }

    @Test
    public void moveKing() {
        assertEquals("move one step forward", king.move());
    }

    @Test
    public void moveQueen() {
        assertEquals("move one step forward", queen.move());
    }

    @Test
    public void moveBishop() {
        assertEquals("Moving Diagonally", bishop.move());
    }
}
