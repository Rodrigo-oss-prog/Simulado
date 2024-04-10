package br.simulado1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compra {

    private Vendedor vendedor;
    private Cliente cliente;
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotalCompra;

    private double valorDesconto;
    private double valorPagar;
    private List<ItemDeCompra> itensDeCompra = new ArrayList<>();


    public Compra(Cliente cliente, Vendedor vendedor, String numeroCompra, LocalDate dataCompra) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;

    }
    public void calcularValorTotalCompra(){
        double total = 0;
        for(ItemDeCompra i : itensDeCompra) {
            total = total + i.getValorTotal();
            valorTotalCompra = total;
            if (total > 5000) {
                this.valorDesconto = this.getValorTotalCompra() * 0.10;

            } else {
                this.valorDesconto = 0;

            }this.valorPagar = getValorTotalCompra() - this.valorDesconto;
        }
    }
    public void incluirItemCompra(ItemDeCompra...itemDeCompras){
        Collections.addAll(itensDeCompra, itemDeCompras);
        this.calcularValorTotalCompra();



    }

    public void removerItemCompras(ItemDeCompra itemDeCompra){
        itensDeCompra.remove(itemDeCompra);
        this.calcularValorTotalCompra();

    }

    public void mostrarDados(){
        System.out.println("Vendedor: " + this.vendedor.getNome() + "\nCliente: " + this.cliente.getNome() +
                "\nNúmero da compra: " + this.getNumeroCompra() + "\nData da compra: " +
                this.getDataCompra().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nDesconto: " + this.valorDesconto
                + "\nValor Total: " + this.getValorTotalCompra() + "\nValor a Pagar: " + this.getValorPagar());
                System.out.println("Itens da compra: ");
                for(ItemDeCompra i : itensDeCompra){
                    System.out.println("Produto: " + i.getProduto().getDescricao()+
                                            "\nQuantidade: " + i.getQuantidadeCompra());

                }

    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public List<ItemDeCompra> getItensDeCompra() {
        return itensDeCompra;
    }

    public void setItensDeCompra(List<ItemDeCompra> itensDeCompra) {
        this.itensDeCompra = itensDeCompra;
    }
}