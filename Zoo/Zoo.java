/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vuproject;



public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Rani", 10);
        Animal monkey = new Monkey("Mango", 3);

        lion.makeSound();
        lion.eat("meat");

        System.out.println();

        elephant.makeSound();
        elephant.eat("grass");
        
        
        System.out.println();

        monkey.makeSound();
        monkey.eat("bananas");
        
        System.out.println();
    }
    
}
