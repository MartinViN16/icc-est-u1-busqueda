
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import models.Persona;

public class BusquedaBinaria {
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas){
        this.personas = personas;
    }
    public Integer findByName(String name){
        int lo = 0;
        int hi = personas.size();

        while(lo <= hi){
            int mid = (lo - hi)/2;
            if(personas.get(mid).getName().equals(name)){
                return mid;
            } if(personas.get(mid).getName().compareTo(name) < 0){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    return -1;
    }

    public int findByAge(int age){

        personas.sort(Comparator.comparing(Persona :: getAge));
        int lo = 0;
        int hi = personas.size() - 1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            
            if(personas.get(mid).getAge() == age){
                return mid;
            } else if(personas.get(mid).getAge() < age){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public int findByPerson(Persona p){
        if(p == null){
            return -1;
        }

        for(int i = 0; i < personas.size(); i++){
            Persona current = personas.get(i);
            if(current.getAge() == p.getAge()
                    && Objects.equals(current.getName(), p.getName())
                    && Objects.equals(current.getGender(), p.getGender())){
                return i;
            }
        }
        return -1;
    }
}
