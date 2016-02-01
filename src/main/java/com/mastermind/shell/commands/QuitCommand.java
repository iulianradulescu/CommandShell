/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.commands;

import com.mastermind.shell.ShellContext;
import com.mastermind.shell.annotations.CommandDef;

/**
 *
 * @author radulescu
 */
@CommandDef(name="quit", help="Quits the current shell session")
public class QuitCommand implements Command {

    @Override
    public boolean canBeExecuted(ShellContext context) {
	return true; //it can be executed always
    }

    @Override
    public CommandResult execute(ShellContext context, CommandResult input) {
	return null; //not important at the moment
    }
    
}
