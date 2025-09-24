package me.code.services;

import me.code.models.Todo;
import me.code.models.TodoStatus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class TodoService {

    private static final ArrayList<Todo> todos = new ArrayList<>();

    public static void loadTodos(ArrayList<Todo> loadFrom) {
        todos.addAll(loadFrom);
    }

    public static void addTodo(Todo todo) throws Exception {
        todos.add(todo);
        TodoRepository.saveTodosToFile(todos);
    }

    public static Todo removeTodoById(UUID id) throws Exception {
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);

            if (todo.getId() == id) {
                todos.remove(i);
                TodoRepository.saveTodosToFile(todos);
                return todo;
            }
        }

        return null;
    }

    public static Todo updateTodoStatusById(UUID todoId, TodoStatus status) throws Exception {
        Todo todo = getTodoById(todoId);
        if (todo == null) {
            return null;
        } else {
            todo.setStatus(status);
            TodoRepository.saveTodosToFile(todos);
            return todo;
        }
    }

    public static Todo getTodoById(UUID id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }

    public static ArrayList<Todo> getTodos() {
        return todos;
    }
}
