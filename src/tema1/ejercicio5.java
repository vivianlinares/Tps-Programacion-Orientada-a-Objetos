/*
 5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
 */
package tema1;
import PaqueteLectura.Lector;
// columnas son los puntajes |att.cliente(0)||calidad(1)||precio(2)||ambiente(3)|
// clientes son las filas    |    
/**
 *
 * @author cosito
 */
public class ejercicio5 {
     public static void main(String[] args){
         int i,j; int [][]tabla = new int [5][4];
         int []tablaSuma =new int [4];
         
         
         for ( i = 0; i < 5; i++){
            System.out.println(i+"er cliente");
            for( j = 0; j < 4; j++){
                System.out.println("--"+j+"---");
                tabla[i][j] = Lector.leerInt();
                tablaSuma[j] = tablaSuma[j] + tabla[i][j];
            }
         }
        for (j = 0; j < 4; j++){
             System.out.println("el promedio para ("+j+") es: "+(double)tablaSuma[j]/5);
        }
     }
}
