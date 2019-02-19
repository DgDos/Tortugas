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
public class Tortuga4 extends Thread {

    private Turtle tortuga;

    public Tortuga4(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {

        this.tortuga.penUp();
        this.tortuga.forward(15);
        this.tortuga.right(90);
        this.tortuga.forward(10);
        this.tortuga.forward(15);
        this.tortuga.left(90);
        this.tortuga.penDown();
        for (int i = 0; i < 3; i++) {
            this.tortuga.forward(15);
            this.tortuga.left(90);
        }
        this.tortuga.forward(7.5);
        this.tortuga.left(90);
        this.tortuga.penUp();
        this.tortuga.forward(2);
        this.tortuga.right(90);
        this.tortuga.penDown();
        for (int i = 0; i < 360 / 10; i++) {
            this.tortuga.left(10);
            this.tortuga.forward(1);
        }
        this.tortuga.penUp();
        this.tortuga.right(90);
        this.tortuga.forward(2);
        this.tortuga.left(90);
        this.tortuga.forward(7.5);
        this.tortuga.forward(15);
        this.tortuga.left(90);
        this.tortuga.forward(5);
        this.tortuga.penDown();
        for (int i = 0; i < 6; i++) {
            this.tortuga.forward(15);
            this.tortuga.right(90);
        }
        this.tortuga.left(90);
        this.tortuga.penUp();
        this.tortuga.forward(5);
        this.tortuga.penDown();
        for(int i=0;i<6;i++){
            this.tortuga.forward(5);
            this.tortuga.right(90);
        }
        this.tortuga.left(90);
        this.tortuga.penUp();
        this.tortuga.forward(5);
        this.tortuga.penDown();
        for(int i=0;i<4;i++){
            this.tortuga.forward(5);
            this.tortuga.right(90);
        }
        this.tortuga.hideTurtle();
              
    }
}
