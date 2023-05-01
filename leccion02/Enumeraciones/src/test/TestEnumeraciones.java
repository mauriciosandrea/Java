
package test;

import enumeraciones.Continentes;
import enumeraciones.Diaz;


public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Diaz.LUNES);
        indicarDiaSemana(Diaz.LUNES);//Las enumeraciones se tratan como cadenas
        //ahora nose deben utilizar comillas, se accede a traves del operador de punto
        System.out.println("Continente No. 4 "+Continentes.AMERICA);
        System.out.println("No. de paises en el 4to.continente "+Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to.continente "+Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente No. 1 "+Continentes.AFRICA);
        System.out.println("No. de paises en el 1ER.continente "+Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1ER.continente "+Continentes.AFRICA.getHabitantes());
        
        System.out.println("Continente No. 3ER "+Continentes.ASIA);
        System.out.println("No. de paises en el 3ER.continente "+Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3ER.continente "+Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente No. 2DO "+Continentes.EUROPA);
        System.out.println("No. de paises en el 2DO.continente "+Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2DO.continente "+Continentes.EUROPA.getHabitantes());
        
        System.out.println("Continente No. 5TO "+Continentes.OSEANIA);
        System.out.println("No. de paises en el 5TO.continente "+Continentes.OSEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to.continente "+Continentes.OSEANIA.getHabitantes());
    }
    
    private static void indicarDiaSemana(Diaz dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Quinto dia de la semana");
                break;
        }
    }
}
//Agregar los dias de la semana y agregar defaul