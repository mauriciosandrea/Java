package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{//Bloque de inicializacion estatico
        System.out.println("Ejecucion Bloque estatico");
        ++Persona.contadorPersonas;
        //idPersonas = 10  No es atributo estatico por eso hay error
    }
    
    {//Bolque de inicializacion NO estatico o(contexto dinamico)
        System.out.println("Ejecucion del bloque No estatico");
        this.idPersona = Persona.contadorPersonas++;//Incrementamos el atributo
    }
    
    //Los bloques de inicializacion se ejecuta antes del constructor
    //creamos un constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
        
    }
    public int getidPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
