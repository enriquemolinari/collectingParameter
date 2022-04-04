package ar.cp.ej2;

public class Main {

  public static void main(String[] args) {
    var b1 = new Bebida("Fanta", 10);
    var b2 = new Bebida("Quilmes", 20);
    var b3 = new Bebida("Coca", 15);

    var p1 = new Plato("fideos", 300);
    var p2 = new Plato("Bife", 600);
    var p3 = new Plato("Pollo", 400);

    var pedido = new Pedido(b1, b2, b3, p1, p2, p3);
    System.out.println(pedido.totalBebidas());
    System.out.println(pedido.totalPlatos());

  }

}
