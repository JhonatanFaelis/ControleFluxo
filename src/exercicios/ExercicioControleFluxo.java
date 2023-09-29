package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        
        double salario_base = 2500.00, slario_pretendido = 0.00;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       
        System.out.println("Digite o Pretendido base do funcionario");
        slario_pretendido = scanner.nextDouble();    
        
        verificarSalario(salario_base, slario_pretendido);

    }

    static void verificarSalario (double salarioBse, double salarioPretendido){
        if (salarioBse > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBse == salarioPretendido) {
            System.out.println("Ligar com contra proposta");
        }
        else{
            System.out.println("Aguardar outros candidatos");
        }
    }
}





//primeir caso, verificar o salario do funcionario, caso ele tenha um salario base maior que o pretendido, ligar para o funcionario 
// se o salario base for igual ao salario pretendido, ligar com contra proposta
// se nao, aguardando resultado dos outros candidatos