/*
 Un evento ocasional es un recital que además tiene el motivo (a beneficio, show de TV
o show privado), el nombre del contratante del recital y el día del evento.
 */
package PracticaDeRepaso.ejercicio3;

/**
 *
 * @author cosito
 */
public class EventoOcasional extends Recital {
    private String motivo;
    private String contratante;
    private int dia;
    /*El constructor de eventos ocasionales además
recibe el motivo, el nombre del contratante y día del evento.*/
    public EventoOcasional(String banda, int dmf, String motivo, String cont, int dia){
        super(banda,dmf);
        this.contratante = cont;
        this.dia = dia;
        this.motivo = motivo;
    }
  /*iii. El evento ocasional debe saber responder al mensaje actuar de manera distinta:
 Si es un show de beneficencia se imprime la leyenda “Recuerden colaborar con…“
seguido del nombre del contratante.
 Si es un show de TV se imprime “Saludos amigos televidentes”
 Si es un show privado se imprime “Un feliz cumpleaños para…” seguido del
nombre del contratante.*/  
    @Override
    public void actuar(){
        System.out.println("recuerden colaborar con "+getContratante());
        if (getMotivo().equals("show tv") == true){
            System.out.println("saludos amigos televidentes");
        }
        if(getMotivo().equals("show privado") == true){
            System.out.println("un feliz cumpeaño para "+getContratante());
        }
        super.actuar();
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    @Override
    public double calcularCosto(){
        double aux = 0;
        if (getMotivo().equals("beneficio")){
            return aux;
        }
        if (getMotivo().equals(" show tv")){
            return aux = 50000;
        }
        if (getMotivo().equals("privado")){
            return aux =150000;
        }
        return aux;
    }
}
