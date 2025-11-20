package org.ccasro.singleton;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Undo undo = Undo.getInstance();

        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add command.");
            System.out.println("2. Undo command. ");
            System.out.println("3. Show history. ");
            System.out.println("0. Exit. ");

            String option = sc.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.println("Enter the command you want to add: ");
                    undo.addCommand(sc.nextLine());
                    System.out.println("Entered command!");
                }
                case "2" -> {
                    if (undo.getHistory().isEmpty()){
                        System.out.println("No commands to undo.");
                    } else {
                        undo.undo();
                        System.out.println("Last command removed");
                    }
                }
                case "3" -> System.out.println(undo.getHistory());
                case "0" -> exit = true;
                default -> System.out.println("Invalid Option");
            }
        }
        sc.close();
    }
}