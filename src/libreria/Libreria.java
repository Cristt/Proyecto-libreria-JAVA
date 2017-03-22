
package libreria;

import Libros.Genero;
import Libros.Libros;
import Persona.Autor;
import Persona.Clientes;


public class Libreria {

   
    public static void main(String[] args) {
        
        System.out.println("Informes...");
        
        Libros libro1=null;
        Autor autor1=null;
        Genero genero1=null;
        Clientes cliente1=null;
        
        libro1=new Libros("Titulo", 0, autor1, genero1, cliente1);
        autor1=new Autor("pseudonimo", libro1);
        autor1.setNombre("Perez Reverte");
        autor1.setApellido("Reverte Perez");
        genero1=new Genero("Nombre del genero");
        cliente1=new Clientes("dni", "historial", libro1);
        cliente1.setNombre("Manolito");
        cliente1.setApellido("Gafotas");
        
        libro1.imprimeLibros();
        genero1.imprimeGenero();
        cliente1.imprimeClientes();
        autor1.imprimeAutor();
        
        
        
    }
    
}
