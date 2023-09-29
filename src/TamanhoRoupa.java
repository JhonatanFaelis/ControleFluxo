import java.util.Locale;
import java.util.Scanner;

public class TamanhoRoupa {
    public static void main(String[] args) {

        String tamanho = "";
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual o tamanho da roupa? ");
        tamanho = scanner.next().toUpperCase();

        switch (tamanho) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
                case "G":
                System.out.println("GRANDE");
                break;
            default:
            System.out.println("INDEFINIDO");
                break;
        }
    }
}
