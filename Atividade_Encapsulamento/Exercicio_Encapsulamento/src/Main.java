import Model.Elevador;
import Model.JogadorFutebol;
import Model.Pessoa;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo!");
        System.out.println("Cadastro:");

        System.out.print("Nome: ");
        String nomePessoa = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        int ano = sc.nextInt();

        System.out.print("Mês de nascimento: ");
        int mes = sc.nextInt();

        System.out.print("Dia de nascimento: ");
        int dia = sc.nextInt();

        LocalDate dataNascimentoPessoa = LocalDate.of(ano, mes, dia);

        System.out.print("Altura: ");
        double alturaPessoa = sc.nextDouble();

        sc.nextLine();

        System.out.print("Você é jogador de futebol? (S/N): ");
        String opcao = sc.nextLine().toUpperCase(Locale.ROOT);

        if (opcao.equals("S")) {

            System.out.print("Posição: ");
            String posicao = sc.nextLine();

            System.out.print("Nacionalidade: ");
            String nacionalidadeJogador = sc.nextLine();

            System.out.print("Peso: ");
            double pesoJogador = sc.nextDouble();

            JogadorFutebol j = new JogadorFutebol(nomePessoa, posicao, dataNascimentoPessoa, nacionalidadeJogador, alturaPessoa, pesoJogador);

            System.out.println("\nJogador cadastrado!");
            j.imprimirInformacoes();

        } else {

            Pessoa p = new Pessoa(nomePessoa, dataNascimentoPessoa, alturaPessoa);

            System.out.println("Pessoa cadastrada!");
            p.imprimirInformacoes();
        }

        System.out.println("Pode Entrar!");

        System.out.print("Informe o total de andares do prédio: ");
        int totalAndares = sc.nextInt();

        System.out.print("Informe a capacidade do elevador: ");
        int capacidade = sc.nextInt();

        Elevador elevador = new Elevador(totalAndares, capacidade);

        int opcao2;

        do {
            System.out.println("\n===== MENU DO ELEVADOR =====");
            System.out.println("1 - Entrar pessoa");
            System.out.println("2 - Sair pessoa");
            System.out.println("3 - Subir andar");
            System.out.println("4 - Descer andar");
            System.out.println("5 - Mostrar status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao2 = sc.nextInt();

            switch (opcao2) {
                case 1:
                    elevador.entra();
                    break;

                case 2:
                    elevador.sai();
                    break;

                case 3:
                    System.out.print("Quantos andares deseja subir? ");
                    int qtd = sc.nextInt();

                    for (int i = 0; i < qtd; i++) {
                        elevador.sobe();
                    }
                    break;

                case 4:
                    System.out.print("Quantos andares deseja descer? ");
                    int qtd2= sc.nextInt();

                    for (int i = 0; i < qtd2; i++) {
                        elevador.desce();
                    }
                    break;

                case 5:
                    elevador.imprimirInformacoesElevador();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao2 != 0);

        sc.close();

    }
}