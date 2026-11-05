import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"), 
            new Persona("Pedro", 20, "M"), 
            new Persona("Ana", 28, "F"));
    
        BusquedaLineal busqueda = new BusquedaLineal(personas);
    
        System.out.println(busqueda.findByName("Maria"));

        System.out.println(busqueda.findByName("Diego"));

        System.out.println(busqueda.findPosByName("ANa"));

        System.out.println(busqueda.findPosByName("Ana"));
    }
}