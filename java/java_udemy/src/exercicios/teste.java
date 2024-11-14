package exercicios;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        double acumuloNota = 0;

        while (true) {
            System.out.println("Insira as notas do aluno");
            double nota = entrada.nextDouble();
            if (contador == 0 && nota > 30) {
                System.out.println("Número inválido, repita a operação");
                contador -= 1;
            }

            if (contador >= 1 && nota > 35) {
                System.out.println("Número inválido, repita a operação");
                contador -= 1 ;
            }

            contador++;

            if (contador > 2) {
                break;
            }
        }
    }
}
