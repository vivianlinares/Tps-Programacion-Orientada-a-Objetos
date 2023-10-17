/*
15:50-15:58 16:09-16:35
 */
package parciales.EstacionMain;

/**
 *
 * @author cosito
 */
public class Venta {
    private int dni;
    private double litros;
    private double monto;
    private String tipoPago;

    public Venta(int dni, double litros, double monto, String tipoPago) {
        this.dni = dni;
        this.litros = litros;
        this.monto = monto;
        this.tipoPago = tipoPago;
    }

    public Venta(int dni, double litros, String tipoPago) {
        this.dni = dni;
        this.litros = litros;
        this.tipoPago = tipoPago;
    }
    
}
