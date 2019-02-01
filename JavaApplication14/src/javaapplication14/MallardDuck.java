/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author jagjosin
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
    flybehaviour= new FlyWithWings();
    quackbehaviour=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }

}
