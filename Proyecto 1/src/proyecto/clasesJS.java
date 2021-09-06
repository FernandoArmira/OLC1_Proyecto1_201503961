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
    public double id;
    public double parametros;
    public double lineas;

    public clasesJS(String clase, String archivo, double id, double parametros, double lineas) {
        this.clase = clase;
        this.archivo = archivo;
        this.id = id;
        this.parametros = parametros;
        this.lineas = lineas;
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
