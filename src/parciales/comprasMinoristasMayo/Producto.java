/*
De cada producto registra: código, precio y descripción.
 */
package parciales.comprasMinoristasMayo;
/**
 */
public class Producto {
    private int codigo;
    private double precio;
    private String descripcion;
    
    public Producto(){
        
    }
    @Override
    public String toString(){
        return " "+codigo +" "+ precio +" "+ descripcion + "\n";
    }
    public Producto(int cod, double pre, String descrip){
        this.codigo = cod;
        this.precio = pre;
        this.descripcion = descrip;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
