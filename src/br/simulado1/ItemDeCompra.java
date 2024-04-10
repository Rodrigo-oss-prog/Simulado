package br.simulado1;

public class ItemDeCompra {

    private Produto produto;
    private int quantidadeCompra;
    private double valorTotal;

    void calcularTotal(){
        this.valorTotal = this.quantidadeCompra * this.getProduto().getPrecoUnitario();

    }
    public ItemDeCompra( Produto produto, int quantidadeCompra) {
        this.produto = produto;
        this.quantidadeCompra = quantidadeCompra;
        calcularTotal();

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
