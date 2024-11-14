package orientacaoObjetos.outroProblema;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        //Utilizar this quando quiser acessar o atributo.
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //Sobrepondo toString para imprimir os dados do produto na forma de String.
    public String toString() {
        return String.format( """
                Product: %s
                Price: $ %s
                Quantity: %s
                Total Value: %s
                """, name, price, quantity,totalValueInStock());
    }
}