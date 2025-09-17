package me.code;

import me.code.services.CommandService;
import me.code.services.TodoService;

public class Main {

    /*

    1. Skapa todos (som sparas)
    2. Lista todos
    3. Avklara todos
    4. Radera todos
    5. Prioritera todos
    6. Uppdatera/redigera todos
    7. Kategorisera todos
    8. Statusmarkera todos (ej påbörjad, in progress, avslutad)

     */

    public static void main(String[] args) {
        TodoService.populateTodos();

        CommandService commandService = new CommandService();
        commandService.start();
    }
}
