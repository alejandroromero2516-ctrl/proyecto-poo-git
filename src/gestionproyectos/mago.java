package gestionproyectos;

public class Mago extends Tarea {
    private String nombreHechizo;
    private int mana;
    private int nivelPoder;

    public Mago(String nombre, String nombreHechizo, int mana, int nivelPoder) {
        super(nombre);
        this.nombreHechizo = nombreHechizo;
        this.mana = mana;
        this.nivelPoder = nivelPoder;
    }

    
}