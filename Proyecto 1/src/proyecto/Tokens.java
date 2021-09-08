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
public class Tokens {
    
    public String tipoError;
    public String valorError;
    public int fila;
    public int columna;
    public String archivo;

    public Tokens(String tipoError, String valorError, int fila, int columna, String archivo) {
        this.tipoError = tipoError;
        this.valorError = valorError;
        this.fila = fila;
        this.columna = columna;
        this.archivo = archivo;
    }

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    public String getValorError() {
        return valorError;
    }

    public void setValorError(String valorError) {
        this.valorError = valorError;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public String getArchivo() {
        return archivo;
    }

    public void setTipoArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
}
