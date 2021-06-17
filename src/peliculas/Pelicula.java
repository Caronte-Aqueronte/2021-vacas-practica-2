package src.peliculas;

public class Pelicula {

    int id;
    String nombre;
    int age;
    String categoria;
    boolean disponible;

    public Pelicula(int id, String nombre, int age, String categoria, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.age = age;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
