package domain;

public class Gerente extends Empleado {
    private  String departamento;
    
    public Gerente (String nombre, double sueldo,String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo
    @Override
    public String obenerDetalles(){
        return super.obenerDetalles()+",Departamento: "+this.departamento;
    }
}
    


  