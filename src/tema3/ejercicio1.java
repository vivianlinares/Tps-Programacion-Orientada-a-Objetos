/*
 B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área. 
 */
package tema3;
import PaqueteLectura.Lector;
public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("ingresar lado1, lado2,lado3, relleno y linea:");
        double lado1 = Lector.leerDouble();
        double lado2 = Lector.leerDouble();
        double lado3 = Lector.leerDouble();
        String relleno = Lector.leerString();
        String linea = Lector.leerString();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,relleno,linea);
        System.out.println("perimetro del triangulo: "+triangulo.calcularPerimetro());
        System.out.println("area: "+triangulo.calcularArea());
    }
    
}
