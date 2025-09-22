package me.code.commands;

import me.code.models.Todo;
import me.code.models.TodoStatus;
import me.code.services.TodoService;
import me.code.utility.CommandHelper;

public class StartTodoCommand {

    public static void execute() {
        int todoId = CommandHelper.queryTodoId();
        if (todoId == -1) {
            return;
        }

        Todo todo = TodoService.getTodoById(todoId);
        if (todo == null) {
            System.out.println("No such todo was found.");
        } else {
            todo.setStatus(TodoStatus.IN_PROGRESS);
            System.out.println("Todo '" + todo.getTitle() + "' is now in-progress.");
        }
    }
}
