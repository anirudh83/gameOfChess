package com.anirudh.practice;

/**
 * Created by anirudh on 20/10/14.
 */
public class Bishop extends Character {

    public Bishop() {
        setMovementBehaviour(new DiagonalMovement());
    }
}
