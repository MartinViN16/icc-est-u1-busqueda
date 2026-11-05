package models;

public class Persona {
    private String nombre;
    private int age;
    private String gender;
    
    public Persona(String nombre, int age, String gender) {
        this.nombre = nombre;
        this.age = age;
        this.gender = gender;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", age=" + age + ", gender=" + gender + "]";
    }
}
