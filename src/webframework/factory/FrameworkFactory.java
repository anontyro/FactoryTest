/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webframework.factory;

/**
 * Main factory class to control the creation of objects
 */
public class FrameworkFactory {

    /*
     control statement that is used to make it easy for a user to select
     the factory item they want for a specific task.
     */
    public Framework getInstance(String lang) {
        lang = lang.toLowerCase();
        lang = lang.trim();

        if (lang.equals("java")) {
            return new Spring();
        } else if (lang.equals("python")) {
            return new Django();
        } else if (lang.equals("javascript")) {
            return new AngularJS();
        } else {
            System.out.println("Error: " + lang + " Has no matching Frameworks");
            System.exit(1);
        }
        return new Spring();
    }
}
