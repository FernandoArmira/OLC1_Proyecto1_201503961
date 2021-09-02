/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Fernando Augusto
 */
public class clasesJS {
    
    public String clase;
    public String archivo;

    public clasesJS(String clase, String archivo) {
        this.clase = clase;
        this.archivo = archivo;
    }

    public String getclase() {
        return clase;
    }

    public void setclase(String clase) {
        this.clase = clase;
    }

    public String getarchivo() {
        return archivo;
    }

    public void setarchivo(String archivo) {
        this.archivo = archivo;
    }
    
}
