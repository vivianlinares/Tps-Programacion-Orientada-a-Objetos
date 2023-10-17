/*
4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
de casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 */
public class ejercicio4 {
public static void main(String[] args){
        int dia;
        int columna,dni,edad;
        int dmfFila = 5; int dmfCol = 8;
        String nombre;
        String fin = "zzz";
        Persona[][] tabla = new Persona[dmfFila][dmfCol];
        Persona persona;
        int cant = 0;  
        System.out.println("ingresar nombre: ");nombre = Lector.leerString();
        System.out.println("dni: ");dni = Lector.leerInt();
        System.out.println("edad:");edad  =Lector.leerInt();
        System.out.println("dia: ");dia = Lector.leerInt();                      
         while((nombre.equals(fin) == false)&&(cant < (dmfFila * dmfCol))){
                columna=0;
                
                 while(( columna < dmfCol )&&(tabla[dia][columna] != null)){
                        columna++;
                 }
                 if (columna < dmfCol && tabla[dia][columna] == null){
                     persona = new Persona();
                     persona.setDNI(dni);persona.setEdad(edad);persona.setNombre(nombre);
                     tabla[dia][columna] = persona;
                     System.out.println("se guardo en la pos: "+dia+","+columna);
                     cant ++;
                 }else{
                     
                     System.out.println("no se encontro turno para el dia: "+dia);
                     
                 }
                
                System.out.println("nombre: ");
                nombre = Lector.leerString();
                if (nombre.equals(fin) == false){
                    System.out.println("dia:");dia = Lector.leerInt();
                    System.out.println("dni: ");dni = Lector.leerInt();
                    System.out.println("edad:");edad  =Lector.leerInt();
                }
         }
/*b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado*/
        for (int i = 0; i < dmfFila; i++){
              int cantInscripto = 0;
              System.out.println("_______");
             for(int j =0; j < dmfCol; j++){
                 if (tabla[i][j] != null){
                      cantInscripto ++;
                      // System.out.print("(dia:"+i+", turno:"+j+")"+tabla[i][j].getNombre()+"-");
                      System.out.println(" el dia: "+i+" en el turno: "+j+" se entrevista a: "+tabla[i][j].getNombre()+"-");
                 }
                 
            }
             System.out.println("la cant de inscriptos el dia: "+i+" fueron: "+cantInscripto);
            System.out.println();
        }
    }
}

