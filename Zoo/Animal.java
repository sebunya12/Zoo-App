/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vuproject;


public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
       

    public void eat() {
        System.out.println("This animal eats");
    }

    public void eat(String foodType) {
        System.out.println("The animal eats " + foodType);
       
    }
    
}
