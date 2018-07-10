/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpuerta.adm;

import fpuerta.modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author fapg3
 */
public class LibroAdm {
    public ArrayList<Libro> obtenerListaLibros(){
        ArrayList<Libro> lista = new ArrayList();
        Libro libro1 = new Libro("Programación Orientada a Objetos", 148, "Sonia Jaramillo Valbuena, Leonardo Alonso Hernández Rodríguez", "ELIZCOM S.A.S");
        Libro libro2 = new Libro("Programación orientada a objetos con Java", 311, "Francisco Durán, Francisco Gutiérrez, Ernesto Pimentel", "Editorial Paraninfo");
        Libro libro3 = new Libro("Aprender la programación orientada a objetos con el lenguaje C#", 416, "Luc Gervais", "Ediciones ENI");
        Libro libro4 = new Libro("Lógica y programación orientada a los objetos: un inicio al desarrollo de software", 357, "Fray León Osorio Riveraz", "ITM");
        Libro libro5 = new Libro("JAVA 7: Bases del lenguaje y de la programación orientada a objetos", 155, "Thierry Groussard", "Ediciones ENI");
        Libro libro6 = new Libro("METODO DE LAS 6 ́D - modelamiento, algoritmo, porgramacion", 288, "Juan José Flores Cueto", "Editorial Macro");
        
        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);
        lista.add(libro6);
        return lista;
    }
}
