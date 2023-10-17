/*
 *B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área.

 */
package tema3;
import PaqueteLectura.Lector;
/**

 */
public class ejercicio5Circulo {
    public static void main(String[] args){
        Circulo circulo;
        System.out.println("radio: ");
        double radio = Lector.leerDouble();
        System.out.println("color relleno: ");
        String colorR = Lector.leerString();
        System.out.println("color linea: ");
        String colorL = Lector.leerString();
        circulo = new Circulo(radio,colorL,colorR);
        System.out.println("el perimetro es: "+ circulo.calcularPerimetro());
        System.out.println("el area: "+circulo.calcularArea());
    }
}
