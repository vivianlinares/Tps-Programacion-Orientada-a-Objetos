/*
B- De igual manera, incluya la clase Círculo a la jerarquía de figuras.
 */
package tema4;

/**

 */
public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio, String relleno, String linea){
        super(relleno,linea);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI * radio;
    }
    //Calcular el área y devolverla (método calcularArea)
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    
}
