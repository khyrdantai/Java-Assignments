/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex03;

import java.util.Scanner;

public class EX03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the quote? ");

        String quote = sc.nextLine();

        System.out.print("Who said it? ");

        String speaker = sc.nextLine();

        System.out.println(speaker + " says, \"" + quote + "\"");

    }
}
