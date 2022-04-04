package ar.cp.ej2;

import java.util.List;

public class Pedido {

  private List<ItemMenu> items;

  public Pedido(ItemMenu... items) {
    this.items = List.of(items);
  }

  public float totalBebidas() {
    float total = 0;
    for (ItemMenu itemMenu : items) {
      total = itemMenu.sumarBebida(total);
    }
    return total;
  }

  public float totalPlatos() {
    float total = 0;
    for (ItemMenu itemMenu : items) {
      total = itemMenu.sumarPlato(total);
    }
    return total;
  }
}
