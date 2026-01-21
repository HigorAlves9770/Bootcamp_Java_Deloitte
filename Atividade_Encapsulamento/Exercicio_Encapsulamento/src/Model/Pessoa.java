package Model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nomePessoa;
    private LocalDate dataNascimentoPessoa;
    private double alturaPessoa;

    public Pessoa(String nomePessoa, LocalDate dataNascimentoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.dataNascimentoPessoa = dataNascimentoPessoa;
        this.alturaPessoa = alturaPessoa;
    }

    public Pessoa() {
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public LocalDate getDataNascimentoPessoa() {
        return dataNascimentoPessoa;
    }

    public void setDataNascimentoPessoa(LocalDate dataNascimentoPessoa) {
        this.dataNascimentoPessoa = dataNascimentoPessoa;
    }

    public double getAlturaPessoa() {
        return alturaPessoa;
    }

    public void setAlturaPessoa(double alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }

    public int calcularIdade() {
        return Period.between(this.dataNascimentoPessoa, LocalDate.now()).getYears();
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Data de nascimento: " + dataNascimentoPessoa);
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Altura: " + alturaPessoa + " m");
    }
}
