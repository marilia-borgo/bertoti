package controller;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private final Map<String, ICommand> commands = new HashMap<>();

    public void registerCommand(String name, ICommand command) {
        commands.put(name, command);
    }

    public void executeCommand(String name) {
        ICommand command = commands.get(name);
        if (command != null) {
            command.execute();
        }
    }
}