package br.simulado1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente extends Pessoa{

    private String telefone;

    private List<Compra> comprasList = new ArrayList<>();


    void exibirHistórico(LocalDate dataInicial, LocalDate dataFinal){
        boolean existeCompra = false;
        for (Compra c: comprasList){
            if (c.getDataCompra().isAfter(dataInicial) &&
                    c.getDataCompra().isBefore(dataFinal)){
                System.out.println("Compras do Cliente: " + this.getNome());
                c.mostrarDados();
                existeCompra = true;
            }
            if (!existeCompra){
                System.out.println("Não existe compra!");
            }


        }

    }

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome);
        this.telefone = telefone;
    }

    public void mostraDados(){
        System.out.println("Nome: " + this.getNome() + "CPF: " + this.getCpf() + "Telefone: " + this.getTelefone());
    }

    public void incluirCompra(Compra...compras){
        Collections.addAll(comprasList, compras);

    }

    public void removerCompras(Compra compra){
        comprasList.remove(compra);

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Compra> getCompras() {
        return comprasList;
    }

    public void setCompras(List<Compra> compras) {
        this.comprasList = compras;
    }
}