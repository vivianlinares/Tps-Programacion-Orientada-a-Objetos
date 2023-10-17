/* 11:09 - 11:30
 Representar Salas de PCs. Una Sala de PC tiene espacios (numerados de 1 a N) para N PCs. De las PCs
se conoce: estado (que indica si está encendida o apagada) y su consumo por hora.
a) Genere las clases necesarias. Provea constructores para iniciar: las PCs en apagado y a partir de un
consumo por hora; la sala con espacio para N PCs (N se recibe; inicialmente los espacios están vacíos).
b) Implemente los métodos necesarios, en las clases adecuadas, para permitir:
i- Dado un nro. de espacio válido y una PC, incluir la PC en ese espacio de la sala.
ii- Encender la PC apagada con menor consumo por hora.
iii- Obtener un string con los números de espacio que ocupan las PCs encendidas
c) Realice un programa que instancie una sala de PC con espacio para 5 PCs. Incluya 3 PCs a la sala, en
distintos espacios. Encienda las 2 PCs de la sala que menos consumen por hora. Imprimir el valor obtenido
del inciso iii). */
package parciales.PCMAIN;

/**
 *
 * @author cosito
 */
public class main {

    public static void main(String[] args) {
        Sala sala = new Sala(5);
        Pc pc1 = new Pc(); Pc pc2 = new Pc(); Pc pc3 = new Pc();
        
        sala.insertarPc(pc1);
        sala.insertarPc(pc2);
        sala.insertarPc(pc3);
        sala.encender();
        sala.encender();
        System.out.println(sala.toString());
    }
    
}
