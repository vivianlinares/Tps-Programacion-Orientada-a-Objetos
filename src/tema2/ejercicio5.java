/*
 Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
    {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
-   Calcular e informar la cantidad de partidos que ganó River.
-    Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 *
 */
public class ejercicio5 {
    public static void main(String[] Args){
        int dmf = 20; String fin ="zzz"; String local; String visitante;
        int glocal, gvisi;
        Partido[] vector = new Partido[dmf];
        Partido partido;
        int dml = 0;
        System.out.println(" visitante: "); visitante=Lector.leerString();
        while((visitante.equals(fin)==false)&&(dml < dmf)){
            System.out.println("goles del visitante:"); gvisi = Lector.leerInt();
            System.out.println("local:"); local = Lector.leerString();
            System.out.println("goles del local: "); glocal = Lector.leerInt();
            partido = new Partido();
            partido.setLocal(local); partido.setGolesLocal(glocal);partido.setGolesVisitante(gvisi);
            partido.setVisitante(visitante);
            vector[dml] = partido;
            dml++;
            System.out.println(" visitante: "); visitante=Lector.leerString();
        }
        int cantRiver =0; int total = 0;
        for (int i=0; i <dml; i++){
            /*- Para cada partido, armar e informar una representación String del estilo:
            {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }*/
            System.out.println(vector[i].toString().toUpperCase());
            if(vector[i].getGanador().equals("River") ==true){
               cantRiver++; 
            }
            /*Calcular e informar el total de goles que realizó Boca jugando de local.*/
            System.out.println(vector[i].hayGanador());
            if ((vector[i].hayGanador() == true)&&(vector[i].getGanador().equals("Boca")== true)){
                if(vector[i].getLocal() == vector[i].getGanador()){
                    total = total+ vector[i].getGolesLocal();
                }
            }
        }
        System.out.println("river ganò: "+cantRiver+" partidos.");
        System.out.println(" el total de goles de Boca jugando de local es: "+total);
    }
}
