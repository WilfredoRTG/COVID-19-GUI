import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Sintomas extends JFrame implements ActionListener {

    private JPanel sin;
    private JCheckBox fiebreCheckBox;
    private JCheckBox tosSecaCheckBox;
    private JCheckBox tosSecaPersistenteCheckBox;
    private JCheckBox mocoCheckBox;
    private JCheckBox congestionNasalCheckBox;
    private JCheckBox estornudosCheckBox;
    private JCheckBox dolorDeGargantaCheckBox;
    private JCheckBox malestarDeGargantaCheckBox;
    private JCheckBox dificultadDeRespirarCheckBox;
    private JCheckBox flemasCheckBox;
    private JCheckBox vomitoCheckBox;
    private JCheckBox diarreaCheckBox;
    private JCheckBox cansancioCheckBox;
    private JButton checarButton;
    protected Image imagen;
    protected Icon ima;

    public void nuevoPaciente() {
        this.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checarButton) {
            try {
                validarSeleccion();

            } catch (IOException ex) {
            }
        }
    }

    private void validarSeleccion() throws IOException {
        try {
            imagen = ImageIO.read(new File("doc.png"));
            ima = new ImageIcon(imagen);
        } catch (IOException ex) {
        }
        if (tosSecaCheckBox.isSelected() || congestionNasalCheckBox.isSelected() || estornudosCheckBox.isSelected() || dolorDeGargantaCheckBox.isSelected() || malestarDeGargantaCheckBox.isSelected() || fiebreCheckBox.isSelected() || tosSecaPersistenteCheckBox.isSelected() || mocoCheckBox.isSelected() || dificultadDeRespirarCheckBox.isSelected() || flemasCheckBox.isSelected() || vomitoCheckBox.isSelected() || diarreaCheckBox.isSelected() || cansancioCheckBox.isSelected()) {

            JFrame fr = new JFrame();
            JPanel pa = new JPanel();
            JLabel lb = new JLabel();
            JLabel lb2 = new JLabel();
            fr.setSize(700,150);
            pa.setSize(600,150);
            lb.setText("Te recomendamos que vayas a un doctor ya que ninguno de los síntomas coincide con nuestra base de datos.");
            lb.setBounds(0,0,600,100);
            lb2.setIcon(ima);
            pa.add(lb2);
            pa.add(lb);
            pa.repaint();
            fr.add(pa);
            fr.setVisible(true);

            if (fiebreCheckBox.isSelected() && tosSecaCheckBox.isSelected() && tosSecaPersistenteCheckBox.isSelected() && dolorDeGargantaCheckBox.isSelected() && dificultadDeRespirarCheckBox.isSelected() && flemasCheckBox.isSelected() && diarreaCheckBox.isSelected() && cansancioCheckBox.isSelected() && !mocoCheckBox.isSelected() && !congestionNasalCheckBox.isSelected() && !estornudosCheckBox.isSelected() && !malestarDeGargantaCheckBox.isSelected() && !vomitoCheckBox.isSelected()) {
                fr.setVisible(false);
                String sugerencia = "Tienes COVID-19, te sugerimos que leas estas recomendaciones y llenes el formulario que te saldra a continuación.";
                JOptionPane.showMessageDialog(null, sugerencia, "Paciente", JOptionPane.WARNING_MESSAGE);
                Covid co = new Covid();
                co.setVisible(true);
                File file = new File("covid.txt");
                Desktop.getDesktop().open(file);
            }
            if (fiebreCheckBox.isSelected() && tosSecaCheckBox.isSelected() && tosSecaPersistenteCheckBox.isSelected() && mocoCheckBox.isSelected() && estornudosCheckBox.isSelected() && vomitoCheckBox.isSelected() && diarreaCheckBox.isSelected() && !congestionNasalCheckBox.isSelected() && !dolorDeGargantaCheckBox.isSelected() && !dificultadDeRespirarCheckBox.isSelected() && !flemasCheckBox.isSelected() && !cansancioCheckBox.isSelected()) {
                fr.setVisible(false);
                String sugerencia = "Tienes influenza te sugerimos que leas estas indicaciones.";
                JOptionPane.showMessageDialog(null, sugerencia, "Paciente", JOptionPane.WARNING_MESSAGE);
                Influenza influ = new Influenza();
                influ.setVisible(true);
                this.setVisible(false);
            }

            if (tosSecaCheckBox.isSelected() && congestionNasalCheckBox.isSelected() && estornudosCheckBox.isSelected() && dolorDeGargantaCheckBox.isSelected() && malestarDeGargantaCheckBox.isSelected() && !fiebreCheckBox.isSelected() && !tosSecaPersistenteCheckBox.isSelected() && !mocoCheckBox.isSelected() && !dificultadDeRespirarCheckBox.isSelected() && !flemasCheckBox.isSelected() && !vomitoCheckBox.isSelected() && !diarreaCheckBox.isSelected() && !cansancioCheckBox.isSelected()) {
                fr.setVisible(false);
                String sugerencia = "Tienes un resfriado te sugerimos que leas estas indicaciones.";
                JOptionPane.showMessageDialog(null, sugerencia, "Paciente", JOptionPane.WARNING_MESSAGE);
                Resfriado res = new Resfriado();
                res.setVisible(true);
                this.setVisible(false);
            }


        } else {
            JOptionPane.showMessageDialog(null, "Selecciona algún síntoma", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        fiebreCheckBox.setSelected(false);
        tosSecaCheckBox.setSelected(false);
        tosSecaPersistenteCheckBox.setSelected(false);
        mocoCheckBox.setSelected(false);
        congestionNasalCheckBox.setSelected(false);
        estornudosCheckBox.setSelected(false);
        dolorDeGargantaCheckBox.setSelected(false);
        malestarDeGargantaCheckBox.setSelected(false);
        dificultadDeRespirarCheckBox.setSelected(false);
        flemasCheckBox.setSelected(false);
        vomitoCheckBox.setSelected(false);
        diarreaCheckBox.setSelected(false);
        cansancioCheckBox.setSelected(false);
    }

    public Sintomas() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(sin);
        setSize(400, 500);
        checarButton.addActionListener(this);
        setBackground(Color.green);
        sin.setBackground(Color.CYAN);
    }
}



