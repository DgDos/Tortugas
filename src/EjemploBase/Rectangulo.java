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
public class Rectangulo extends Thread{

    private Turtle tortuga;

    public Rectangulo(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        
        this.tortuga.right(90);
        this.tortuga.penUp();
        this.tortuga.forward(50);
        this.tortuga.penDown();
        for( int i=0;i<4;i++){
            this.tortuga.forward(100);
            this.tortuga.right(90);
        }
        
    }
}