
package tema1;
/*2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java*/
//Paso 1: Importar la funcionalidad para lectura de datos
    import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
            double []vector;
        //Paso 3: Crear el vector para 15 double 
            vector = new double[15];
        //Paso 4: Declarar indice y variables auxiliares a usar
            int i,cant; double sumatoria, promedio; 
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
            sumatoria = 0; cant=0;
            for (i=0; i < 15; i++ ){
                System.out.println("ingresar altura "+i);
                vector[i]=Lector.leerDouble();
                sumatoria = sumatoria + vector[i];
                System.out.println("va sumando: "+ sumatoria);
            }
        //Paso 7: Calcular el promedio de alturas, informarlo
                promedio =sumatoria/15;
                System.out.println("promedio: "+  promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
            for (i=0; i < 15; i++ ){
                if (promedio < vector[i]){
                    cant++;
                    System.out.println("la altura : "+i+" es mayor al promedio");
                };
            }
        //Paso 9: Informar la cantidad.
        System.out.println("la cantidad de alturas por arriba del promedio son: "+cant);
    }
    
}
