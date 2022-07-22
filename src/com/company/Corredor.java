package com.company;

import java.util.Random;
import javax.swing.JLabel;

public class Corredor extends Thread {
  private final Random randomizer;
  private int x;
  private final int y;
  private final Float velocidad;
  private final int probDormir;

  public JLabel animal;
  public String nombre;

  public Corredor(JLabel animal, String nombre, Float velocidad, int probDormir) {
      super();
      randomizer = new Random();
      this.animal = animal;
      x = animal.getX();
      y = animal.getY();
      this.velocidad = velocidad;
      this.probDormir = probDormir;
      this.nombre = nombre;
  }

  @Override
  public void run(){
    while (Checador.ganador == Resultados.getResultados()[0]) {
      try {
          sleep( 700 );
      } catch ( InterruptedException e ){
          e.printStackTrace();
      }
      avanzar();
    }
  }

  private void avanzar() {
    boolean noSeMueve = randomizer.nextInt(1, 101) <= probDormir;

    if (!noSeMueve) {
      int avance = (int)(velocidad * 5);
      animal.setLocation(x += avance, y);
    }
  }
}
