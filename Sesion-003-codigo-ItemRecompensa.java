// Clase Madre Abstracta (Trabajo 1)
public abstract class ItemRecompensa {
    private String nombre;
    private int costoPuntos;

    public ItemRecompensa(String nombre, int costoPuntos) {
        this.nombre = nombre;
        this.costoPuntos = costoPuntos;
    }

    // Método abstracto que las subclases deben implementar obligatoriamente
    public abstract void aplicarEfecto();

    // Métodos Getters
    public String getNombre() { return nombre; }
    public int getCostoPuntos() { return costoPuntos; }
}
