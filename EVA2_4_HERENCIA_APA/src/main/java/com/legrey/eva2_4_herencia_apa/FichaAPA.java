package com.legrey.eva2_4_herencia_apa;

public class FichaAPA {
    private String autor;
    private String titulo;
    private int anio;

    public FichaAPA(){
    this.autor = "____";
    this.titulo = "____";
    this.anio = 0;

    }
    
    
    //Autor
    public String getAutor(){
    return autor;
    }
    public void setAutor(String valor){
    autor = valor;
    }
    //Titulo
    public String getTitulo(){
    return titulo;
    }
    public void setTitulo(String valor){
    titulo = valor;
    }
    //Anio
    public int getAnio(){
    return anio;
    }
    public void setAnio(int valor){
    anio = valor;
    }
}
