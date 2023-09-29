import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor desejado :");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado > saldo)
        System.out.println("Saldo insuficiente, saldo em conta é de " + saldo);
        else{
            double novoSaldo = saldo - valorSolicitado;
            System.out.println("Retire seu dinheiro abaixo! Seu novo saldo é de  " + novoSaldo );
        }
    }
}