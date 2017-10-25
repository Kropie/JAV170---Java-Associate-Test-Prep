package com.kropiejohn;

/**
 * Created by jonat on 10/23/2017.
 */
public class TelevisionTest {
    public static void main(String[] args) {
        Television television1 = new Television("Television 1 Brand", 11);
        Television television2 = new Television();

        television2.setBrand("Television 2 Brand");

        television2.setVolume(111);

        System.out.println("\nTelevision 1 information ------------------");
        System.out.println(television1);
        System.out.println("\nTelevision 2 information ------------------");
        System.out.println(television2);
    }
}
