import java.util.List;
import java.util.ArrayList;

public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String categoria;
    private Alumno jugadores;
 

    
    public Equipo(String nombre,String categoria,Alumno jugadores)
    {
       this.nombre = nombre;
       this.categoria = categoria;
       this.jugadores = jugadores;
      
    }
    
    public String getnombre(){
        return nombre;
    }
     public String getcategoria(){
        return categoria;
    }
    
   
  


    
}
