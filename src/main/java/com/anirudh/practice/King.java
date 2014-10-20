package com.anirudh.practice;

/**
 * Created by anirudh on 20/10/14.
 */
public class King extends Character {

    public King() {
        setMovementBehaviour(new SingleForward());
    }

}
