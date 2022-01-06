package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String noun1 = "";
        String adj1 = "";
        String noun2 = "";
        String number1 = "";
        String color1 = "";
        String adj2 = "";
        String noun3 = "";
        String noun4 = "";
        String noun5 = "";
        String verb1 = "";
        String verb2 = "";


        Scanner sc = new Scanner(System.in);


        System.out.println("I need a noun: ");
        noun1 = sc.nextLine();


        System.out.println("Now and ajd: ");
        adj1 = sc.nextLine();

        System.out.println("Another noun: ");
        noun2 = sc.nextLine();

        System.out.println("And a number: ");
        number1 = sc.nextLine();

        System.out.println("Another adh: ");
        adj2 = sc.nextLine();

        System.out.println("A plural noun: ");
        noun3 = sc.nextLine();

        System.out.println("Another one: ");
        noun4 = sc.nextLine();

        System.out.println("One more: ");
        noun5 = sc.nextLine();

        System.out.println("A verb (present tense): ");
        verb1 = sc.nextLine();

        System.out.println("Same verb (past tense): ");
        verb2 = sc.nextLine();


        System.out.println("NOW LETS GET MAD (libs)");

        System.out.println(noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + number1 + "-year mission: to explore strange " + adj2 + " " + noun3 + ", to seek out " + adj2 + " balls and " + adj2 + " lettuce, to boldly " + verb1 + " where no one has " + verb2 + " before.");







    }
}
