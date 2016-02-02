/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.device;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author iulian.radulescu
 */
public class StandardTextDevice extends TextDevice {
    
    private PrintStream output;
    private Scanner input;

    public StandardTextDevice( ) {
        output = System.out;
        input = new Scanner(System.in);
    }
    
    @Override
    public String readLine(String label) {
        if ( label != null && !label.isEmpty( ) ) {
            output.print( label + "  ");
        }
        
        return input.nextLine( );
    }

    @Override
    public TextDevice print(String format, Object... args) {
        output.printf(format, args);
        return this;
    }
}
