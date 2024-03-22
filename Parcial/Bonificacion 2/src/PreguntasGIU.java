import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class PreguntaGUI extends JFrame {
    private JLabel preguntaLabel;
    private JTextField preguntaText;
    private JButton guardarButton;
    private JButton mostrarButton;
    private JTextArea preguntasArea;

    public PreguntaGUI() {
        super("Crear Pregunta");
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 10, 10);

        preguntaLabel = new JLabel("Pregunta:");
        preguntaLabel.setFont(new Font("Serif", Font.BOLD, 14));
        add(preguntaLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;

        preguntaText = new JTextField();
        preguntaText.setColumns(20);
        add(preguntaText, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;

        guardarButton = new JButton("Guardar Pregunta");
        guardarButton.setFont(new Font("Serif", Font.BOLD, 14));
        guardarButton.setBackground(Color.decode("#007BFF"));
        guardarButton.setForeground(Color.white);
        add(guardarButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;

        mostrarButton = new JButton("Mostrar Preguntas");
        mostrarButton.setFont(new Font("Serif", Font.BOLD, 14));
        mostrarButton.setBackground(Color.decode("#007BFF"));
        mostrarButton.setForeground(Color.white);
        add(mostrarButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;

        preguntasArea = new JTextArea();
        preguntasArea.setColumns(30);
        preguntasArea.setRows(10);
        add(preguntasArea, constraints);

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pregunta = preguntaText.getText();
                escribirTxt.escribir(pregunta);
                preguntaText.setText("");
                JOptionPane.showMessageDialog(null, "Pregunta guardada exitosamente!");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String preguntas = leertxt.leer("preguntas.txt");
                preguntasArea.setText(preguntas);
            }
        });

        setSize(350, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    
}
 class escribirtxt {

    public static void escribir(String pregunta) {
        String nombreArchivo = "preguntas.txt";
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(pregunta);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class leertxt {

    public static String leer(String nombreArchivo) {
        String linea="";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                linea += inputLine + "\n";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error en lectura");
        }
        return linea;
    }
}
