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
public class ContornoEdificios extends Thread{
    
    private Turtle tortuga;

    public ContornoEdificios(Turtle tortuga)  {
        this.tortuga = tortuga;
    }

    
    public void run() {
        this.tortuga.setPos(-15,15);
        this.tortuga.right(180);
        this.tortuga.forward(50);
        this.tortuga.left(90);
        this.tortuga.forward(50);
        this.tortuga.right(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(35);
        this.tortuga.left(90);
        this.tortuga.forward(95);
        this.tortuga.left(90);
        this.tortuga.forward(35/2);
        
        this.tortuga.forward(20);
        this.tortuga.right(135);
        this.tortuga.forward(20*Math.sqrt(2));
        this.tortuga.right(90);
        this.tortuga.forward(20*Math.sqrt(2));
        this.tortuga.right(135);
        this.tortuga.forward(20);
        this.tortuga.forward(35/2);
        
        this.tortuga.left(90);
        this.tortuga.forward(25);
        this.tortuga.right(90);
        this.tortuga.forward(50);
         this.tortuga.right(180);
         this.tortuga.forward(55);
         this.tortuga.right(90);
         this.tortuga.forward(50);
         this.tortuga.right(90);
         this.tortuga.forward(5);
         this.tortuga.setPos(0,0);
         this.tortuga.penUp();
         this.tortuga.forward(100);
         this.tortuga.hideTurtle();
                
//         this.tortuga.right(90);
//         this.tortuga.forward(15);
//        this.tortuga.right(90);
//        this.tortuga.penUp();
//        this.tortuga.forward(50);
//        this.tortuga.penDown();
//        for( int i=0;i<4;i++){
//            this.tortuga.forward(100);
//            this.tortuga.right(90);
//        }
        
    }
    
}
