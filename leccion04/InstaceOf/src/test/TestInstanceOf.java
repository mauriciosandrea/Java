package test;

import domain.*;

//polimorfismo
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",1000);
        determinarTipo(empleado1);
       
        empleado1 = new Gerente("Joee",5000,"Sistemas");
       // determinarTipo(empleado1);
      
    } 

    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;//hacemos la conversion de esta menera manual.
            //System.out.println("gerente = " + gerente.getDepartamento());
            ((Gerente) empleado).getDepartamento();//lo asigna el ide automaticamente hace la conversion
            
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Emplado");
            //Gerente gerente = (Gerente)empleado;
        //    System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
           // System.out.println("Es de tipo object");
        }
    }
     
}
    
 