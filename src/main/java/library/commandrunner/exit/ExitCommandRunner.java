package library.commandrunner.exit;

import library.commandrunner.LibraryCommandRunner;

public class ExitCommandRunner implements LibraryCommandRunner {

    @Override
    public void run() {
        System.out.println("Quitting library system");
    }
}