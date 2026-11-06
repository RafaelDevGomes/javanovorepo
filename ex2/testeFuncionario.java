package ex2;

public class testeFuncionario {

    public static void main(String[] args) {
        
        Colaborador cl1 = new Colaborador("Rafael", 5000,"Colaborador");
        Gerente gr1 = new Gerente("Diovana",15500,"Gerente",5000 );
        
        cl1.exibirRecibo();

        gr1.exibirRecibo();
    }

}
