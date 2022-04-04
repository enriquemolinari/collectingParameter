package ar.cp.ej2;

public class Bebida extends ItemMenu {

  private float precio;
  private String descripcion;

  public Bebida(String descripcion, float precio) {
    this.descripcion = descripcion;
    this.precio = precio;
  }

  @Override
  public float sumarBebida(float total) {
    return this.precio + total;
  }

  @Override
  public float sumarPlato(float total) {
    return total;
  }

}
