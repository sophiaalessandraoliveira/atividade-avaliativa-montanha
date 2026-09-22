import java.util.Scanner;

 public class App{

    public static void main(String args) throws exception{
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32

        System.out.println("A temperatura informada em Celsius é:  " + celsius);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);


       entrada.close();

    }
 }
