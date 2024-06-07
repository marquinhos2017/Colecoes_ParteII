import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo;
    }
}

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> grupoMasculino = new ArrayList<>();
        ArrayList<Pessoa> grupoFeminino = new ArrayList<>();

        String nome, sexo;

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (Masculino/Feminino): ");
            sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);
            if (sexo.equalsIgnoreCase("Masculino")) {
                grupoMasculino.add(pessoa);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                grupoFeminino.add(pessoa);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        }

        scanner.close();

        System.out.println("\nGrupo Masculino:");
        for (Pessoa p : grupoMasculino) {
            System.out.println(p);
        }

        System.out.println("\nGrupo Feminino:");
        for (Pessoa p : grupoFeminino) {
            System.out.println(p);
        }
    }
}
