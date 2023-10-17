/*
 3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
NOTA: Dispone de un esqueleto para este programa en Ej03Matrices.java
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
    import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio 
            GeneradorAleatorio.iniciar();
	 
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][]tabla = new int [5][5];
        int i,j;
        for (i = 0; i <5; i++){
            for(j = 0; j < 5; j++){
                tabla[i][j] = GeneradorAleatorio.generarInt(31);
            }
        };
        //Paso 4. mostrar el contenido de la matriz en consola
            for (i = 0; i <5; i++){
                System.out.print("(fila:"+ i +")");
                for(j = 0; j < 5; j++){
                      System.out.print("-"+tabla[i][j]+"-");
                }
               System.out.println();
            }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int sumatoria_Fila1; sumatoria_Fila1 =0;
        for (j = 0; j < 5 ; j++){
            sumatoria_Fila1 = sumatoria_Fila1 + tabla[1][j];
        }
        System.out.println(" la fila 1 en total suma: "+sumatoria_Fila1);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j 
        //contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int []vector = new int[5];
            for(j = 0; j < 5; j++){
                for (i = 0; i <5; i++){
                    vector[j]=vector[j]+tabla[i][j];
                }
            }
            for (j = 0; j<5; j++){
                System.out.println("la suma de los elementos en: "+j+" es: "+vector[j]);
            }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        int valor, fila, columna; boolean encontro = false; 
        fila =0; columna = 0;
        System.out.println("leer un valor: ");
        valor = Lector.leerInt();
        for (i = 0; i <5; i++){
                for(j = 0; j < 5; j++){
                      if(tabla[i][j] == valor){
                          encontro = true;
                          fila = i;
                          columna = j;
                          //System.out.println("encontrado en fila: "+i+"columna: "+j);
                      }
                     /*{
                          System.out.println("no se encontrò el elemento");
                      }*/
                } 
        }
        if (encontro){
            System.out.println("encontrado en fila: "+fila+"columna: "+columna);
        } else{
            System.out.println("no se encontrò el elemento");
        }
    }
}
