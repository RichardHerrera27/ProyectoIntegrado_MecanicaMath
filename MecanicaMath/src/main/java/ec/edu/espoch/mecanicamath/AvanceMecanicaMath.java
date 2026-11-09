
import javax.swing.*;
import java.awt.*;

public class AvanceMecanicaMath extends JFrame {

    private CardLayout cardLayout;
    private JPanel panelContenedor;

    // Variables para almacenar datos temporales del avance
    private String usuarioRegistrado = "";
    private String escenarioSeleccionado = "";
    private String funcionIngresada = "";

    public AvanceMecanicaMath() {
        setTitle("MecánicaMath - Avance del Sistema");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        panelContenedor = new JPanel(cardLayout);

        // Agregar las "pantallas" o paneles del flujo
        panelContenedor.add(crearPanelRegistro(), "REGISTRO");
        panelContenedor.add(crearPanelCasosUso(), "CASOS_USO");
        panelContenedor.add(crearPanelFuncion(), "FUNCION");

        add(panelContenedor);
        cardLayout.show(panelContenedor, "REGISTRO");
    }

    // 1. Panel de Registro de Usuario
    private JPanel crearPanelRegistro() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("=== Registro de Usuario ===", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel lblUser = new JLabel("Usuario:");
        JTextField txtUser = new JTextField(15);
        JButton btnRegistrar = new JButton("Siguiente");

        btnRegistrar.addActionListener(e -> {
            usuarioRegistrado = txtUser.getText().trim();
            if (usuarioRegistrado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre de usuario.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                cardLayout.show(panelContenedor, "CASOS_USO");
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        panel.add(lblUser, gbc);
        gbc.gridx = 1;
        panel.add(txtUser, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(btnRegistrar, gbc);

        return panel;
    }

    // 2. Panel para Seleccionar Casos de Uso / Escenario
    private JPanel crearPanelCasosUso() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("=== CU01: Seleccionar Escenario ===", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));

        String[] opciones = {
            "Seleccione un escenario...",
            "Análisis Cinemático (MRUV / Caída Libre)",
            "Análisis Dinómico (Fuerzas y Trabajo)",
            "Cálculo General de Tasas de Cambio"
        };
        JComboBox<String> comboEscenarios = new JComboBox<>(opciones);
        JButton btnContinuar = new JButton("Siguiente: Ingresar Función");

        btnContinuar.addActionListener(e -> {
            if (comboEscenarios.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un escenario válido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                escenarioSeleccionado = (String) comboEscenarios.getSelectedItem();
                cardLayout.show(panelContenedor, "FUNCION");
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitulo, gbc);

        gbc.gridy = 1;
        panel.add(comboEscenarios, gbc);
        gbc.gridy = 2;
        panel.add(btnContinuar, gbc);

        return panel;
    }

    // 3. Panel para Ingresar la Función (CU02)
    private JPanel crearPanelFuncion() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("=== CU02: Ingresar Función ===", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel lblFunc = new JLabel("Función f(x):");
        JTextField txtFuncion = new JTextField(15);
        JButton btnFinalizar = new JButton("Finalizar Avance");

        btnFinalizar.addActionListener(e -> {
            funcionIngresada = txtFuncion.getText().trim();
            if (funcionIngresada.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La función no puede estar vacía.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                // Resumen del avance simulado
                String resumen = "--- RESUMEN DEL AVANCE ---\n"
                        + "Usuario: " + usuarioRegistrado + "\n"
                        + "Escenario (CU01): " + escenarioSeleccionado + "\n"
                        + "Función (CU02): f(x) = " + funcionIngresada;

                JOptionPane.showMessageDialog(this, resumen, "¡Avance Exitoso!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        panel.add(lblFunc, gbc);
        gbc.gridx = 1;
        panel.add(txtFuncion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(btnFinalizar, gbc);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AvanceMecanicaMath().setVisible(true);
        });
    }
}
