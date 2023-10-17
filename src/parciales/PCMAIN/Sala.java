/*
 *Representar Salas de PCs. Una Sala de PC tiene espacios (numerados de 1 a N) para N PCs. De las PCs
se conoce: estado (que indica si está encendida o apagada) y su consumo por hora.
a) Genere las clases necesarias. Provea constructores para iniciar: las PCs en apagado y a partir de un
consumo por hora; la sala con espacio para N PCs (N se recibe; inicialmente los espacios están vacíos).
b) Implemente los métodos necesarios, en las clases adecuadas, para permitir:
i- Dado un nro. de espacio válido y una PC, incluir la PC en ese espacio de la sala.
ii- Encender la PC apagada con menor consumo por hora.
iii- Obtener un string con los números de espacio que ocupan las PCs encendidas
c) Realice un programa que instancie una sala de PC con espacio para 5 PCs. Incluya 3 PCs a la sala, en
distintos espacios. Encienda las 2 PCs de la sala que menos consumen por hora. Imprimir el valor obtenido
del inciso iii).
 */
package parciales.PCMAIN;


public class Sala {
    private Pc []vector;
    private int dmf;
    private int dml =0;
    public Sala(int N){
        this.dmf = N;
        vector = new Pc[this.dmf];
    }
    public void insertarPc(Pc pc){
       this. vector[dml] = pc;
        System.out.println(" pos: "+dml+" consumo: " + vector[dml].getConsumo());
       dml++;
    }
    /*ii- Encender la PC apagada con menor consumo por hora.*/
    public void encender(){
        double min = 999; int espacioMin= getDmf();
        for (int i = 0; i < dml; i++) {
            if (vector[i].getEncendido() == false){
            if (vector[i].getConsumo() < min){
                espacioMin = i;
                min = vector[i].getConsumo();
            } } 
        }
        vector[espacioMin].setEncendido(true);
    }
    public int getDmf() {
        return dmf;
    }

    public void setDmf(int dmf) {
        this.dmf = dmf;
    }
    //iii- Obtener un string con los números de espacio que ocupan las PCs encendidas
    @Override
    public String toString(){
        String aux = " ";
        for (int i = 0; i < getDmf(); i++) {
            if (vector[i] != null){
            if(vector[i].getEncendido()){
                aux = aux + i+" este espacio esta encendido \n";
            }}
        }
        return aux;
    }
}
