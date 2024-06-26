package Entities;


public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private String endereco;
    private int telefone;
    private String setor;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, String cpf, String endereco, int telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String Setor) {
        this.setor = Setor;
    }
    
    public abstract double salario();
    
    public abstract void aplicarAumento(double percentual);
    
    public String getDados(){
        return "Nome: " + nome + "\n"
               + "CPF: " + cpf + "\n"
                +"Endereco: " + endereco + "\n"
                +"Telefone: " + telefone + "\n" 
                + "Setor: " + setor + "\n";
    } 
}
