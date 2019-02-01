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
public abstract class Duck{
    FlyBehaviour flybehaviour;
    QuackBehaviour quackbehaviour;
    public Duck(){}

    public FlyBehaviour getFlybehaviour() {
        return flybehaviour;
    }

    public void setFlybehaviour(FlyBehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public QuackBehaviour getQuackbehaviour() {
        return quackbehaviour;
    }

    public void setQuackbehaviour(QuackBehaviour quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }
    public abstract void display();
    public void performQuack(){
quackbehaviour.quack();}
     public void performFly(){
flybehaviour.fly();}
     public void swim()
     {
         System.out.println("All duck swim, even decoy");
     }
}
