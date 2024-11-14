package exercicios.notasAluno;

import java.util.Scanner;

public class InformacoesAluno {
    private String nome;
    private double nota;
    private boolean passou;
    private Scanner entrada = new Scanner(System.in);
    private double acumuloNota = 0;

    public String inserirNomeDoAluno() {
        System.out.println("Qual o nome do aluno?");
        nome = entrada.nextLine();
        return nome;
    }

    public double acumularNotas() {
        int contador = 0;

        while (true) {
            System.out.println("Insira as notas do aluno");
            nota = entrada.nextDouble();
            if (contador == 0 && nota > 30) {
                System.out.println("Número inválido, repita a operação");
                contador -= 1;
            }

            if (contador >= 1 && nota > 35) {
                System.out.println("Número inválido, repita a operação");
                contador -= 1;
            }

            contador++;
            acumuloNota += nota;

            if (contador > 2) {
                break;
            }
        }
        return acumuloNota;
    }

    public boolean checarSeAlunoPassou() {
        double notaDeCorte = 60.0;
        if (acumuloNota > notaDeCorte) {
            return passou = true;
        }
        return passou = false;
    }

    public void imprimirResultado() {
        if (passou == true) {
            System.out.printf("Aluno %s foi aprovado! Nota: %s ", nome, acumuloNota);
        } else {
            System.out.printf("Aluno %s foi reprovado! Nota: %s", nome, acumuloNota);
        }
    }


}
