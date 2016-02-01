/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell;

import com.mastermind.shell.commands.Command;
import com.mastermind.shell.commands.CommandMetadata;
import java.util.List;

/**
 *
 * @author iulian.radulescu
 */
public class CommandLineParser {
    
    /**
     * Parse the command line string received and create the list of commands (if they are more than one connected through pipes).
     * @param commandLine
     * @return 
     */
    public List<Command> parse( String commandLine ) {
	//first we need to split the commandLine by searching for pipes
	String[] pipedCommands = commandLine.split("|");
	

	for ( String pipedCommand : pipedCommands ) {	    
	    /**each command has the following structure <command> [options] <arg1> <arg2> ...., where each option is in the form of -[letter] value
	    so we need to take each string, and if the string is starting with a -, it means is an option and we read the next one also as teh value of the option
	    the first string should be the command name **/
	    
	    String[] commandParts = pipedCommand.split(" ");
	    //first string should be the command name
	    
	   CommandMetadata command = new CommandMetadata( commandParts[0]);
//	   for ( int i = 1; i < commandParts.length; i++ ) {
//	       if ( commandParts[i].startsWith("-")) {
//		   //is an option; the next string is the value but check to make sure is not the end of the array
//		   if ( i < commandParts.length - 1 ) {
//		       command.addOption( commandParts[i], commandParts[++i])
//		   } else {
//		       //invald command format; expected value of the option, but none found
//		   }
//	       }
//	   }
	}
	
        return null;
    }
    
}
