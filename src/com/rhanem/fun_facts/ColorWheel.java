package com.rhanem.fun_facts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Rhanem on 11/11/2014.
 */
public class ColorWheel {

    //Member variable (properties about the object)

    public String[] mClolors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7" };



    //Method (abilities: things the object can do)

    public int  getColor(){
        String color = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); // construct a new random generator
        int randomNumber = randomGenerator.nextInt(mClolors.length);
        color = mClolors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
