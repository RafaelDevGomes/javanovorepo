package ex2;

public class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected String cargo;


   public Funcionario(String NomeF, double salarioBaseF, String cargoF){
        this.nome = NomeF;
        this.salarioBase = salarioBaseF;
        this.cargo = cargoF;

    }

    public double calcularSalario(){
        return(this.salarioBase);

    }
    
    public void exibirRecibo(){
        System.out.println("Cargo:" + this.cargo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salarioBase);
        System.out.println("Salario final: " + this.calcularSalario());
    }
}
