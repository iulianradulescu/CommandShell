/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell;

import com.mastermind.shell.device.TextDevice;
import com.mastermind.shell.device.TextDeviceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author iulian.radulescu
 */
@Configuration
@ComponentScan(basePackages = {"com.mastermind.shell"})
public class ApplicationConfig {
    
    @Bean
    public TextDeviceLocator textDeviceLocator( ) {
        return new TextDeviceLocator( ); 
    }
    
    @Bean
    public TextDevice textDevice( ) {
        return textDeviceLocator( ).createTextDevice( );
    }
}
