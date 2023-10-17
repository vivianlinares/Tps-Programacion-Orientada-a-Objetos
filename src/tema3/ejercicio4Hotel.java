/*
 4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
B- Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.
NOTAS: Reúse la clase Persona. Para cada método solicitado piense a qué clase debe
delegar la responsabilidad de la operación.
 */
package tema3;
import PaqueteLectura.Lector;
import tema2.Persona;
/**
 */
public class ejercicio4Hotel {
    public static void main(String[] Args){
        String nombre;
        int numero; habitacion habitacion; Persona persona;
        System.out.println("ingresar numero de habitaciones");
        int dmf = Lector.leerInt();
        //Realice un programa que instancie un hotel
        Hotel hotel = new Hotel(dmf);
        // ingrese clientes en distintas habitaciones,
        System.out.println("nombre: "); nombre = Lector.leerString();
        System.out.println("ingresar numero de habitacion del cliente");numero = Lector.leerInt();
            
        while(numero < dmf) {
            persona = new Persona(nombre,2344,23);
            habitacion = new habitacion(234,persona);
            hotel.agregarHabitacion(habitacion, numero);
            System.out.println("nombre: "); nombre = Lector.leerString();
            System.out.println("ingresar numero de habitacion del cliente");numero = Lector.leerInt();
        }
        //muestre el hotel
        System.out.println(hotel.toString());
        // aumente el precio de las habitaciones 
        hotel.aumentarprecio(12);
        //vuelva a mostrar el hotel.
        System.out.println("se auntò 12");
        System.out.println(hotel.toString());
    }
}
