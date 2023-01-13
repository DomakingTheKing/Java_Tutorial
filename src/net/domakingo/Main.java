package net.domakingo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // outputting things whit println

        /*
        System.out.println("Hello world!");
        int x = 10;
        System.out.println(x);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Che giorno è oggi? ");
        int input = scanner.nextInt();
        int mese = 31;
        int giorni_rimanenti = mese - input;
        System.out.println("Mancano " + giorni_rimanenti + " giorni alla fine del mese");

    }
}