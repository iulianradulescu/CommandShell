/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastermind.shell;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author iulian.radulescu
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Shell shell = context.getBean(Shell.class);

        shell.start();
    }

}
