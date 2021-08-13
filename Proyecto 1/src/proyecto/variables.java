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
public class variables {
    
    public String variable;
    public String valor;
    public String tipo;

    public variables(String variable, String valor, String tipo) {
        this.variable = variable;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getvariable() {
        return variable;
    }

    public void setvariable(String variable) {
        this.variable = variable;
    }

    public String getvalor() {
        return valor;
    }

    public void setvalor(String valor) {
        this.valor = valor;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }
    
}
