package Strings;

public class Strings {
    public static void main(String[] args) {
        //Aula sobre Strings 

        String original = "abcde FGIJ ABC abc DEFG";
        //Todas as letras minúsculas
        String s01 = original.toLowerCase();

        //Letra maíuscula
        String s02 = original.toLowerCase();

        //Espaços laterais, vazios, removidos;
        String s03 = original.trim();

        //Come uma caracteres a partir do índice de fim.
        String s04 = original.substring(2);

        //Esse tem inicio e um fim.
        String s05 = original.substring(2, 9);

        //Troca uma caracter pela outra.
        String s06 = original.replace('a', 'x');

        //Troca uma substring por outra
        String s07 = original.replace("abc", "iop");

        //Busca no índice qual a primeira aparição da String solicitada
        int s08 = original.indexOf("bc");

        //Busca qual a última aparição de uma determinada String
        int s09 = original.lastIndexOf("a");

        //Split
        //Transforma uma String em um vetor, dividindo de um vetor.
        String s = "Marcus Vinicius Paixão";
        String[] vecS = s.split(" ");
        //Imprime a String dividida, baseando-se no índice do vetor.
        System.out.println(vecS[0]);
        System.out.println(vecS[1]);
        System.out.println(vecS[2]);


    }
}