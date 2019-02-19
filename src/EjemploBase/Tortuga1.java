/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author white
 */
public class Tortuga1 extends Thread {

    private Turtle tortuga;

    public Tortuga1(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.setPos(-200,0);
        this.tortuga.right(90);
        this.tortuga.forward(185);
        this.tortuga.penUp();
        this.tortuga.setPos(-10,0);
        this.tortuga.penDown();
        this.tortuga.left(90);
        this.tortuga.forward(5);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(5);
        this.tortuga.penUp();
        this.tortuga.setPos(5,0);
        this.tortuga.penDown();
        this.tortuga.forward(5);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(5);
        
        
        this.tortuga.setPos(20,0);
        this.tortuga.forward(5);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.right(90);
        this.tortuga.forward(5);
        
        this.tortuga.right(90);
        this.tortuga.penUp();
        this.tortuga.setPos(70,0);
        this.tortuga.penDown();
        this.tortuga.forward(115);
        
        this.tortuga.hideTurtle();
    }

}
