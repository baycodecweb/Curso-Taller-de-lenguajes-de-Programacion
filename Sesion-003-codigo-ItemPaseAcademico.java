// Subclase 2: ItemPaseAcademico (Trabajo 1)
public class ItemPaseAcademico extends ItemRecompensa {
    private int duracionDias;

    public ItemPaseAcademico(String nombre, int costoPuntos, int duracionDias) {
        super(nombre, costoPuntos);
        this.duracionDias = duracionDias;
    }

    @Override
    public void aplicarEfecto() {
        System.out.println("Otorgando pase académico especial por " + duracionDias + " días.");
    }
}
