package exercicios;

public class exe5 {
    public static void main(String[] args) {
        double celcius = 0, fahrenheit = 32;

        double retsultadoFahrenheit = converterParaFahrenheit(celcius);
        double resultadoCelsius = converterParaCelsius(fahrenheit);
        System.out.println(retsultadoFahrenheit);
        System.out.println(resultadoCelsius);
    }


    public static double converterParaFahrenheit(double celsius){

        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static double converterParaCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}