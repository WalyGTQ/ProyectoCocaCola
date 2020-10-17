
package proyectoCocaCola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Principal extends JFrame
    implements ActionListener
{

    public Principal()
    {
        nombreAdministrador = "";
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage((new ImageIcon(getClass().getResource("images/icon.png"))).getImage());
        Bienvenida bienvenida = new Bienvenida();
        Bienvenida _tmp = bienvenida;
        nombreAdministrador = Bienvenida.texto;
        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        menu1.setBackground(new Color(255, 0, 0));
        menu1.setFont(new Font("Andale Mono", 1, 14));
        menu1.setForeground(new Color(255, 255, 255));
        mb.add(menu1);
        menu2 = new JMenu("Calcular");
        menu2.setBackground(new Color(255, 0, 0));
        menu2.setFont(new Font("Andale Mono", 1, 14));
        menu2.setForeground(new Color(255, 255, 255));
        mb.add(menu2);
        menu3 = new JMenu("Acerca de");
        menu3.setBackground(new Color(255, 0, 0));
        menu3.setFont(new Font("Andale Mono", 1, 14));
        menu3.setForeground(new Color(255, 255, 255));
        mb.add(menu3);
        menu4 = new JMenu("Color de fondo");
        menu4.setFont(new Font("Andale Mono", 1, 14));
        menu4.setForeground(new Color(255, 0, 0));
        menu1.add(menu4);
        miVacaciones = new JMenuItem("Vacaciones");
        miVacaciones.setFont(new Font("Andale Mono", 1, 14));
        miVacaciones.setForeground(new Color(255, 0, 0));
        menu2.add(miVacaciones);
        miVacaciones.addActionListener(this);
        mi3 = new JMenuItem("Rojo");
        mi3.setFont(new Font("Andale Mono", 1, 14));
        mi3.setForeground(new Color(255, 0, 0));
        menu4.add(mi3);
        mi3.addActionListener(this);
        mi4 = new JMenuItem("Negro");
        mi4.setFont(new Font("Andale Mono", 1, 14));
        mi4.setForeground(new Color(255, 0, 0));
        menu4.add(mi4);
        mi4.addActionListener(this);
        mi5 = new JMenuItem("Morado");
        mi5.setFont(new Font("Andale Mono", 1, 14));
        mi5.setForeground(new Color(255, 0, 0));
        menu4.add(mi5);
        mi5.addActionListener(this);
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        menu1.add(miNuevo);
        miNuevo.addActionListener(this);
        mi6 = new JMenuItem("El creador");
        mi6.setFont(new Font("Andale Mono", 1, 14));
        mi6.setForeground(new Color(255, 0, 0));
        menu3.add(mi6);
        mi6.addActionListener(this);
        mi7 = new JMenuItem("Salir");
        mi7.setFont(new Font("Andale Mono", 1, 14));
        mi7.setForeground(new Color(255, 0, 0));
        menu1.add(mi7);
        mi7.addActionListener(this);
        
        ImageIcon imageicon = new ImageIcon("logo-coca.png");
        label1 = new JLabel(imageicon);
        label1.setBounds(5, 5, 250, 100);
        add(label1);
        
        label2 = new JLabel((new StringBuilder()).append("Bienvenido ").append(nombreAdministrador).toString());
        label2.setBounds(280, 30, 400, 50);
        label2.setFont(new Font("Andale Mono", 1, 32));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);
        labelTitle = new JLabel("Datos del trabajador para el c\341lculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);
        label3 = new JLabel("Nombre completo:");
        label3.setBounds(25, 188, 180, 25);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new Color(224, 224, 224));
        txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new Color(255, 0, 0));
        add(txtNombreTrabajador);
        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);
        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new Color(255, 0, 0));
        add(txtAPaternoTrabajador);
        labelAMaterno = new JLabel("Apellido Materno:");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);
        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new Color(255, 0, 0));
        add(txtAMaternoTrabajador);
        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new Color(224, 224, 224));
        comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atenci\363n al Cliente");
        comboDepartamento.addItem("Departamento de Log\355stica");
        comboDepartamento.addItem("Departamento de Gerencia");
        labelAntiguedad = new JLabel("Selecciona la Antig\374edad:");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);
        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new Color(224, 224, 224));
        comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 a\361o de servicio");
        comboAntiguedad.addItem("2 a 6 a\361os de servicio");
        comboAntiguedad.addItem("7 a\361os o m\341s de servicio");
        labelResultado = new JLabel("Resultado del C\341lculo:");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setFont(new Font("Andale Mono", 1, 11));
        textarea1.setForeground(new Color(255, 0, 0));
        textarea1.setText("\n   Aqu\355 aparece el resultado del c\341lculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220, 333, 385, 90);
        add(scrollpane1);
        labelfooter = new JLabel("\2512020 The Coca-Cola Company | Todos los derechos reservados");
        labelfooter.setBounds(135, 445, 500, 30);
        labelfooter.setFont(new Font("Andale Mono", 1, 12));
        labelfooter.setForeground(new Color(255, 255, 255));
        add(labelfooter);
    }

    
    
    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == miVacaciones)
        {
            String s = txtNombreTrabajador.getText();
            String s1 = txtAPaternoTrabajador.getText();
            String s2 = txtAMaternoTrabajador.getText();
            String s3 = comboDepartamento.getSelectedItem().toString();
            String s4 = comboAntiguedad.getSelectedItem().toString();
            if(s.equals("") || s1.equals("") || s2.equals("") || s3.equals("") || s4.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
            } else
            {
                if(s3.equals("Atenci\363n al Cliente"))
                {
                    if(s4.equals("1 a\361o de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 6 d\355as de vacaciones.").toString());
                    if(s4.equals("2 a 6 a\361os de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 14 d\355as de vacaciones.").toString());
                    if(s4.equals("7 a\361os o m\341s de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 20 d\355as de vacaciones.").toString());
                }
                if(s3.equals("Departamento de Log\355stica"))
                {
                    if(s4.equals("1 a\361o de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 7 d\355as de vacaciones.").toString());
                    if(s4.equals("2 a 6 a\361os de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 15 d\355as de vacaciones.").toString());
                    if(s4.equals("7 a\361os o m\341s de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 22 d\355as de vacaciones.").toString());
                }
                if(s3.equals("Departamento de Gerencia"))
                {
                    if(s4.equals("1 a\361o de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 10 d\355as de vacaciones.").toString());
                    if(s4.equals("2 a 6 a\361os de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 20 d\355as de vacaciones.").toString());
                    if(s4.equals("7 a\361os o m\341s de servicio"))
                        textarea1.setText((new StringBuilder()).append("\n   El trabajador ").append(s).append(" ").append(s1).append(" ").append(s2).append("\n   quien labora en ").append(s3).append(" con ").append(s4).append("\n   recibe 30 d\355as de vacaciones.").toString());
                }
            }
        }
        if(actionevent.getSource() == mi3)
            getContentPane().setBackground(new Color(255, 0, 0));
        if(actionevent.getSource() == mi4)
            getContentPane().setBackground(new Color(0, 0, 0));
        if(actionevent.getSource() == mi5)
            getContentPane().setBackground(new Color(51, 0, 51));
        if(actionevent.getSource() == miNuevo)
        {
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n   Aqu\355 aparece el resultado del c\341lculo de las vacaciones.");
        }
        if(actionevent.getSource() == mi6)
            JOptionPane.showMessageDialog(null, "            Desarrollado por \nWalter Roberto Acuta Rumpich\n              1990 19 4657 \n       Curso: Programacion 2");
        if(actionevent.getSource() == mi7)
        {
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.setBounds(0, 0, 350, 450);
            bienvenida.setVisible(true);
            bienvenida.setResizable(false);
            bienvenida.setLocationRelativeTo(null);
            setVisible(false);
        }
    }

    public static void main(String args[])
    {
        Principal principal = new Principal();
        principal.setBounds(0, 0, 640, 535);
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
    }

    private JMenuBar mb;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JMenu menu5;
    private JMenuItem miVacaciones;
    private JMenuItem mi2;
    private JMenuItem mi3;
    private JMenuItem mi4;
    private JMenuItem mi5;
    private JMenuItem mi6;
    private JMenuItem mi7;
    private JMenuItem miNuevo;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelTitle;
    private JLabel label3;
    private JLabel labelAPaterno;
    private JLabel labelAMaterno;
    private JLabel labelDepartamento;
    private JLabel labelAntiguedad;
    private JLabel labelResultado;
    private JLabel labelfooter;
    private JTextField txtNombreTrabajador;
    private JTextField txtAPaternoTrabajador;
    private JTextField txtAMaternoTrabajador;
    private JComboBox comboDepartamento;
    private JComboBox comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAdministrador;
}
