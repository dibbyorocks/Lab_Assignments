package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String args[])
    {
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        switch (value)
        {
            case 1:
                System.out.println("you are entering red");
                System.out.println("STOP!!!");
                break;
            case 2:
                System.out.println("You Are Entering Yellow");
                System.out.println("Be Ready!");
                break;
            case 3:
                System.out.println("You are Entering Green");
                System.out.println("You can Go----->");
                break;
        }
    }
}
