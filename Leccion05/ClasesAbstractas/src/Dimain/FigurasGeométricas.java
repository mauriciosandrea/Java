
package Dimain;

public abstract class FigurasGeométricas {
    protected String tipoFigura;
    
    protected FigurasGeométricas(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    //METODO ABSTRACTO
    public abstract void dibujar();
    
    //AGREGAMOS EL GET Y SET
    public String getTipoFigura(){
        return tipoFigura;
        
    }   
    public void setTipoFigura(String TipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString(){
        return"FigurasGeométricas{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
