package br.simulado1;


public class Vendedor extends Pessoa{
    private String matricula;


    public Vendedor(String cpf, String nome, String matricula) {
        super(cpf, nome);
        this.matricula = matricula;

    }
    public void mostraeDados(){
        System.out.println("Nome: " + getNome() + "\nCPF: " + getCpf() + "\nMatrícula: " + this.getMatricula());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
