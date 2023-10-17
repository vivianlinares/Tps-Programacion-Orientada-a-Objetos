/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.concurso;

/**
 */
public class Pareja {
    private Concursante concursante1;
    private Concursante concursante2;
    public Pareja(Concursante c1, Concursante c2){
        this.concursante1 = c1;
        this.concursante2 = c2;
    }
    public Pareja(){
        
    }
    public Concursante getConcursante1() {
        return concursante1;
    }

    public void setConcursante1(Concursante concursante1) {
        this.concursante1 = concursante1;
    }

    public Concursante getConcursante2() {
        return concursante2;
    }

    public void setConcursante2(Concursante concursante2) {
        this.concursante2 = concursante2;
    }
    
}
