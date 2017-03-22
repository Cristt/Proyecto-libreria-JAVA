
package Libros;

import Persona.Autor;
import Persona.Clientes;

public class Libros{
    
    private String Titulo;
    private int precio;
    private Autor autor;
    private Genero genero;
    private Clientes cliente;

    public Libros(String Titulo, int precio, Autor autor, Genero genero, Clientes cliente) {
        this.Titulo = Titulo;
        this.precio = precio;
        this.autor = autor;
        this.genero = genero;
        this.cliente = cliente;
    }
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
    public void imprimeLibros() {
  
        
  System.out.println("Título del libro: "+ this.getTitulo());
  
    }
    
    public void imprimeAutor(){
    System.out.println("Autor: "+ this.getAutor());
    }
    
}
