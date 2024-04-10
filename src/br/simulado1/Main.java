package br.simulado1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mesa 4 lugares", 200.00);
        Produto p2 = new Produto("Mesa 6 lugares", 500.00);

        Vendedor v1 = new Vendedor("222.233.222-11", "Jonas", "225589");
        Cliente cli1 = new Cliente("111.555.649-10", "Maria", "11984335768");
        ItemDeCompra item1 = new ItemDeCompra(p1, 1);
        ItemDeCompra item2 = new ItemDeCompra(p2, 1);

        Compra c1 = new Compra(cli1, v1, "22054", LocalDate.of(2024,9,12));
        c1.incluirItemCompra(item1, item2);
        cli1.incluirCompra(c1);
        cli1.exibirHistórico(LocalDate.of(2024,9,1),
                LocalDate.of(2024,9,30));

    }

}