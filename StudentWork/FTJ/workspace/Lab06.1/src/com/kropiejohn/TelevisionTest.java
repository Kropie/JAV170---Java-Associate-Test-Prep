package com.kropiejohn;

/**
 * Created by jonat on 10/23/2017.
 */
public class TelevisionTest {
    public static void main(String[] args) {
        Television[] tvs = new Television[args.length];

        //BUILD
        int index = 0;
        for (String arg:
             args) {
            tvs[index++] = new Television(arg, 0);
        }

        //PRINT
        for (Television tv:
             tvs) {
            System.out.println(tv);
        }
    }
}
