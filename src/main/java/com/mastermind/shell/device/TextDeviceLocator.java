/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell.device;

import org.springframework.stereotype.Component;

/**
 *
 * @author iulian.radulescu
 */
public class TextDeviceLocator {

    public TextDevice createTextDevice( ) {
        TextDevice device = null;

        if (System.console() != null) {
            device = new ConsoleDevice();
        } else {
            device = new StandardTextDevice();
        }

        return device;
    }
}
