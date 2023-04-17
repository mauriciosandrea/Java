
package mundopc;

import ar.com.system2023.mundopc.*;


public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);//importar la clase
         TecladoHP = new teclado("Bluetooh", "HP");
         Raton ratonHP = new Raton ("bluetooh", "HP");
         Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP,ratonHP);
         
         //creamos otrosobjetos de diferente marca
         Monitor monitorGamer = new Monitor("Gamer",32);//importar la clase
         TecladoGamer = new Teclado("Bluetooh", "Gamer");
         Raton ratonGamer = new Raton ("bluetooh", "Gamer");
         Computadora computadora = new Computadora("Computadora gamer", monitorGamer,tecladoGamer ,ratongamer);
         Orden orden1= new Orden();//inicializamos el arreglo vacio
         Orden orden2 = new Orden();//una nueva lista para el objeto 2
         orden1.agregarComputdora(computadoraHP);
         orden1.agregarComputdora(computadoraGamer);
         
         Computadora computadorasVarias = new Computadora("computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
         orden2.agregarComputdora(computadoraVarias);
         
         orden2.mostrarOrden();
         orden1.mostrarOrden();
         
         //crear mas objetos de tipo computadora con todos sus elementos
         //completar una lista en el objeto orden1 que llegue a los 10 elementos 
         //probar de esta manera los metos al maximo rendimiento
         
    
    
    
    

    }
}



