import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStoreLogin extends JFrame {
    // Trabajo 1: Diseño de Interfaz Visual (JFrame, JLabel, JTextField, JButton)
    private JLabel lblTitulo, lblUsuario;
    private JTextField txtUsuario;
    private JButton btnIngresar;

    public GameStoreLogin() {
        setTitle("GameStore Escolar - Acceso");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblTitulo = new JLabel("BIENVENIDO A GAMESTORE");
        lblTitulo.setBounds(70, 20, 200, 25);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 12));
        add(lblTitulo);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(40, 70, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(110, 70, 180, 25);
        add(txtUsuario);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(110, 110, 100, 30);
        add(btnIngresar);

        // Trabajo 2: Programación de Eventos de clic (ActionListener)
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioIngresado = txtUsuario.getText();

                if (!usuarioIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                        "¡Acceso concedido! Bienvenido, " + usuarioIngresado + ".",
                        "GameStore", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "Por favor, ingrese un nombre de usuario.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new GameStoreLogin().setVisible(true);
    }
}
