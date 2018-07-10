/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpuerta.modelo;

/**
 *
 * @author fapg3
 */
public class Libro {
    String titulo;
    int nroPaginas;
    String autor;
    String editorial;

    public Libro(String titulo, int nroPaginas, String autor, String editorial) {
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }
    
    
}
