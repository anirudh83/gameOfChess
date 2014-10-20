package com.anirudh.practice;

/**
 * Created by anirudh on 20/10/14.
 */
public class Queen extends Character {

    public Queen() {
        setMovementBehaviour(new SingleForward());
    }
}
