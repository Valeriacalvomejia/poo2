import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmInicio extends JFrame implements ActionListener {
    static JLabel lblNumero1, lblNumero2, lblResultado;
    static JTextField txtNúmero1, txtNúmero2;
    static JButton btnSumar;
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(btnSumar)){
            int n1 = Integer.parseInt(txtNúmero1.getText());
            int n2 = Integer.parseInt(txtNúmero2.getText());
            int suma = Sumar.calcular(n1,n2);
            lblResultado.setText("♥ La súma es: " + suma + " ♥");
        }

    }
    public frmInicio() {
        lblNumero1 = new JLabel("Número 1");
        lblNumero1.setBounds(100,30,100,30);
        txtNúmero1 = new JTextField();
        txtNúmero1.setBounds(180,30,100,30);
        lblNumero2 = new JLabel("Número 2");
        lblNumero2.setBounds(100,80,100,30);
        lblResultado= new JLabel("♥ Resultado ♥");
        lblResultado.setBounds(150,200,150,30);
        txtNúmero2 = new JTextField();
        txtNúmero2.setBounds(180,80,100,30);
        btnSumar = new JButton("♥ Sumar ♥");
        btnSumar.setBounds(140,170,100,30);
        btnSumar.addActionListener(this);

        ///
        add(lblNumero1);
        add(txtNúmero1);
        add(lblNumero2);
        add(txtNúmero2);
        add(btnSumar);
        add(lblResultado);
        //
        setLayout(null);//ubicación de los componentes
        setSize(400, 300);//tamaño
        setTitle("Calculator coquette");//titulo
        setResizable(false);//con este se desactiva el botón de maximizar
        //setExtendedState(MAXIMIZED_BOTH)//con esta instrucción sale maximizado
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para que funcione la x
        setLocation(500, 200);//la localización en la pantalla del computador
        setVisible(true);//para que se muestre
        getContentPane().setBackground(Color.getHSBColor(255,203,209)); // Color defondo
    }

    public static void main(String[] args) {
        frmInicio ventana = new frmInicio ();

    }
}
