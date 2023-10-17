/*
  Además: las compras
mayoristas tienen el CUIT del comprador; 
 */
package parciales.comprasMinoristasMayo;

/**

 */
public class CompraMayorista extends Compra {
    private int cuit;

    public CompraMayorista (int cuit, int N, int nro){
        super(N,nro);
        this.cuit = cuit;
        
    }
    
    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    //Compra mayorista: “Nro:…, Productos (código/precio/descripción):…, Precio a pagar:…, CUIT:…” */
    @Override
    public String toString(){
        String aux;
        aux = "Compra mayorista: " + super.toString()+" CUIT: "+this.cuit;
        return aux;
    }
}
