package Modelo;
// Clase que define y permite crear objetos Eetakemon
public class Eetakemon {
    private String nombre;
    private int id;
    private int nivel;

    public Eetakemon(String name, int id, int level)
    {
        this.nombre = name;
        this.id= id;
        this.nivel=level;
    }

    //Obtener nombre
    public String getNombre() {
        return nombre;
    }
    //Obtener ID
    public int getId() {
        return id;
    }
    //Obtener Nivel
    public int getNivel() {
        return nivel;
    }//
}

