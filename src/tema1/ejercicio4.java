/*
 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
 */
package tema1;
import PaqueteLectura.Lector;
/**
 *
 * @author cosito
 */
public class ejercicio4 {
    public static void main(String[] args) {
    //4 oficinas son las columnas,8 los pisos son las filas
    int [][]edificioTabla = new int[8][4];
    int i,j;
    for ( i = 0; i < 8; i++){
        for( j = 0; j < 4; j++){
            edificioTabla[i][j]=0;
        }
    }
        System.out.println("ingresar oficina:");
        j = Lector.leerInt() - 1;
        System.out.println("ingresar piso:");
        i = Lector.leerInt() - 1; 
        
    while(j < 9 - 1){
        
        edificioTabla[i][j]++;
        System.out.println("ingresar oficina:");
        j = Lector.leerInt()-1;
        System.out.println("ingresar piso:");
        i = Lector.leerInt()-1; 
    }
    
     for (i = 0; i < 8; i++){
        for(j = 0; j < 4; j++){
            System.out.print("-"+edificioTabla[i][j]);
        }
        System.out.println();
    }
    }
}
