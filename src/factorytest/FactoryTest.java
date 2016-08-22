/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorytest;

import java.util.Scanner;
import webframework.factory.Framework;
import webframework.factory.FrameworkFactory;

/**
 * main class to test the framework factory 
 * @author Alex
 */
public class FactoryTest {

    /**
     * main method used to work with the factory
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //factory call
        FrameworkFactory factory = new FrameworkFactory();
        
        //Making a call to create the basic factory
        System.out.println("What language would you like to work with? "); //request for user
        Scanner out = new Scanner(System.in); //setup the scanner to listen to input
        String userInput = out.nextLine(); //save user input
        
        Framework framework = factory.getInstance(userInput); //check the factory
        framework.language(); //return the value
    }
    
}
