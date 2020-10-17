package proyectoCocaCola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bienvenida extends JFrame
    implements ActionListener
{

    public Bienvenida()
    {
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage((new ImageIcon(getClass().getResource("images/icon.png"))).getImage());
        
        ImageIcon imageicon = new ImageIcon("logo-coca.png");
        JLabel jlabel = new JLabel(imageicon);
        jlabel.setBounds(25, 15, 300, 150);
        add(jlabel);
        
        JLabel jlabel1 = new JLabel("Sistema de Control Vacacional");
        jlabel1.setBounds(35, 135, 300, 30);
        jlabel1.setFont(new Font("Andale Mono", 3, 18));
        jlabel1.setForeground(new Color(255, 255, 255));
        add(jlabel1);
        label3 = new JLabel("Ingrese su nombre:");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        add(boton1);
        boton1.addActionListener(this);
        JLabel jlabel2 = new JLabel("\2512020 The Coca-Cola Company");
        jlabel2.setBounds(85, 375, 300, 30);
        jlabel2.setFont(new Font("Andale Mono", 1, 12));
        jlabel2.setForeground(new Color(255, 255, 255));
        add(jlabel2);
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == boton1)
        {
            texto = textfield1.getText().trim();
            if(texto.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else
            {
                Licencia licencia = new Licencia();
                licencia.setVisible(true);
                licencia.setBounds(0, 0, 610, 370);
                licencia.setResizable(false);
                licencia.setLocationRelativeTo(null);
                setVisible(false);
            }
        }
    }

    public static void main(String args[])
    {
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setBounds(0, 0, 350, 450);
        bienvenida.setVisible(true);
        bienvenida.setResizable(false);
        bienvenida.setLocationRelativeTo(null);
    }

    private JTextField textfield1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton boton1;
    public static String texto = "";

}
