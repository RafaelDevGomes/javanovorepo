package ex5;

public abstract class Zoologico {

    protected String animal;

    Zoologico(String animal) {
        this.animal = animal;

    }

    public abstract String fazerSom();

    public void exibir(){
        System.out.println("Animal: " + this.animal + " e faz: " + fazerSom());
        System.out.println("");
    }
    


}
