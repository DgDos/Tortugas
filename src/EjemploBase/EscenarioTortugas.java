/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2=null;
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga2 = new Turtle(this);
    }
    
    public void iniciar(){
        Tortuga5 t=new Tortuga5(tortuga1);
        t.start();
        Tortuga4 r=new Tortuga4(tortuga2);
        r.start();
       
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
