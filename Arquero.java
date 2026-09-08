package gestionproyectos;

public class Arquero extends Tarea {
    private int flechas;
    private int precision;

    public Arquero(String nombre, int flechas, int precision) {
        super(nombre);
        this.flechas = flechas;
        this.precision = precision;
    }

    public void dispararFlecha() {
        if (flechas > 0) {
            flechas--;
            System.out.println("El arquero dispara una flecha.");
        } else {
            System.out.println("No quedan flechas.");
        }
    }
}