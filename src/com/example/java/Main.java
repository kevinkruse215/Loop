package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        do {
            System.out.println("Welcome to McDonalds, what would you like?");
            System.out.println("____________________________________________");
            System.out.println("1.Mcdouble");
            System.out.println("2.Fries");
            System.out.println("3.Pop");
            System.out.println("4.McNuggets");
            System.out.println("5.BigMac");
            selection = in.nextInt();
        }
        while (selection!=1 && selection!=2 && selection!=3 && selection!=4 && selection!=5 );
        switch(selection)
        {
            case 1:
                System.out.println("You've chosen a McDouble. That will be $1.35");
                break;
            case 2:
                System.out.println("You've chosen a Fry. That will be $1.15");
                break;
            case 3:
                System.out.println("You've chosen a Pop. That will be $.99");
                break;
            case 4:
                System.out.println("You've chosen a McNugget. That will be $2.15");
                break;
            case 5:
                System.out.println("You've chosen a BigMac. That will be $4.50");
                break;
        }
    }
}
