/*
1-A- Incluya la clase Triángulo a la jerarquía de figuras vista (carpeta tema4). Triángulo
debe heredar de Figura todo lo que es común y definir su constructor y sus atributos y
métodos propios. Además debe redefinir el método toString.
 */
package tema4;

public class Triangulo extends Figura{
    private double lado1,lado2,lado3;
    public Triangulo(double lado1,double lado2, double lado3,String colorR,String colorL){
        super(colorR,colorL);
        this.lado1= lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
    @Override
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    @Override
    public double calcularArea(){
        double s = (calcularPerimetro())/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    @Override
    public String toString(){
        String aux = super.toString() + "lado 1: " + getLado1() + "lado2: "+getLado2() + "lado3: "+getLado3();
        return aux;
    }
}
