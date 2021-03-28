package fr.anakin.app;

import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener {

  JButton bouton;

  public static void main(String[] args) {

    Main ihm = new Main();
    ihm.go();

  }

  public void go() {
    JFrame cadre = new JFrame();
    JButton bouton = new JButton("cliquez moi");

    bouton.addActionListener(this);zzzzzzqaerrr

    cadre.getContentPane().add(bouton);
    cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cadre.setSize(400, 300);
    cadre.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {

    bouton.setText("J'ai été cliqué !");
  }
}
