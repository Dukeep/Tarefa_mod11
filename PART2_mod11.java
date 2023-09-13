import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PART2_mod11 {
    public static void main(String[] args) {
        String[] alunos = {"Sofia-F", "Pedro-M", "Maria-F", "Joao-M", "Carlos-M", "Ana-F"};
        Arrays.sort(alunos);

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        for (String nome : alunos) {
            if (nome.endsWith("-F")) {
                nomesFemininos.add(nome);
            } else {
                nomesMasculinos.add(nome);
            }
        }

        System.out.println("Nomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
    }
}
