package com.anirudh.practice;

/**
 * Created by anirudh on 20/10/14.
 */
public class Character {

    private MovementBehaviour movementBehaviour;

    String move(){
       return movementBehaviour.move();
    }

    public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
        this.movementBehaviour = movementBehaviour;
    }

}
