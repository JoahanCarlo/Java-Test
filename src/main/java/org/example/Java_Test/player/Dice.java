package org.example.Java_Test.player;

import java.util.Random;

public class Dice {

    public Dice(int sides) {
        this.sides = sides;
    }

    private  int sides;



    public int roll(){
        return new Random().nextInt(sides) + 1;
    }
}
