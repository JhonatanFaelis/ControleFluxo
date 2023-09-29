package exercicios;
import java.util.ArrayList;

public class ExercicioCandidatosSelecao {
    public static void main(String[] args) {
        
        ArrayList<Candidato> listaCandidatos = new ArrayList<>();

        Candidato a = new Candidato("Jhonatan", 2800);
      
        Candidato b = new Candidato("Joao", 1800);
        
        Candidato c = new Candidato("Samira", 3800);
       
        Candidato g = new Candidato("Gabrielle",2000);
        

        Candidato d = new Candidato("Carlos", 2100);
        
        listaCandidatos.add(a);
        listaCandidatos.add(b);
        listaCandidatos.add(c);
        listaCandidatos.add(g);
        listaCandidatos.add(d);
        

        for(int candidado = 0; candidado < listaCandidatos.size(); candidado++)
        {
            if(listaCandidatos.get(candidado).salario > 2500){
                listaCandidatos.remove(candidado);
            }
        }
        for (Candidato candidato : listaCandidatos) {
            System.out.println("Olá ," + candidato.nome + " gostariamos de avisar que voce foi selecionado para o proximo processo na procura de sua vaga em nossa empresa");
        }        
    }

    
}


class Candidato {
    Candidato(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
       String nome = "";
       double salario = 0.00;
    }