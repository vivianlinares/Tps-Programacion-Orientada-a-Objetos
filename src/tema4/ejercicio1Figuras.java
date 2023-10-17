/*
E- Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
representación String de cada uno. Pruebe el funcionamiento del método despintar.

 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 */
public class ejercicio1Figuras {
    public static void main(String[] Args){
        Triangulo triangulo = new Triangulo(1,2,3,"rosa","amarillo");
        Circulo circulo = new Circulo(2,"verde","celeste");
        System.out.println(triangulo.toString());
        triangulo.despintar();
        System.out.println(triangulo.toString());
    }
}
