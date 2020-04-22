package library.commands;

import java.util.List;

public interface LibraryCommandRunner extends Runnable {

    static void run(Command mainCommand, List<String> commandStrings) {
        LibraryCommandRunner command = switch (mainCommand) {
            case ADD -> new AddCommandRunner(commandStrings);
            case EXIT -> new ExitCommandRunner();
            case EXTEND -> new ExtendCommandRunner(commandStrings);
            case HELP -> new HelpCommandRunner();
            case LOAN -> new LoanCommandRunner(commandStrings);
            case OUTPUT -> new OutputCommandRunner(commandStrings);
            case REMOVE -> new RemoveCommandRunner(commandStrings);
            case RETURN -> new ReturnCommandRunner(commandStrings);
            case UPDATE -> new UpdateCommandRunner(commandStrings);
        };
        command.run();
    }

    enum Command {
        ADD, EXIT, EXTEND, HELP, LOAN, OUTPUT, REMOVE, RETURN, UPDATE
    }
}