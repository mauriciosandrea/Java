
package ar.com.system2023.mundopc;


public class teclado extends DispositivosEntrada {
    private final int idteclado;
    private static int contadorteclado;
    
    
    public teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idteclado = ++teclado.contadorteclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idteclado +", "+super.toString()+ '}';
    }
    
}

