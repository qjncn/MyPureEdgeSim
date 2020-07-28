package com.mechalikh.pureedgesim.TasksGenerator;

import java.util.Random;

public class RadomTest {
    public static void main(String[] args) {
        Random random = new Random(50);
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random.nextInt(100) + ", ");
        }
        System.out.println();
        Random random2 = new Random(50);
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random2.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random2.nextInt(100) + ", ");
        }
        System.out.println();

        System.out.println("-----------------------------------");
        Random random3 = new Random();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random3.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random3.nextInt(100) + ", ");
        }
        System.out.println();
        Random random4 = new Random();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random4.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random4.nextInt(100) + ", ");
        }
        System.out.println();
    }
}
