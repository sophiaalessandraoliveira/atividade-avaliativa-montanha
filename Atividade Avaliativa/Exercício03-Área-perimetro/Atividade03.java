import java.util.Scanner;

public class App {

    public static void main (String[] args) throws Exception{
        Scanner entrada = new Scanner (System.in);

         System.out.print("Digite a base do terreno: ");
        double base = entrada.nextDouble();
 
        System.out.print("Digite a altura do terreno: ");
        double altura = entrada.nextDouble();
 
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println();
      
        System.out.println("A sua área é no total: " + area);
        System.out.println("O perímetro da sua área é: " + perimetro);

 

        entrada.close();
    }
}