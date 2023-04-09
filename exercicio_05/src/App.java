import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double centimetro;
        double metro;

        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Valor em metros:");

            metro = teclado.nextDouble();

            centimetro = metro * 100;

            System.out.printf("O valor convertido para centimetros é:%.1f", centimetro);

        }
    }

}
