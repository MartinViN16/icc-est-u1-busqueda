import java.util.List;

import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;
    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;
    }

    //BUSCAR UNA PERSONA
    // RETORNE LA PERSONA SI LO ENCUENTRA
    //RETORNE ---NULL--- SI NO LO ENCUENTRA
    public Persona findByName(String name){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombre().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }

    public int findPosByName(String name){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombre().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
