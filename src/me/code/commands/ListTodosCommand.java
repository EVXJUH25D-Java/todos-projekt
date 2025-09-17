package me.code.commands;

import me.code.models.Todo;
import me.code.services.TodoService;

import java.util.ArrayList;

public class ListTodosCommand {

    public static void execute() {
        ArrayList<Todo> todos = TodoService.getTodos();

        System.out.println("Created todos:");
        for (Todo todo : todos) {
            System.out.println(" - " + todo.toString());
        }
    }
}
