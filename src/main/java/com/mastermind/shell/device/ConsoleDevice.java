/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.device;

import java.io.Console;

/**
 *
 * @author iulian.radulescu
 */
public class ConsoleDevice extends TextDevice {

    private Console console;

    @Override
    public String readLine(String label) {
        return console.readLine(label);
    }

    @Override
    public TextDevice print(String format, String args) {
        console.printf(format, args);
        return this;
    }
}
