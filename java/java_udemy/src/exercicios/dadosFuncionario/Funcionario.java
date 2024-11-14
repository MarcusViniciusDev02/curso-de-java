package exercicios.dadosFuncionario;

public class Funcionario {
    public String nome;
    public double salarioLiquido;
    public double taxacao;

    public Funcionario(String nome, double salarioLiquido) {
        this.nome = nome;
        this.salarioLiquido = salarioLiquido;
    }

    public double taxarSalario() {
        taxacao = salarioLiquido - 1000 ;
        return taxacao;
    }

    public void incrementarSalario(double porcentagem) {
        double salarioComAcrescimo = salarioLiquido *= porcentagem;
        taxacao += salarioComAcrescimo;
        System.out.println(taxacao);
    }



}
