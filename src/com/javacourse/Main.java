package com.javacourse;

public class Main {

    public static void main(String[] args) {

        byte myByte = -12;
        short myShort = -1000;
        int myInt = 25;
        long myLong = 50000 + (10* (myByte + myShort + myInt));
        System.out.println("myLong=" + myLong);
    }
}
