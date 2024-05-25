import java.util.List;
import java.util.ArrayList;

public class Competencia
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Fecha fecha; 
    private String lugar;
    

    private List<Equipo> eq;
   
    public Competencia(String nombre, Fecha fecha,String lugar)
    {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.eq = new ArrayList<>(); 
    }

   
   public String getnombre(){
       return nombre;
   }
   public Fecha getfecha(){
       return fecha;
   }
   public String getlugar(){
       return lugar;
   }
   
       public List<Equipo> geteq() {
        return eq;
    }

   
        public void addequi(Equipo po) {
        eq.add(po); 
    }
}
