/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.practise1;

/**
 *
 * @author bidhan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Firstname="Bidhan";
       String Lastname= "Subedi";
       String Fullname= (Firstname+" "+Lastname).toLowerCase();
       String domain= "@self.com";
       String email= Firstname.substring(0,3)+ "."+Lastname.substring(0, 3)+domain;
        System.out.println("Email: "+email);
        System.out.println("Fullname: "+Fullname);
        System.out.println(Firstname.charAt(0));
        System.out.println(Firstname.length());
    }
    
}
