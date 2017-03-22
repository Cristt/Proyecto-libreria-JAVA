

package Persona;

import Libros.Libros;


public class Autor extends Persona implements Utilidades.Utilidades{
    
    private String pseudonimo;
    private Libros libro;

    public Autor(String pseudonimo, Libros libro) {
        this.pseudonimo = pseudonimo;
        this.libro = libro;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    
    public void imprimeAutor() {
        
       System.out.println("Autor del libro: "+this.getNombre());
        
    }

    @Override
    public void imprimeGenero() {
        //System.out.println("");
    }

    @Override
    public void imprimeLibros() {
        System.out.println("Título del libro "+this.getLibro().getTitulo());
    }

    @Override
    public void imprimeClientes() {
    }
    
}


