package com.se.training.collections;

/**
 * Created by baswantdasari on 5/26/17.
 */
public class copyArrayExample {

    public static void main(String[] args) {

        char[] stringsArray = {'D','E','C','A','F','F','I','N','E','T','E','D'};

        char[] copyArray = java.util.Arrays.copyOfRange(stringsArray,2,9);


        System.out.println( "new name " + new String(copyArray));


    }
}
