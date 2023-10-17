/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados 
(ii) devolver si el estante está lleno
(iii) agregar un libro al estante 
(iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package tema3;
import PaqueteLectura.Lector;
 
 
public class programaPrincipal {
     public static void main(String[] args){
         /*Estante estante = new Estante(4);
         Autor autorUno = new Autor("juan ", " biografia tal ","origen tal");
         Autor autorDos = new Autor("Martin ", " biografia tal ","origen tal");
         Libro libro = new Libro("titulo1 ","editorial1 ",autorUno,"unISBN");
         Libro libro2 = new Libro("titulo2 ","editorial2 ",autorDos,"otroISBN");
         estante.agregarLibro(libro);
         estante.agregarLibro(libro2);
         System.out.println( estante.cuantosLibrosTenes());*/
         /*B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.*/
         String titulo; String nombre, biografia, editorial, isbn;
         Autor autor;
         Libro libro;
         Estante estante2 = new Estante(1);
         while (estante2.estaLleno() != true){
             System.out.println("titulo: "); titulo = Lector.leerString();
             System.out.println("nombre: "); nombre = Lector.leerString();
             System.out.println("bio: "); biografia = Lector.leerString();
             System.out.println("editorial: "); editorial = Lector.leerString();
             System.out.println("isbn: "); isbn = Lector.leerString();
             autor = new Autor(nombre, biografia);
             libro = new Libro(titulo,editorial,autor,isbn);
             estante2.agregarLibro(libro);
         }
         System.out.println(estante2.buscarEnEstante("mujercita"));
        
     }
}
