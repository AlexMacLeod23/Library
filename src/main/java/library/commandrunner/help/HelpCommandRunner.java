package library.commandrunner.help;

import library.commandrunner.LibraryCommandRunner;

public class HelpCommandRunner implements LibraryCommandRunner {

    // TODO: expand options

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        for ( Command val : Command.values()) {
            sb.append(val.toString().toLowerCase());
            sb.append("', '");
        }
        String output = "Valid commands: '" + sb.toString();
        System.out.println(output.substring(0,output.length()-3));
    }
}
