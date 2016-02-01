/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * POJO class storing all metadata about a command extracted from a command line
 * @author radulescu
 */
public class CommandMetadata {
    
    private String name;
    private Map<String, String> options;
    private List<String> arguments;
    
    public CommandMetadata( String name ) {
	this.name = name;
    }
    
    public void addOption( String option, String value ) {
	if ( options == null ) {
	    options = new HashMap( );
	}
	
	options.put(option, value);
    }
    
    public void addArgument( String argument ) {
	if ( arguments == null ) {
	    arguments = new ArrayList( );
	}
	
	arguments.add( argument );
    }
}
