/*20:51
Una cochera estacionamiento necesita gestionar sus sectores y coches ingresados. La cochera
tiene dos sectores (inferior y superior). Los sectores conocen el costo a cobrar por hora de
estacionamiento y la información del coche ingresado en c/u de sus 20 lugares. De los coches
se registra patente y cantidad de horas que estará en el estacionamiento.
1) Genere las clases necesarias. Implemente constructores. Tenga en cuenta que los sectores
se inician sin coches en sus lugares y que la cochera se inicia a partir del costo por hr. a cobrar
de cada sector.
2) Agregue los métodos necesarios, en las clases que correspondan, para permitir:
a), Ingresar un coche C en el primer lugar líbre de un sector. Asuma que seguro existe un lugar
libre. Devuelva el nro. del lugar que ocupará en el sector.
b) Ingresar un coche C a la cochera. El coche se ingresa al sector inferior si estará menos de 24
hrs, y en caso contrario se ingresa al sector superior. Asuma que hay espacio en ambos
sectores. Devuelva el nro. del lugar que ocupará en el sector.
c) Obtener la denominación del sector (“inferior” o “superior”) con más coches al momento.
3) Implemente un programa que instancie una cochera (con costo por hora para el sector
inferior de $250 y para el superior de $220). Ingrese 4 coches y muestre la denominación del
sector con más coches
 */
package parciales.Cochera;
import PaqueteLectura.Lector;
/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cochera cochera; Coche coche;
        String patente; int canth;
        for (int i = 0; i < 4; i++) {
             patente = Lector.leerString();
             canth = Lector.leerInt();
             coche = new Coche(patente, canth);
             cochera.insertarCoche(coche);
        }
    }
    
}
