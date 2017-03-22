

package Persona;

import Libros.Libros;


public class Clientes extends Persona implements Utilidades.Utilidades{
    
    private String dni;
    private String historial;
    private Libros libros;

    //ARRAYLIST!!
    //private ArrayList <Libros> ListaLibros;
    
    
    //Constructor con 3 parámetros
    public Clientes(String dni, String historial, Libros libros) {
        this.dni = dni;
        this.historial = historial;
        this.libros = libros;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }
    

    public void imprimeClientes() {
        
        System.out.println("Cliente: "+this.getNombre());
        
    }

    @Override
    public void imprimeGenero() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeLibros() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAutor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
