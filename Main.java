public class Main {
    public static void main(String[] args) {
        
        Deporte futbol = new Deporte("futbol");
        Deporte basquetbol = new Deporte("basquetbol");
      
        
        Alumno abel = new Alumno("Abel", 19, "masculino");
        
     
      
      abel.addDeporte(futbol);
        abel.addDeporte(basquetbol);
      
      
       
        System.out.println("El alumno " + abel.getNombre() + " practica:");
        for (Deporte deporte : abel.getDeportes()) {
            System.out.println("- " + deporte.getnombre());
        }
        
        
         Fecha fechaCompetencia = new Fecha(12, 6, 2024); // Por ejemplo, 12 de junio de 2024

        // Crear un entrenador
        Entrenador entrenadorEquipo1 = new Entrenador("Pedro", "Fútbol");
         Entrenador entrenadorEquipo2 = new Entrenador("Juan", "voleibol");

        // Crear un equipo y agregarlo a la competencia
        Equipo equipo1 = new Equipo("Equipo A", "Sub-21",abel);
        Equipo equipo2 = new Equipo("Equipo B", "Sub-19",abel);
        Competencia competencia = new Competencia("Torneo de Deportes", fechaCompetencia, "Estadio Principal");
        
        competencia.addequi(equipo1);
        competencia.addequi(equipo2);
        
             System.out.println("Competencia: " + competencia.getnombre());
        System.out.println("Fecha de inicio: " + competencia.getfecha().getdia() + "/" +
                           competencia.getfecha().getmes() + "/" +
                           competencia.getfecha().getaño()); // Utilizar getFecha() para obtener la fecha
        System.out.println("Lugar: " + competencia.getlugar());
        System.out.println("Equipos participantes:");

        for (Equipo equipo : competencia.geteq()) {
            System.out.println("- " + equipo.getnombre() + " (" + equipo.getcategoria() + ")");
        }
        
        entrenadorEquipo1.addequip(equipo1);
        entrenadorEquipo1.addequip(equipo2);
        
        System.out.println("El entrenador" + entrenadorEquipo1.getnombre() + " participa los equipos:");
        
        for(Equipo a : entrenadorEquipo1.getq()){
            System.out.println("-" + a.getnombre());
        }
        
        
    }
}
        
    