/*
 *  Ecrire un programme qui permet d'afficher une fenêtre disposant de 3 boutons placés dans un
 *  panneau, disposé verticalement sur le côté gauche de la fenêtre. Au centre de la fenêtre, doit
 *  apparaître une phrase au moment où l'on clique sur un bouton. La phrase indique quel bouton
 *  a été cliqué.
 *  Faites en sorte qu'un bip soit entendu chaque fois qu'on clique sur un bouton. Pensez à la
 *  méthode beep() de la classe Toolkit)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ex1_tp6 extends JFrame implements ActionListener{
   private JButton b1,b2,b3;
   private JLabel b4;
   private JPanel pwest,peast;
   public static void main(String[] args) {
        Ex1_tp6 test = new Ex1_tp6();
   }
    Ex1_tp6(){
        super("Teste des boutons");
        super.setSize(300,150);
        pwest = new JPanel();
        pwest.setLayout(new GridLayout(3, 1));
        b1 = new JButton("bouton 1"); b2 = new JButton("bouton 2");  b3 = new JButton("bouton 3");
        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
        pwest.add(b1); pwest.add(b2); pwest.add(b3);
        add(pwest,BorderLayout.WEST);
        peast = new JPanel();

        b4 = new JLabel("No action yet");
        peast.add(b4);
        add(peast,BorderLayout.EAST);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Toolkit ta = Toolkit.getDefaultToolkit();
        ta.beep();
        if(e.getSource()==b1) { b4.setText("Action sur le boutom b1");}
        if(e.getSource()==b2) { b4.setText("Action sur le boutom b2");}
        if(e.getSource()==b3) { b4.setText("Action sur le boutom b3");}
    }

}
