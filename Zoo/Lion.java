/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vuproject;


public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Makes a sound called a Roar");
    }

    @Override
    public void eat() {
        System.out.println("This animal also eats meat");
    }
}