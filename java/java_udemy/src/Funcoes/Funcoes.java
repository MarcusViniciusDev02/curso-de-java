package Funcoes;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int higher = max(a, b, c); // Argumentos

        System.out.println("Higher = " + higher);
        entrada.close();
    }

    // Parâmetros são variáveis da função, são como cópias das variáveis argumentos.
    public static int max(int f, int z, int k) {
        // A função deve ter o mesmo tipo de dado que será retornado.
        if (f > z && f > k) {
            return f;
        } else if (z > k) {
            return z;
        } else {
            return k;
        }
    }
}