package orientacaoObjetos.outroProblema;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data");

        System.out.println("Name: ");
        product.name = entrada.nextLine();

        System.out.println("Price: ");
        product.price = entrada.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = entrada.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be delete in stock");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);


        entrada.close();
    }
}
