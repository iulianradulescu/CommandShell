/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.commands;

import com.mastermind.shell.ShellContext;

/**
 *
 * @author iulian.radulescu
 */
public interface Command {
    /**
     * the method checks if the command can be executed considering the existing context
     * @param context
     * @return 
     */
    boolean canBeExecuted( ShellContext context );
    
    /**
     * execution of the command with the return of the result.
     * @param context - context of the execution
     * @param input - the result from a previous command (if commands are chained). Can be null
     * @return 
     */
    CommandResult execute( ShellContext context, CommandResult input );
}
