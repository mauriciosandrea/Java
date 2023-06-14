
package Dimain;

public class Rectangulo extends FigurasGeométricas {
    //CONSTRUCTOR
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){ //IMPLEMENTANDO EL METODO
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
    
}
