/*
 3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.
 */
package tema2;
import PaqueteLectura.Lector;
public class ejercicio3 {
    public static void main(String[] args){
        int dmlFila=0;
        int dmlCol,dni,edad;
        int dmfFila = 5; int dmfCol = 8;
        String nombre;
        String fin = "zzz";
        Persona[][] tabla = new Persona[dmfFila][dmfCol];
        Persona persona;
        
        System.out.println("ingresar nombre,dni,edad ("+dmlFila+","+0+")");
        nombre = Lector.leerString();
        dni = Lector.leerInt();
        edad  =Lector.leerInt();
        while((nombre.equals(fin) == false)&&(dmlFila < dmfFila)){
             dmlCol =0;
             while((nombre.equals(fin) == false)&&(dmlCol < dmfCol)){
                  persona = new Persona();
                  persona.setDNI(dni);persona.setEdad(edad);persona.setNombre(nombre);
                  tabla[dmlFila][dmlCol]=persona;
                  dmlCol++;
                  
                    System.out.println("ingresar nombre,dni,edad ("+dmlFila+","+dmlCol+")");
                    nombre = Lector.leerString();
                    if (nombre.equals(fin) == false){
                    dni = Lector.leerInt();
                    edad  =Lector.leerInt();
                  }
             }
             dmlFila ++;
         }
        for (int i = 0; i < dmlFila; i++){
              System.out.println("_______");
             for(int j =0; j < dmfCol; j++){
                 if (tabla[i][j] != null){
                     //b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
                     System.out.print("(dia:"+i+", turno:"+j+")"+tabla[i][j].getNombre()+"-");
                 }
                 
            }
            System.out.println();
        }
    }
}
