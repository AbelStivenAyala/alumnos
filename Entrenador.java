import java.util.List;
import java.util.ArrayList;

public class Entrenador
{
  private String nombre,especialidad;
  private List<Equipo> q;

       public Entrenador(String nombre,String especialidad){
      this.nombre = nombre;
      this.especialidad =especialidad;
      this.q = new ArrayList<>();
    }

    public String getnombre(){
        return nombre;
    }
    public String getespecialidad(){
        return especialidad;
    }
    public List<Equipo> getq(){
        return q;
    }
    
    public void addequip(Equipo e){
        q.add(e);
    }
     
}
