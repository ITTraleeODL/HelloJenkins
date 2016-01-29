/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittodl.hellojenkins;

/**
 *
 * @author administrator
 */
public class HelloJenkins {
    
    public static void main(String[] args){
        
        int testTheNumber = testTheNumber();
        
        System.out.println("The number is " + testTheNumber());
    }
    
    public static int testTheNumber(){
        int i = 6;
        return i;
    }
    
}
