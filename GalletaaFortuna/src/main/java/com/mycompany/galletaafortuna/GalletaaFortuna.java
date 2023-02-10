/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.galletaafortuna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Latitude 3190
 */
public class GalletaaFortuna {
private static final String[] messages = {
    "El orgullo puede ser tu peor enemigo.",
    "Con esfuerzo todo se puede lograr.",
    "Aprendamos a valor lo que tenemos..",
    "No admires a nadie si no sabes admirarte a ti mismo.",
    "Tu corazon es fuerte, ten el valor de hacerle caso",
    "Tu amor a la música sera una parte importante de tu vida.",
    "Los buenos tiempos están por venir.",
    "La paciencia es una virtud.",
    "No renuncies a tu sueños, sigue durmiendo.",
    "La confianza en ti mismo es lo mejor",
    "Sonrie a pesar de todo lo malo"
            
  };

  public static void main(String[] args) {
    JFrame cuadro = new JFrame("Galleta de la fortuna");
    JButton boton = new JButton("Destape la galleta");

    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int palabras = random.nextInt(messages.length);
        JOptionPane.showMessageDialog(cuadro, messages[palabras]);
      }
    });

    cuadro.add(boton);
    cuadro.pack();
    cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cuadro.setVisible(true);
  }
}
  