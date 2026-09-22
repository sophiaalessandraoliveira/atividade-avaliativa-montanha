import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();

        if(valorProduto >= 150){
            System.out.println("O frete é grátis!");
        } 
        
        else {
            System.out.println("O frete é de R$ 15,00");
            double valorTotal = valorProduto + 15;
            System.out.println("O valor total do pedido é: R$ " + valorTotal);
        }
        entrada.close();
}
}
