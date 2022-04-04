package ar.cp.ej2;

public class Plato extends ItemMenu {
  private float precio;
  private String descripcion;

  public Plato(String descripcion, float precio) {
    this.descripcion = descripcion;
    this.precio = precio;
  }

  @Override
  public float sumarBebida(float total) {
    return total;
  }

  @Override
  public float sumarPlato(float total) {
    return this.precio + total;
  }

}
