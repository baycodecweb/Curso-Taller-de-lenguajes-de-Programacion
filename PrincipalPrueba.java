public class PrincipalPrueba {
    public static void main(String[] args) {
        // Creación de un arreglo polimórfico de tipo ItemRecompensa (Trabajo 2)
        ItemRecompensa[] inventarioTienda = new ItemRecompensa[2];

        inventarioTienda[0] = new ItemAvatar("Skin Guerrero Cyber", 150, "Legendario");
        inventarioTienda[1] = new ItemPaseAcademico("Pase de Prórroga", 300, 7);

        System.out.println("--- EJECUTANDO EFECTOS CON POLIMORFISMO ---");

        // Recorriendo el arreglo e invocando el método de forma polimórfica (Trabajo 2)
        for (ItemRecompensa item : inventarioTienda) {
            System.out.println("Ítem: " + item.getNombre() + " | Costo: " + item.getCostoPuntos() + " pts");
            item.aplicarEfecto(); // Comportamiento dinámico según la subclase
            System.out.println("--------------------------------------------------");
        }
    }
}
