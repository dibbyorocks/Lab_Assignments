package com.company;

import java.util.Scanner;

class Sum {
    int calculateSum(int n) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements");

        int sum=0;
        for(int i=0;i<n;i++) {
            int a = s.nextInt();
            sum = sum + a;

        }
        for (int j=0;j<n;j++)
        {
            if(sum%3==0 || sum%5==0)
            {
                System.out.println("---------sum is divisible---------");
                return sum;
            }
        }
        System.out.println("not divisible!!! Try again");
        return sum;
    }
}
public class Ex5 {

    public static void main(String args[])
    {
        System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          Sum add=new Sum();
        System.out.println("The sum is--"+add.calculateSum(n));
    }
}
