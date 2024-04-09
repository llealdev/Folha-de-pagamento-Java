package Application;

import Entities.Funcionario;
import Entities.FuncionarioAssalariado;
import Entities.FuncionarioPorHorario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> funcionario = new ArrayList<>();
        
      
            for(int i = 0; i < 10; i++){
                System.out.println("----- Funcionários -----");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("Endereço: ");
                String endereco = sc.nextLine();
                System.out.print("Telefone: ");
                int telefone = sc.nextInt();
                sc.nextLine();
                System.out.print("Setor: ");
                String setor = sc.nextLine();
                System.out.print("Assalriado(A) ou Horista(H): ");
                char pagamento = sc.next().charAt(0);
                if(pagamento == 'A'){
                    System.out.print("Informe o seu salário: R$");
                    double salario = sc.nextDouble();
                    funcionario.add(new FuncionarioAssalariado(salario, nome, cpf, endereco, telefone, setor));
                }
                else if(pagamento == 'H'){
                    System.out.print("Informe o da sua hora: R$");
                    double valorHora = sc.nextDouble();
                    System.out.print("Informe quantas horas trabalhada você possui");
                    int horas = sc.nextInt();
                    funcionario.add(new FuncionarioPorHorario(horas, valorHora, nome, cpf, endereco, telefone, setor));
                }
                else{
                    System.out.println("Tipo de funcionário inválido!");
                }
                
            }
        
            
            
             for(Funcionario fun: funcionario){
                    System.out.println("Dados do Funcionário: ");
                    System.out.println(fun.getDados());
                    System.out.println("Pagamento: R$" + String.format("R$ %.2f",fun.salario()));
                    System.out.println();
                }
             
             System.out.println("Digite o percentual de aumento: ");
             int aumento = sc.nextInt();
             
             for (Funcionario fun : funcionario){
                 fun.aplicarAumento(aumento);
             }
             
             System.out.println();
             System.out.println("Após o aumento de " + aumento + "%: " );
             for(Funcionario fun: funcionario){
                 System.out.println("Dados do funcionário: ");
                 fun.getDados();
                 System.out.println("Pagamento: R$" + String.format("R$ %.2f",fun.salario()));
                 System.out.println();
             }
        
        
        
        
        
        sc.close();
                
                
    }
    
}
