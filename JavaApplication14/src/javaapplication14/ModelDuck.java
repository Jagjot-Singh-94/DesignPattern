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
public class ModelDuck extends Duck{

    public ModelDuck(){
        flybehaviour=new FlyNoWay();
        quackbehaviour=new Quack();
    }
    @Override
    public void display() {
        System.out.println("Model Duck");
    }
    
}
