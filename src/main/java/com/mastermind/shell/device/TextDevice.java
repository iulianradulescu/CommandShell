/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.device;

/**
 * Wrapper class for the terminal. Also important for unit testing.
 *
 * @author iulian.radulescu
 */
public abstract class TextDevice {

    public static final String USER_PROMPT = "> ";

    abstract public String readLine(String label);
    abstract public TextDevice print(String format, String args);

    public TextDevice promptToUser() {
        return print("\n%s", USER_PROMPT);
    }
}
