package com.milnesium;

import javax.swing.*;
import java.util.Scanner;

public class LogicalOp {

    int number;
    int y;

    public void displayCountUp(){
        System.out.println("\nCounting Up");
        System.out.println("Please input an integer number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Your number is: "+number);
        int threshold=100;
        System.out.println("Starting the counting:");
        for(int i=number; i<=threshold; i++){
            System.out.println(i);
        }
    }

    public void displayCountDown(){
        System.out.println("\nCounting Down");
        System.out.println("Please insert a number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Your number is: "+number);
        int threshold=-100;
        System.out.println("Starting the counting:");
        for(int i=number; i>=threshold; i--){
            System.out.println(i);
        }
    }

    public void displayCountInterval(){
        System.out.println("\nCounting Interval:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 1st number:");
        number = scanner.nextInt();
        System.out.println("Please insert 2nd number:");
        y = scanner.nextInt();
        System.out.println("Lower bound:"+number);
        System.out.println("Upper bound:"+y);
        System.out.println("Counting:");
        if(number<y){
            for (int i=number; i<=y; i++){
                System.out.println(i);
            }
        }
        else{
            System.out.println("Try next method!");
        }
    }

    public void displayCountIntervalOrder(){
        System.out.println("\nCounting Interval Order");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 1st number:");
        number = scanner.nextInt();;
        System.out.println("Insert 2nd number:");
        y = scanner.nextInt();
        System.out.println("1st number:"+number);
        System.out.println("2nd number:"+y);
        if(number<y){
            for(int i = number; i<=y;i++){
                System.out.println(i);
            }
        }
        else{
            for(int i = number; i>=y; i--){
                System.out.println(i);
            }
        }
    }

    public void displayEven() {
        System.out.println("\nCounting Even");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayOdds(){
        System.out.println("\nCounting Odds");
        for (int i = 1; i<=100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void displayCountSum(){
        System.out.println("\nCounting and Adding Up Numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        number = scanner.nextInt();
        int sum=0;
        for (int i = number; i<=100; i++){
            sum+=i;
        }
        System.out.println("The final sum is: "+sum);
    }

    public void displayMean(){
        System.out.println("\nMean");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        number = scanner.nextInt();
        int sum=0;
        double count=0.0;
        for (int i = number; i<=100; i++){
            sum+=i;
            count+=1;
        }
        System.out.println("The mean is: "+ sum/count);
    }

    public void printAsterisk() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

