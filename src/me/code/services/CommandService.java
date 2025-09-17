package me.code.services;

import me.code.commands.CreateTodoCommand;
import me.code.commands.DeleteTodoCommand;
import me.code.commands.ListTodosCommand;

import java.util.Scanner;

public class CommandService {

    public void start() {
        System.out.println("=== TODO APPLICATION ===");
        System.out.println("Welcome! Choose from the following commands:");
        System.out.println("list-todos - List all created todos");
        System.out.println("create-todo - Create and save a new todo");
        System.out.println("delete-todo - Remove todos");
        System.out.println("complete-todo - Mark a todo as completed");
        System.out.println("start-todo - Mark a todo as in-progress");
        System.out.println("edit-todo - Edit todos");
        System.out.println("exit - Exit the application");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String commandInput = scanner.nextLine();
            if (commandInput.equalsIgnoreCase("exit")) {
                return;
            }

            executeCommand(commandInput);
        }
    }

    public void executeCommand(String commandInput) {
        if (commandInput.equalsIgnoreCase("create-todo")) {
            CreateTodoCommand.execute();
        } else if (commandInput.equalsIgnoreCase("list-todos")) {
            ListTodosCommand.execute();
        } else if (commandInput.equalsIgnoreCase("delete-todo")) {
            DeleteTodoCommand.execute();
        }
    }
}
