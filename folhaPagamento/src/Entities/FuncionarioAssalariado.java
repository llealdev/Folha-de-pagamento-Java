package Entities;


public class FuncionarioAssalariado extends Funcionario{
    
    private double salario;
    
    public FuncionarioAssalariado(){
        
    }

    public FuncionarioAssalariado(double salario, String nome, String cpf, String endereco, int telefone, String Setor) {
        super(nome, cpf, endereco, telefone, Setor);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double salario() {
        return salario;
    }

    @Override
    public void aplicarAumento(double percentual) {
       salario *= (1 + percentual / 100);
    }
    
    
}
