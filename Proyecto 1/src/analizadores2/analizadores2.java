/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores2;

/**
 *
 * @author Fernando Augusto
 */
public class analizadores2 {
    public static void main(String[] args){
        try {
            String ruta = "src/analizadores2/";
            String opcFlex[] = {ruta + "Lexico2.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico2.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
}
