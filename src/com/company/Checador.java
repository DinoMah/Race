package com.company;

import java.awt.*;

public class Checador {
  public static String ganador = "";
  private static Point posConejo;
  private static Point posTortuga;

  public static boolean alguienLlego(Point posConejo, Point posTortuga){
    Checador.posConejo = posConejo;
    Checador.posTortuga = posTortuga;
    setResult();

    if (posConejo.x == posTortuga.x && posConejo.x >= 1023) return true;
    else if (posConejo.x >= 1023) return true;
    else if (posTortuga.x >= 1023) return true;
    else return false;
  }

  private static void setResult() {
    Checador.ganador = getRaceResult(Checador.posConejo, Checador.posTortuga);
  }

  private static String getRaceResult(Point posConejo, Point posTortuga) {
    if (posConejo.x == posTortuga.x && posConejo.x >= 1023) return Resultados.getResultados()[1];
    else if (posConejo.x >= 1023) return Competidores.getCompetidores()[0];
    else if (posTortuga.x >= 1023) return Competidores.getCompetidores()[1];
    else return Resultados.getResultados()[0];
  }
}
