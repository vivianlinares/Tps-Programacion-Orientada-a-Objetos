/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Empresa;

/**
 *
 * @author cosito
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director director = new Director("juan",1214,2005,12.2,3);
        Empresa empresa = new Empresa("empresa1","callefalsa1234",director,3);
        Encargado encargado1 = new Encargado("pedro",12345,2000,23.34,2);
        Encargado encargado2 = new Encargado("luis",12345,2020,23.34,2);
        Encargado encargado3 = new Encargado("pablo",12345,2010,23.34,2);
        //System.out.println(encargado1.toString());
        empresa.asignarEncargado(encargado1,2);
        empresa.asignarEncargado(encargado2,0);
        empresa.asignarEncargado(encargado3,1);
        System.out.println(empresa.toString());
        
    }
    
}
