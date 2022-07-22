package com.company;

public class Main {
  private static Tablero tablero;
  private static Thread tableroThread;

  public static void main(String[] args) {
    tablero = new Tablero();
    tablero.startRace();
    tableroThread = new Thread(tablero);
    tableroThread.start();
  }
}
