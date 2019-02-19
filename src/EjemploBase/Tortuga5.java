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
public class Tortuga5 extends Thread {

    private Turtle tortuga;

    public Tortuga5(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.left(180);
        this.tortuga.penUp();
        this.tortuga.forward(15);
        this.tortuga.penDown();
        for (int i = 0; i < 6; i++) {
            this.tortuga.forward(20);
            this.tortuga.left(90);
        }
        this.tortuga.right(90);
        this.tortuga.penUp();
        this.tortuga.forward(35);
        this.tortuga.penDown();
        for (int i = 0; i < 2; i++) {
            this.tortuga.forward(15);
            this.tortuga.right(90);
            this.tortuga.forward(20);
            this.tortuga.right(90);
        }
    }
}
