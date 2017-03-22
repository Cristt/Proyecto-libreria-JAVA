
package Libros;

public class Genero implements Utilidades.Utilidades{
    
    private String nombreGenero;

    public Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

   
    @Override
    public void imprimeGenero() {
     System.out.println("Género: "+this.getNombreGenero());
    }
 
    @Override
    public void imprimeAutor() {}

 
    @Override
    public void imprimeClientes() {}

  
    @Override
    public void imprimeLibros() {}
    
    
}
