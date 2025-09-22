package me.code.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandHelper {

    public static int queryTodoId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of todo: ");

        int id;
        try {
            id = scanner.nextInt();
            scanner.nextLine();
            return id;
        } catch (InputMismatchException exception) {
            System.out.println("The id must be a valid number.");
            return -1;
        }
    }

}
