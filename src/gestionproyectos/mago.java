package gestionproyectos;

public class Mago extends Tarea {
    // Atributos de la clase Mago
    private String nombreHechizo;
    private int mana;
    private int nivelPoder;

    // Constructor
    public Mago(String nombre, String nombreHechizo, int mana, int nivelPoder) {
        super(nombre);
        this.nombreHechizo = nombreHechizo;
        this.mana = mana;
        this.nivelPoder = nivelPoder;
    }

    // Método 1: Lanzar hechizo
    public void lanzarHechizo() {
        System.out.println("El mago lanza el hechizo: " + nombreHechizo);
    }

    // Método 2: Meditar
    public void meditar() {
        this.mana += 20;
        System.out.println("El mago medita y recupera mana.");
    }
}