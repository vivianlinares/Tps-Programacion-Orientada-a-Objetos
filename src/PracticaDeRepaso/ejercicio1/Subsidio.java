/*
De cada subsidio se conoce: el monto pedido, el motivo y si fue
otorgado o no.
 */
package PracticaDeRepaso.ejercicio1;

/**
 *
 */
public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado = false;
    /*c. Un subsidio sólo debería poder construirse con el monto pedido y el motivo.
Un subsidio siempre se crea en estado no-otorgado.*/
    public Subsidio(double mont, String moti){
        this.monto = mont;
        this.motivo = moti;
    }
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
    
}
