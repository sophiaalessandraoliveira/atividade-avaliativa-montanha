import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual foi a sua distância percorrida?: " + "km");
        double distancia = entrada.nextDouble();

        System.out.println("Quantos litros de combustível foram consumidos?: " + "km/l");
        double litros = entrada.nextDouble();

        double consumo = distancia / litros;
        System.out.println("O consumo médio do veículo foi de: " + consumo + " km/l");

        if (consumo >= 12) {
            System.out.println("este é um veículo econômico");
        } 
        else{
            System.out.println("este veículo de alto consumo");
        }
        entrada.close();

        }

    }