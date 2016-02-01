package com.mastermind.shell;

import com.mastermind.shell.device.TextDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Main class. It launches an interactive shell, handling the input and the
 * output. It is executing the commands parsed using the command line parser
 *
 * @author iulian.radulescu
 */
@Component
public class Shell {

    private CommandLineParser parser;

    @Autowired
    private TextDevice device;

    @Autowired
    private ShellContext context;

    public Shell() { }

    private String handleInput( ) {
        device.promptToUser( );
        String commandLine = device.readLine( null );

        return commandLine;
    }

    public void start() {
        
        while ( true ) {
            String cmd = handleInput( );
            device.print("CMD is %s", cmd);
        }
    }
}
