package Model;

import java.time.LocalDate;

public class JogadorFutebol extends Pessoa {

    private String posicao;
    private String nacionalidadeJogador;
    private double pesoJogador;

    public JogadorFutebol(String nomeJogador, String posicao, LocalDate dataNascimentoJogador, String nacionalidadeJogador, double alturaJogador, double pesoJogador
    ) {
        super(nomeJogador, dataNascimentoJogador, alturaJogador);
        this.posicao = posicao;
        this.nacionalidadeJogador = nacionalidadeJogador;
        this.pesoJogador = pesoJogador;
    }

    public JogadorFutebol() {
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidadeJogador() {
        return nacionalidadeJogador;
    }

    public void setNacionalidadeJogador(String nacionalidadeJogador) {
        this.nacionalidadeJogador = nacionalidadeJogador;
    }

    public double getPesoJogador() {
        return pesoJogador;
    }

    public void setPesoJogador(double pesoJogador) {
        this.pesoJogador = pesoJogador;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();

        System.out.println("Posição: " + posicao);
        System.out.println("Nacionalidade: " + nacionalidadeJogador);
        System.out.println("Peso: " + pesoJogador + " kg");
    }

}
