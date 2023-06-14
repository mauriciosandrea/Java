
package test;

import domain.Empleado;
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());//SI QUEREMOS ACCEDER A METODOS ESCRITOR
        //Doucasting
        //((Escritor)empleado).getTipoEscritura(); //Tenemos dos Opciones esta es 1
        Escritor escritor = (Escritor)empleado;//Esta es la segunda opcion
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
    
    
}
