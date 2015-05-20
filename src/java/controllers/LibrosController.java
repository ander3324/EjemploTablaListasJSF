/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.Libro;

/**
 *
 * @author ander
 */
@ManagedBean(name = "libC")
@SessionScoped
public class LibrosController {

    //Objetos que serán accedidos desde la pagina web:
    private Libro libro;
    private LinkedList<Libro> lista;

    /**
     * Creates a new instance of LibrosController
     */
    public LibrosController() {
        libro = new Libro();
        cargarListaLibros();
    }

    void cargarListaLibros() {
        
        lista = new LinkedList<>();
        
        //Cargar el libro por defecto...
        libro = new Libro(1234, "THE JAVA EE TUTORIAL", "ORACLE CORP.", Date.valueOf("2015-05-12"));
        lista.add(libro);
        
        //Usar constructor con parámetros...
        libro = new Libro(2334, "El Puente", "David Remnick", Date.valueOf("2010-02-22"));
        lista.add(libro);
    }
    
    //Metodos que redireccionan las páginas web:
    public String doVolver(){
        return "index";
    }
    
    public String doNuevo(){
        //Crear una nueva instancia de libro:
        libro = new Libro();
        return "nuevo";
    }
    
    public String doGuardar(){
        lista.add(libro);
        return "index";
    }

    public void borrarLista() {
        getLista().clear();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LinkedList<Libro> getLista() {

        return lista;
    }

    public void setLista(LinkedList<Libro> lista) {
        this.lista = lista;
    }

}
