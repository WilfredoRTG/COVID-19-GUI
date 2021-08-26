import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Covid extends Sintomas implements ActionListener{
    private JPanel Positivo;
    private JComboBox Estados;
    private JButton subir;
    private JSpinner edad;
    private JTextField nombre;
    private Frame f;
    private Image image;
    private Icon i;
    protected String nomb, est;
    protected int eda;

    public void sL(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
            if(Character.isDigit(c)){
                e.consume();
            }
        }
        });
    }


    public void actionPerformed (ActionEvent posi){
        try{
        image = ImageIO.read(new File("re.png"));
        i = new ImageIcon(image);
        }
        catch (IOException ex){
        }

        if (posi.getSource() == subir) {
            String nom = nombre.getText();
            int ed = (int) edad.getNextValue();
            String es = Estados.getSelectedItem().toString();;
            int e = ed - 1;
            final String VACIO = "";

            if (nom.equals(VACIO)) {
                JOptionPane.showMessageDialog(null, "Ingresa tu nombre", "Nombre incorrecto",JOptionPane.WARNING_MESSAGE);
            }
                else{
                if (ed <= 0) {
                    JOptionPane.showMessageDialog(null,"Haz ingresado una edad incorrecta","Edad incorrecta",JOptionPane.WARNING_MESSAGE);
                } else if(es.equals("----")){
                    JOptionPane.showMessageDialog(null,"No haz ingresado tu estado","Ingresa tu estado",JOptionPane.WARNING_MESSAGE);
                }else {
                    if (e == 1) {
                        String saludo = "Nombre: " + nom + "\n";
                        saludo += "Edad: " + e + " año" + "\n";
                        saludo += "Estado: " + es + "\n";
                        saludo += "Muchas gracias";
                        JOptionPane.showMessageDialog(f, saludo, "Paciente", JOptionPane.INFORMATION_MESSAGE,i);
                        Paciente[] pa = new Paciente[]{
                                new Paciente(nom,e,es)
                        };
                        for (Paciente A : pa) {
                            System.out.println(A);
                        }
                        JOptionPane.showMessageDialog(f,"Paciente cargado a la base de datos","Confirmacion",JOptionPane.PLAIN_MESSAGE);
                    }
                    if (e == 0) {
                        String saludo = "Nombre: " + nom + "\n";
                        saludo += "Edad: " + e + " años" + "\n";
                        saludo += "Estado: " + es + "\n";
                        saludo += "Muchas gracias";
                        JOptionPane.showMessageDialog(f, saludo, "Paciente", JOptionPane.INFORMATION_MESSAGE,i);
                        Paciente[] pa = new Paciente[]{
                                new Paciente(nom,e,es)
                        };
                        for (Paciente A : pa) {
                            System.out.println(A);
                        }
                        JOptionPane.showMessageDialog(f,"Paciente cargado a la base de datos","Confirmacion",JOptionPane.PLAIN_MESSAGE);
                        }
                    if (ed > 1) {
                        String saludo = "Nombre: " + nom + "\n";
                        saludo += "Edad: " + e + " años" + "\n";
                        saludo += "Estado: " + es + "\n";
                        saludo += "Muchas gracias";
                        JOptionPane.showMessageDialog(f, saludo, "Paciente", JOptionPane.INFORMATION_MESSAGE,i);
                        Paciente[] pa = new Paciente[]{
                                new Paciente(nom,e,es)
                        };
                        for (Paciente A : pa) {
                            System.out.println(A);
                        }

                        JOptionPane.showMessageDialog(f,"Paciente cargado a la base de datos","Confirmacion",JOptionPane.PLAIN_MESSAGE);
                    }
                    nuevoPaciente();
                }
            }

        }
    }

    public Covid(){
        sL(nombre);
        setBounds(500,100,400,200);
        add(Positivo);
        Estados.addItem("----");
        Estados.addItem("Aguascalientes");
        Estados.addItem("Baja California");
        Estados.addItem("Baja California Sur");
        Estados.addItem("Campeche");
        Estados.addItem("Coahuila de Zaragoza");
        Estados.addItem("Colima");
        Estados.addItem("Chiapas");
        Estados.addItem("Chihuahua");
        Estados.addItem("Distrito Federal");
        Estados.addItem("Durango");
        Estados.addItem("Guanajuato");
        Estados.addItem("Guerrero");
        Estados.addItem("Hidalgo");
        Estados.addItem("Jalisco");
        Estados.addItem("México");
        Estados.addItem("Michoacán de Ocampo");
        Estados.addItem("Morelos");
        Estados.addItem("Nayarit");
        Estados.addItem("Nuevo León");
        Estados.addItem("Oaxaca");
        Estados.addItem("Puebla");
        Estados.addItem("Querétaro");
        Estados.addItem("Quintana Roo");
        Estados.addItem("San Luis Potosí");
        Estados.addItem("Sinaloa");
        Estados.addItem("Sonora");
        Estados.addItem("Tabasco");
        Estados.addItem("Tamaulipas");
        Estados.addItem("Tlaxcala");
        Estados.addItem("Veracruz de Ignacio de la Llave");
        Estados.addItem("Yucatán");
        Estados.addItem("Zacatecas");
        subir.addActionListener(this);
    }
}

