/*
 y las minoristas si el comprador es jubilado.
 */
package parciales.comprasMinoristasMayo;

/**
 *
 */
public class CompraMinorista extends Compra {
    private boolean esJubilado;
    
    public CompraMinorista (boolean esJ, int N, int nro){
        super(N,nro);
        this.esJubilado = esJ;
    }
    public boolean isEsJubilado() {
        return esJubilado;
    }

    public void setEsJubilado(boolean esJubilado) {
        this.esJubilado = esJubilado;
    }
    //Compra minorista: “Nro:… , Productos (código/precio/descripción):…, Precio a pagar:… , Es jubilado: …”
    @Override
    public String toString(){
        String aux;
        aux= "Compra minorista: " + super.toString() + " Es jubilado: " + esJubilado;
        return aux;
    }
}
