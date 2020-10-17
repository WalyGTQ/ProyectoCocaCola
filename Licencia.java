package proyectoCocaCola;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Licencia extends JFrame
    implements ActionListener, ChangeListener
{

    public Licencia()
    {
        nombre = "";
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("Licencia de uso");
        setIconImage((new ImageIcon(getClass().getResource("images/icon.png"))).getImage());
        Bienvenida bienvenida = new Bienvenida();
        Bienvenida _tmp = bienvenida;
        nombre = Bienvenida.texto;
        label1 = new JLabel("T\311RMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));
        textarea1.setText("\n\n          T\311RMINOS Y CONDICIONES\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI\323N SIN AUTORIZACI\323N DE LA GEEKIPEDIA DE ERNESTO.\n            B.  PROHIBIDA LA ALTERACI\323N DEL C\323DIGO FUENTE O DISE\321O DE LAS INTERFACES GR\301FICAS.\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI\323N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n\n          PARA MAYOR INFORMACI\323N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR CONSULTE A:\n          WALTER ROBERTO ACUTA RUMPICH");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 575, 200);
        add(scrollpane1);
        check1 = new JCheckBox((new StringBuilder()).append("Yo ").append(nombre).append(" Acepto").toString());
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);
        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        add(boton2);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        ImageIcon imageicon = new ImageIcon("coca-cola.png");
        JLabel jlabel = new JLabel(imageicon);
        jlabel.setBounds(315, 135, 300, 300);
        add(jlabel);
    }

    public void stateChanged(ChangeEvent changeevent)
    {
        if(check1.isSelected())
        {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else
        {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == boton1)
        {
            Principal principal = new Principal();
            principal.setVisible(true);
            principal.setBounds(0, 0, 640, 535);
            principal.setResizable(false);
            principal.setLocationRelativeTo(null);
            setVisible(false);
        } else
        if(actionevent.getSource() == boton2)
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
        Licencia licencia = new Licencia();
        licencia.setBounds(0, 0, 600, 360);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }

    private JLabel label1;
    private JLabel label2;
    private JCheckBox check1;
    private JButton boton1;
    private JButton boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre;
}
