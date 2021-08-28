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
public class comentarioJS {
    
    public String comentario;
    public String archivo;

    public comentarioJS(String comentario, String archivo) {
        this.comentario = comentario;
        this.archivo = archivo;
    }

    public String getcomentario() {
        return comentario;
    }

    public void setcomentario(String comentario) {
        this.comentario = comentario;
    }

    public String getarchivo() {
        return archivo;
    }

    public void setarchivo(String archivo) {
        this.archivo = archivo;
    }

    
}
