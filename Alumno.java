
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private int edad;
    private String genero;
    private List<Deporte> deportes; 

    public Alumno(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.deportes = new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

     public void addDeporte(Deporte deporte) {
        deportes.add(deporte); 
    }
}
