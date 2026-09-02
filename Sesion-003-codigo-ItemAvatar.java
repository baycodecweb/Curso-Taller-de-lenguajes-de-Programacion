// Subclase 1: ItemAvatar (Trabajo 1)
public class ItemAvatar extends ItemRecompensa {
    private String tipoSkin;

    public ItemAvatar(String nombre, int costoPuntos, String tipoSkin) {
        super(nombre, costoPuntos);
        this.tipoSkin = tipoSkin;
    }

    @Override
    public void aplicarEfecto() {
        System.out.println("Desbloqueando skin de avatar tipo: " + tipoSkin);
    }
}
