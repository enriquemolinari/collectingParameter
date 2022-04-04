package ar.cp.ej1;

import java.util.List;

public class Circulo extends Figura {

  @Override
  public void dibujar() {
    System.out.println("Dibujando el Circulo...");
  }

  @Override
  protected void soloCirculos(List<Figura> temp) {
    temp.add(this);
  }
}
