/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package tema3;

/**

 */
public class Estante {
    public int dmf;
    private int dml = 0;
    private Libro[] libros;

    //constructor que inicia sin libros
    public Estante(int dmf){
        this.libros = new Libro[dmf];  
        this.dmf = dmf;
    }
    
    //(i) devolver la cantidad de libros que almacenados 
    public int cantLibros(){
        return dml;
    }
    //(ii) devolver si el estante está lleno
    public boolean estaLleno(){
        if (dml == dmf){
            return true;
        }else{
            return false;
        }
    }
    public void agregarLibro(Libro libro) {
        if(dml < dmf){
            this.libros[dml] = libro;
            dml++;
        }
    }

    public int cuantosLibrosTenes() {
       return dml;
    }
    public String buscarEnEstante(String nombre){
        int i = 0;String nose;
        while((i < cuantosLibrosTenes())&&(libros[i].getTitulo().equals(nombre) ==false)){
            
            i++;
        }
        if (libros[i].getTitulo().equals(nombre)==true){
                nose =  libros[i].getPrimerAutor().toString();
            }else{
                nose = "no se encontro";
               
            }
        return nose;
    }   
}
