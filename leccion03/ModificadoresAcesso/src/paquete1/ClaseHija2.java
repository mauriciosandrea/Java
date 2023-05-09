package paquete1;


public class ClaseHija2 extends Clase2 {
    public ClaseHija2() {
        super();
        this.atributoDefault = "Modificacion del atributo Defaul";
        System.out.println("Atributo = " + this.atributoDefault);
        this.metodoDefault();
    }
}
