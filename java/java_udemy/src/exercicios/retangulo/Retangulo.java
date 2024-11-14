package exercicios.retangulo;

public class Retangulo {
    public double width;
    public double height;

    public Retangulo (double width, double height){
        this.width = width;
        this.height = height;
    }
    public double Area(){
        return (width * height);
    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return String.format("""
                Area: %s
                Perimetro: %s
                Diagonal: %.2f
                """, Area(), calculatePerimeter(), calculateDiagonal());
    }
}
