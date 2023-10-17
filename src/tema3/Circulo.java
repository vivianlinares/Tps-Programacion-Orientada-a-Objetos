/*
 5-A- Definir una clase para representar círculos. Los círculos se caracterizan por su radio
(double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área.
NOTA: la constante PI es Math.PI
 */
package tema3;

/**
 *
 */
public class Circulo {
    private double radio;
    private String colorR;
    private String colorL;
    //Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    public Circulo(double radio, String colorL, String colorR){
        this.colorL = colorL;
        this.colorR = colorR;
        this.radio = radio;
    }
    //Provea métodos para:
    //Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }
    //Calcular el perímetro y devolverlo (método calcularPerimetro)
    public double calcularPerimetro(){
        return 2*Math.PI * radio;
    }
    //Calcular el área y devolverla (método calcularArea)
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
