package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clase envolvente o wrapper
        /*
            Clases envolvente de tipos primitivos
        int = la clase envolvente es integer
        
        long= la clase envolvente es long
        float= la clase envolvente es float
        double= la clase envolvente es double
        boolean
        byte
        char
        short
        */
        
        int enteroPrim = 10;//Tipo primitivo
        Integer entero = 10;//tipoobject con la clase integer
        System.out.println("entero = "+entero.doubleValue());//autoboxing
        
        int entero2 = entero;//unboxing
        System.out.println("entero2 "+ entero2);
        
    }
    
}
