/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webframework.factory;

/**
 * Class that represents a framework with a simple system out command to prove
 * that this factory has been called
 * @author Alex
 */
public class Spring implements Framework{

    @Override
    public void language() {
        System.out.println("Java - Spring");
    }
    
}
