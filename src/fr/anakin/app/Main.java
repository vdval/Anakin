package fr.anakin.app;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    JFrame cadre = new JFrame();
    JButton bouton = new JButton("cliquez moi");

    cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    cadre.getContentPane().add(bouton);
    cadre.setSize(400, 300);
    cadre.setVisible(true);
  }

  public void modifier() {
    bouton.setText("J'ai été cliqué !");
  }
}
