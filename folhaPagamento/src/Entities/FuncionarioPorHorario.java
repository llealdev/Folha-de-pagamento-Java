package Entities;


public class FuncionarioPorHorario extends Funcionario{
    
    private int horas;
    private double valorHora;
    
    public FuncionarioPorHorario(){
        
    }

    public FuncionarioPorHorario(int horas, double valorHora, String nome, String cpf, String endereco, int telefone, String Setor) {
        super(nome, cpf, endereco, telefone, Setor);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double salario() {
        return horas * valorHora;
    }

   @Override
    public void aplicarAumento(double percentual) {
       valorHora *= (1 + percentual / 100);
    }
    
    
    
}
