import Model.Passageiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Passageiro> passageiros = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 – Cadastrar Passageiro");
            System.out.println("2 – Listar Passageiro");
            System.out.println("3 – Atualizar Passageiro");
            System.out.println("4 – Apagar Passageiro");
            System.out.println("9 – Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPassageiro(sc);
                    break;

                case 2:
                    System.out.print("Digite o número do passaporte: ");
                    listarPassageiro(sc.nextInt());
                    break;

                case 3:
                    AtualizarRegistro(sc);
                    break;

                case 4:
                    System.out.print("Digite o número do passaporte: ");
                    ApagarRegistro(sc.nextInt());
                    break;

                case 9:
                    System.out.println("Finalizando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);

        sc.close();
    }

    // CREATE
    public static void cadastrarPassageiro(Scanner sc) {
        System.out.print("Nome Completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.print("CPF: ");
        int CPF = sc.nextInt();

        System.out.print("Data de Nascimento: ");
        int dataNascimento = sc.nextInt();

        System.out.print("Telefone: ");
        int telefone = sc.nextInt();

        System.out.print("Numero de Passaporte: ");
        int numeroPassaporte = sc.nextInt();

        System.out.print("Validade do Passaporte: ");
        int validadePassaporte = sc.nextInt();

        Passageiro p = new Passageiro(nomeCompleto, CPF, dataNascimento, telefone, numeroPassaporte, validadePassaporte);
        passageiros.add(p);

        System.out.println("Passageiro cadastrado com sucesso!");
    }

    // READ
    public static void listarPassageiro(int numeroPassaporte) {
        for (Passageiro p : passageiros) {
            if (p.getNumeroPassaporte() == numeroPassaporte) {
                System.out.println("Nome Completo: " + p.getNomeCompleto());
                System.out.println("CPF: " + p.getCPF());
                System.out.println("Data de Nascimento: " + p.getDataNascimento());
                System.out.println("Telefone: " + p.getTelefone());
                System.out.println("Numero do Passaporte: " + p.getNumeroPassaporte());
                System.out.println("Validade do Passaporte: " + p.getValidadePassaporte());
                return;
            }
        }
        System.out.println("Passageiro não encontrado.");
    }

    // UPDATE
    public static void AtualizarRegistro(Scanner sc) {
        System.out.print("Digite o número do passaporte: ");
        int numeroPassaporte = sc.nextInt();

        for (Passageiro p : passageiros) {
            if (p.getNumeroPassaporte() == numeroPassaporte) {

                System.out.print("Novo nome: ");
                String nomeCompleto = sc.next();

                System.out.print("Novo telefone: ");
                int telefone = sc.nextInt();

                System.out.print("Nova validade do passaporte: ");
                int validade = sc.nextInt();

                p.setTelefone(telefone);
                p.setValidadePassaporte(validade);
                p.setNomeCompleto(nomeCompleto);

                System.out.println("Dados atualizados com sucesso!");
                return;
            }
        }
        System.out.println("Passageiro não encontrado.");
    }

    // DELETE
    public static void ApagarRegistro(int numeroPassaporte) {
        for (Passageiro p : passageiros) {
            if (p.getNumeroPassaporte() == numeroPassaporte) {
                passageiros.remove(p);
                System.out.println("Passageiro removido com sucesso!");
                return;
            }
        }
        System.out.println("Passageiro não encontrado.");
    }
}