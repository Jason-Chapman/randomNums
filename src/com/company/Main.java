package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //System.out.println("First Random int is "+random.nextInt(10));
        //System.out.println("First Random double is "+random.nextDouble());

        //int min = 5;
        //int max = 10;
        //int newRandom = random.nextInt((max - min) + 1) + min;
        //System.out.println(newRandom);


        //System.out.println(Math.random);

        //int rand = (int) (Math.random() *10);
        //System.out.println(rand);


        /*System.out.println("Input a number:");
        int x = input.nextInt();

        System.out.println("Input minimum value:");
        int min = input.nextInt();

        System.out.println("Input maximum value:");
        int max = input.nextInt();

        for (int i = 0; i < (x+1);) {
            int newRandom = random.nextInt((max - min) + 1) + min;
            System.out.println(newRandom);
            i++;
        }*/


        System.out.println("Input dice sides:");
        int sides = input.nextInt();

        System.out.println("Input dice rolls:");
        int rolls = input.nextInt();

        for (int i = 0; i < (rolls + 1); i++) {
            int[] tally = {random.nextInt(sides)};
            for (int x : tally) {
                System.out.println(x);
            }
        }
    }
}
