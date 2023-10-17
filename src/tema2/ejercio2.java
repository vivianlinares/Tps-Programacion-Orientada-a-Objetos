/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
        
public class ejercio2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dni,i,minimo,mayores,edad;
        String nombre;
        int dmf=15;
        Persona[] vectorPersona = new Persona[dmf];
        Persona persona;
        Persona personaMin = new Persona();
        mayores= 0; minimo = 999;
        int dml=0;
        dni = GeneradorAleatorio.generarInt(1000);
        edad = GeneradorAleatorio.generarInt(100);
        nombre = GeneradorAleatorio.generarString(7);
        
        while(( edad != 0)&&(dml < dmf)){
           System.out.println(dml);
           persona = new Persona();
          // personaMin = persona;
           persona.setDNI(dni); persona.setEdad(edad); persona.setNombre(nombre);
           
           vectorPersona[dml] = persona;
           if (vectorPersona[dml].getEdad() > 65){
                mayores++;
            }
           //- Muestre la representación de la persona con menor DNI.
           if (vectorPersona[dml].getDNI() < minimo){
               minimo = vectorPersona[dml].getDNI();
 
               personaMin =vectorPersona[dml];
           }
           System.out.println("dni: "+dni);
           System.out.println("edad: "+edad);
           dml++;
           dni = GeneradorAleatorio.generarInt(9);
           edad = GeneradorAleatorio.generarInt(100);
           nombre = GeneradorAleatorio.generarString(7);
        }
        System.out.println("la cantidad de personas mayores de 65:"+mayores);
        System.out.println("la persona con el dni mas chico: "+personaMin.toString());
    }
}
