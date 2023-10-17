/*
1. Representar un concurso de baile. El concurso tiene a lo sumo N parejas. Cada pareja
tiene 2 participantes y un estilo de baile. De los participantes se tiene dni, nombre,
edad.
a) Genere las clases necesarias. Provea constructores para iniciar: el concurso para
un máximo de N parejas (inicialmente sin parejas cargadas); las parejas y los
participantes a partir de toda su información.
 b) Implemente métodos en las clases adecuadas para permitir:
 b1) Agregar una pareja al concurso. Asuma que hay lugar.
 b2) Obtener la diferencia de edad de la pareja.
 b3) Obtener la pareja con más diferencia de edad del concurso.
2. Realice un programa que instancie un concurso, cargue 2 parejas y a partir del
concurso muestre: los nombres de los participantes de la pareja con más diferencia de
edad.
 */
package parciales.concurso;
import PaqueteLectura.Lector;
public class main {

    public static void main(String[] args) {
        Concurso concurso; int edad; String nombre;
        concurso = new Concurso(2); Pareja pareja1,pareja2;
        Concursante c1,c2;
            edad = Lector.leerInt();
            nombre = Lector.leerString();
            c1 = new Concursante(nombre,444,edad);
            edad = Lector.leerInt();
            nombre = Lector.leerString();
            c2 = new Concursante(nombre,444,edad);
            pareja1 = new Pareja(c1,c2);
            concurso.agregarPareja(pareja1);
            edad = Lector.leerInt();
            nombre = Lector.leerString();
            c1 = new Concursante(nombre,444,edad);
            edad = Lector.leerInt();
            nombre = Lector.leerString();
            c2 = new Concursante(nombre,444,edad);
            pareja2 = new Pareja(c1,c2);
            concurso.agregarPareja(pareja2);
        
        System.out.println(concurso.maximaDifEdad());
        
    }
    
}
