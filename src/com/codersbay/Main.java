package com.codersbay;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] allNumbers = new int[0];
        System.out.println("Gib eine Zahl ein oder 'q' zum beenden");
        while (!sc.hasNext("q")){
            System.out.println("Gib eine Zahl ein oder 'q' zum beenden");
            int scan = sc.nextInt();
            int [] newArray = new int[allNumbers.length +1];
            for(int i = 0; i< allNumbers.length; i++){
                newArray[i] = allNumbers[i];
            }
            newArray[newArray.length - 1] = scan;
            allNumbers = newArray;
        }
        int highest = allNumbers[0];
        for (int i = 0; i < allNumbers.length; i++){
            if(allNumbers[i] > highest){
                highest = allNumbers[i];
            }
        }
        System.out.println(highest);

    }
}
