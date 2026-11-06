package ex2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nomeG, double salarioG, String cargoG, double bonus) {
        super(nomeG, salarioG, cargoG);
        this.bonus = bonus;
    }

    @Override 

    public double calcularSalario(){
    return(this.salarioBase + this.bonus);

    }


    
     

}
