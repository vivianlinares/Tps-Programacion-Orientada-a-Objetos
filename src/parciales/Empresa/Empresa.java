//12:17
package parciales.Empresa;

public class Empresa {
    private String nombre;
    private String direccion;
    private Director directorEje;
    private Encargado []vector;
    private int N;

    public Empresa(String nombre, String direccion, Director directorEje, int N) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.directorEje = directorEje;
        this.N = N;
        vector = new Encargado[this.N];
    }
    public void asignarEncargado(Encargado encargado, int x){
        if (vector[x] == null){
        vector[x] = encargado;
        }
    }

    @Override
    public String toString() {
        String aux = ""; String existe = "no existe";
        for (int i = 0; i < this.N; i++) {
            if(vector[i]==null){
                existe = " si existe";
            }else{
                aux = aux+"Encargado:"+vector[i].toString()+" numero de sucursal: "+i+"\n";
            }
            
        }
        return "Empresa: " + "nombre=" + nombre + ", direccion:" + direccion + ", directorEje:" +"\n"+ directorEje.toString()
                +"\n"+ aux+existe;
    }
          
}
