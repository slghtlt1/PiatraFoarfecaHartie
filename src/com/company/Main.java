package com.company;

import java.util.Scanner;

public class Main {

    static String user1Choice;
    static String user2Choice;
    public static void main(String[] args) {
        printOptions();
        ResultGame.printResult(user1Choice, user2Choice);
    }

    public static void printOptions(){
        Scanner s = new Scanner(System.in);
        System.out.println("Alege o varianta: piatra, foarfeca sau hartie");

        System.out.print("User1: ");
        user1Choice = s.next();
        System.out.print("User2: ");
        user2Choice = s.next();
    }
}
