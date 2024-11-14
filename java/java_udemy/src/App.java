

public class App {
    public static void main(String[] args) throws Exception {
        int[] numero = {1, 2, 4};
        int maiorNumero = 0;
        for(int i = 0; i < numero.length; i++){
            if(numero[i] > maiorNumero){
                maiorNumero = numero[i];
            }
        }

        System.out.println(maiorNumero);

    }
}
