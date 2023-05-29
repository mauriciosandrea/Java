package test;

import domain.*;

//polimorfismo
public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",1000);
        imprimir(empleado1);
       // System.out.println("empleado1 = " + empleado1.obenerDetalles());
        empleado1 = new Gerente("Joee",5000,"Sistemas");
        imprimir(empleado1);
        //System.out.println("gerente1 = " + gerente1.obenerDetalles());
    } 

    
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obenerDetalles();
        System.out.println("detalles = " +detalles);
    }
}
    
 