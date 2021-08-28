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
public class variablesJS {
    
    public String variable;
    public String archivo;

    public variablesJS(String variable, String archivo) {
        this.variable = variable;
        this.archivo = archivo;
    }

    public String getvariable() {
        return variable;
    }

    public void setvariable(String variable) {
        this.variable = variable;
    }

    public String getarchivo() {
        return archivo;
    }

    public void setarchivo(String archivo) {
        this.archivo = archivo;
    }

}
