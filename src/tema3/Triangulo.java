/*
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
 */
package tema3;

/**
 *

 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo(double unlado1,double unlado2,double unlado3,String uncolorRelleno,String uncolorLinea){
        lado1 = unlado1; lado2 = unlado2; lado3= unlado3;
        colorRelleno = uncolorRelleno; colorLinea = uncolorLinea;   
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    // Calcular el perímetro y devolverlo (método calcularPerimetro)
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    // Calcular el área y devolverla (método calcularArea)
    public double calcularArea(){
        double s = (calcularPerimetro())/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
}
