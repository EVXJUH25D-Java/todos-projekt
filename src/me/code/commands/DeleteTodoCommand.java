package me.code.commands;

import me.code.models.Todo;
import me.code.services.TodoService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteTodoCommand {

    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of todo to delete: ");

        int id;
        try {
            id = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("The id must be a valid number.");
            return;
        }

        Todo todo = TodoService.removeTodoById(id);
        if (todo == null) {
            System.out.println("No such todo was found.");
        } else {
            System.out.println("Deleted todo with title '" + todo.getTitle() + "'");
        }
    }
}
