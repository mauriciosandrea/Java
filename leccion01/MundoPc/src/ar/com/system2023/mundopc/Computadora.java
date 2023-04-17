
package ar.com.system2023.mundopc;


public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    
    //constructor vacio
    private Computadora(){
        this.idComputadora=++Computadora.contadorComputadoras;
    }
    //constructor 2
    public Computadora (String nombre, Monitor monitor, teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }
    public int getIdComputadora(){
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
}
