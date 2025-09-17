package me.code.services;

import me.code.models.Todo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.NoSuchElementException;

public class TodoService {

    private static final ArrayList<Todo> todos = new ArrayList<>();

    public static void addTodo(Todo todo) {
        todos.add(todo);
    }

    public static Todo removeTodoById(int id) {
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);

            if (todo.getId() == id) {
                todos.remove(i);
                return todo;
            }
        }

        return null;
    }

    public static ArrayList<Todo> getTodos() {
        return todos;
    }

    public static void populateTodos() {
        Calendar cal = Calendar.getInstance();

        // Todo 1: High priority work task
        cal.set(2024, Calendar.JANUARY, 15);
        TodoService.addTodo(new Todo("Complete quarterly report", cal.getTime(), "Work", 1));

        // Todo 2: Personal health goal
        cal.set(2024, Calendar.FEBRUARY, 1);
        TodoService.addTodo(new Todo("Schedule annual checkup", cal.getTime(), "Health", 2));

        // Todo 3: Home maintenance
        cal.set(2024, Calendar.JANUARY, 25);
        TodoService.addTodo(new Todo("Fix leaky kitchen faucet", cal.getTime(), "Home", 3));

        // Todo 4: Educational goal
        cal.set(2024, Calendar.MARCH, 10);
        TodoService.addTodo(new Todo("Complete Java certification course", cal.getTime(), "Education", 1));

        // Todo 5: Social commitment
        cal.set(2024, Calendar.JANUARY, 20);
        TodoService.addTodo(new Todo("Plan birthday party for Mom", cal.getTime(), "Personal", 2));

        // Todo 6: Financial task
        cal.set(2024, Calendar.APRIL, 15);
        TodoService.addTodo(new Todo("File tax returns", cal.getTime(), "Finance", 1));

        // Todo 7: Fitness goal
        cal.set(2024, Calendar.FEBRUARY, 14);
        TodoService.addTodo(new Todo("Run 5K without stopping", cal.getTime(), "Fitness", 3));

        // Todo 8: Work project
        cal.set(2024, Calendar.JANUARY, 30);
        TodoService.addTodo(new Todo("Review and merge pull requests", cal.getTime(), "Work", 2));

        // Todo 9: Hobby/Creative
        cal.set(2024, Calendar.MARCH, 1);
        TodoService.addTodo(new Todo("Finish reading 'Clean Code' book", cal.getTime(), "Learning", 3));

        // Todo 10: Travel planning
        cal.set(2024, Calendar.MAY, 1);
        TodoService.addTodo(new Todo("Book summer vacation flights", cal.getTime(), "Travel", 2));
    }
}
