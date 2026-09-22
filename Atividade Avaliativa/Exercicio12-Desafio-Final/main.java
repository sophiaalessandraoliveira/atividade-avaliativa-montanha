import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorMinimoBrinde = 25.00;

        System.out.print("Digite a quantidade de salgados: ");
        int quantidadeSalgados = entrada.nextInt();

        System.out.print("Digite o preco de cada salgado (R$): ");
        double precoUnitario = entrada.nextDouble();

        double totalCompra = quantidadeSalgados * precoUnitario;

        System.out.println("Quantidade de salgados: " + quantidadeSalgados);
        System.out.printf("Preco unitario: R$ ", precoUnitario);
        System.out.printf("Total da compra: R$ ", totalCompra);

        if (totalCompra >= valorMinimoBrinde) {
            System.out.println("Brinde: voce ganhou um suco de cortesia!");
        } else {
            System.out.println("Brinde: nao atingiu o valor minimo para o suco de cortesia");
        }

        entrada.close();
    }
}