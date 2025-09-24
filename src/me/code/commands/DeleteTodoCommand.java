package me.code.commands;

import me.code.models.Todo;
import me.code.services.TodoService;
import me.code.utility.CommandHelper;

import java.util.UUID;

public class DeleteTodoCommand {

    public static void execute() {
        UUID todoId = CommandHelper.queryTodoId();
        if (todoId == null) {
            return;
        }

        Todo todo;
        try {
            todo = TodoService.removeTodoById(todoId);
        } catch (Exception exception) {
            System.out.println("An error occurred, message: " + exception.getMessage());
            return;
        }

        if (todo == null) {
            System.out.println("No such todo was found.");
        } else {
            System.out.println("Deleted todo with title '" + todo.getTitle() + "'");
        }
    }
}
