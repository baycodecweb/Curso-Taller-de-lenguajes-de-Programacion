import javax.swing.*;
import java.awt.*;

public class CatalogoTiendaAvanzado extends JFrame {
    // Trabajo 2: Integración de Componentes de Selección
    private JComboBox<String> cmbCategorias;
    private JCheckBox chkNotificaciones;
    private JRadioButton rbtDigital, rbtFisico;
    private ButtonGroup grupoEnvio;
    private JPanel panelFiltros, panelCentro, panelSur;

    public CatalogoTiendaAvanzado() {
        setTitle("GameStore Escolar - Catálogo Avanzado");
        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- PANEL DE FILTROS Y SELECCIÓN (TRABAJO 2) ---
        panelFiltros = new JPanel(new FlowLayout());

        // JComboBox para filtrar categorías
        cmbCategorias = new JComboBox<>(new String[]{"Todas las categorías", "Avatars", "Pases", "Accesorios"});
        panelFiltros.add(new JLabel("Filtrar:"));
        panelFiltros.add(cmbCategorias);

        // JCheckBox para opciones extra
        chkNotificaciones = new JCheckBox("Recibir alerta por correo");
        panelFiltros.add(chkNotificaciones);

        // JRadioButton y ButtonGroup para tipo de entrega
        rbtDigital = new JRadioButton("Digital", true);
        rbtFisico = new JRadioButton("Físico");
        grupoEnvio = new ButtonGroup();
        grupoEnvio.add(rbtDigital);
        grupoEnvio.add(rbtFisico);

        panelFiltros.add(rbtDigital);
        panelFiltros.add(rbtFisico);

        add(panelFiltros, BorderLayout.NORTH);

        // --- PANEL CENTRAL CON GRILLA (TRABAJO 1: GridLayout + JScrollPane) ---
        panelCentro = new JPanel(new GridLayout(3, 2, 10, 10));
        panelCentro.add(new JButton("Skin de Avatar (100 pts)"));
        panelCentro.add(new JButton("Pase de Tarea (200 pts)"));
        panelCentro.add(new JButton("Cursor Personalizado (50 pts)"));
        panelCentro.add(new JButton("Insignia Dorada (150 pts)"));
        panelCentro.add(new JButton("Fondo Exclusivo (80 pts)"));
        panelCentro.add(new JButton("Bonus Sorpresa (300 pts)"));

        JScrollPane scrollPane = new JScrollPane(panelCentro);
        add(scrollPane, BorderLayout.CENTER);

        // Panel Sur
        panelSur = new JPanel();
        panelSur.add(new JButton("Canjear Ítem"));
        add(panelSur, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new CatalogoTiendaAvanzado().setVisible(true);
    }
}
