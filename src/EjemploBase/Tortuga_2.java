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
public class Tortuga_2 extends Thread {

    private Turtle tortuga;

    public Tortuga_2(Turtle tortuga) {
        this.tortuga = tortuga;
        this.tortuga.setPos(-170, -55);
    }

    @Override
    public void run() {

        this.tortuga.forward(25);
        this.tortuga.right(90);
        this.tortuga.penUp();
        this.tortuga.forward(25);
        this.tortuga.right(90);
        this.tortuga.penDown();
        this.tortuga.forward(25);
        this.tortuga.right(90);
        this.tortuga.forward(25);
        this.tortuga.right(90);
        this.tortuga.forward(25);
        this.tortuga.penUp();
        this.tortuga.right(90);
        this.tortuga.forward(25/2);
        this.tortuga.penDown();
        this.tortuga.left(180);
      
        int i = 0;            //Starting value
        while (i < 360/2) //Condition
        {
            tortuga.forward(1);   //Actions
            tortuga.right(2);
            i++;                //Increasing starting value
        }
        
        this.tortuga.penUp();
        this.tortuga.right(90);
        
        this.tortuga.forward(125);
        this.tortuga.left(90);
        this.tortuga.penDown();
        int a = 0;            //Starting value
        while (a < 360/2) //Condition
        {
            tortuga.forward(1);   //Actions
            tortuga.right(3);
            i++;                //Increasing starting value
        }
        

    }
    
}
