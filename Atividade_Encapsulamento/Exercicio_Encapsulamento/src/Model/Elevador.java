package Model;

public class Elevador {

    private int andarAtual;
    private int qtdAndaresPredio;
    private int capacidadeElevador;
    private int qtdPessoasElevador;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.qtdAndaresPredio = totalAndares;
        this.capacidadeElevador = capacidade;
        this.qtdPessoasElevador = 0;
    }

    public Elevador() {
        this.andarAtual = 0;
        this.qtdPessoasElevador = 0;
    }

    public void entra() {
        if (qtdPessoasElevador < capacidadeElevador) {
            qtdPessoasElevador++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (qtdPessoasElevador > 0) {
            qtdPessoasElevador--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < qtdAndaresPredio) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQtdAndaresPredio() {
        return qtdAndaresPredio;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public int getQtdPessoasElevador() {
        return qtdPessoasElevador;
    }



    public void imprimirInformacoesElevador() {
        System.out.println("\n--- STATUS DO ELEVADOR ---");
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Pessoas no elevador: " + getQtdPessoasElevador());
        System.out.println("Capacidade máxima: " + getCapacidadeElevador());
        System.out.println("Total de andares: " + getQtdAndaresPredio());
    }

}
