import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto: ");
        double valorUnitario = entrada.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = entrada.nextInt();

        double subtotal = valorUnitario * quantidade;

        System.out.println("O subtotal é: " + subtotal);

        if (subtotal >= 200) {
            System.out.println("O desconto é de 5%");
            double desconto = subtotal * 0.05;  

            System.out.println("O valor total a ser pago é: " + (subtotal - desconto));
            double valorTotal = subtotal - desconto;

          }  else {
                System.out.println("O desconto é de 0%");
                double desconto = 0; 
                
                System.out.println("O valor total a ser pago é: " + subtotal);
    }

    entrada.close();

}

}
