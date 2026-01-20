package Model;

public class Passageiro {

    private String nomeCompleto;
    private int CPF;
    private int dataNascimento;
    private int telefone;
    private int numeroPassaporte;
    private int validadePassaporte;


    public Passageiro(){

    }
    public Passageiro(String nomeCompleto, int CPF, int dataNascimento, int telefone, int numeroPassaporte, int validadePassaporte){
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.numeroPassaporte = numeroPassaporte;
        this.validadePassaporte = validadePassaporte;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public int getTelefone(){
        return telefone;
    }

    public int getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public int getValidadePassaporte() {
        return validadePassaporte;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setNumeroPassaporte(int numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public void setValidadePassaporte(int validadePassaporte) {
        this.validadePassaporte = validadePassaporte;
    }
}