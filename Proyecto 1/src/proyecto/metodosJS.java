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
public class metodosJS {
    public String metodo;
    public String archivo;
    public double id;
    public double parametros;
    public double lineas;

    public metodosJS(String metodo, String archivo, double id, double parametros, double lineas) {
        this.metodo = metodo;
        this.archivo = archivo;
        this.id = id;
        this.parametros = parametros;
        this.lineas = lineas;
    }

    public String getmetodo() {
        return metodo;
    }

    public void setmetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getarchivo() {
        return archivo;
    }

    public void setarchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public double getid() {
        return id;
    }

    public void setid (double id) {
        this.id = id;
    }
    public double getparametros() {
        return parametros;
    }

    public void setparametros (double parametros) {
        this.parametros = parametros;
    }
    public double getlineas() {
        return lineas;
    }

    public void setlineas (double lineas) {
        this.lineas = lineas;
    }
    
}
