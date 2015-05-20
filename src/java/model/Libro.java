/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author ander
 */
public class Libro {
    
    private long isbn;
    private String titulo;
    private String autor;
    private Date fecha;
    
    public Libro()
    {
        
    }
    //Constructor con parámetros:
    public Libro(int id, String tit, String aut, Date fec){
        isbn = id;
        titulo = tit;
        autor = aut;
        fecha = fec;
    }

    //Getters y Setters
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
