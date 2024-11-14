package exercicios.notasAluno;

public class Aluno {
    public static void main(String[] args) {

        InformacoesAluno checagem = new InformacoesAluno();

        checagem.inserirNomeDoAluno();
        checagem.acumularNotas();
        checagem.checarSeAlunoPassou();
        checagem.imprimirResultado();

    }
}
