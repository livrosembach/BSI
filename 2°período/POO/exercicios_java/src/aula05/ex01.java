package aula05;

public class ex1 {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro("Totó");
        Gato g1 = new Gato("Garfield");
        Gato g2 = new Gato("Rex");


        c1.latir();
        g1.miar();
        g2.miar();

        c1.caminhar();
    }
}

class Animal{
    protected String name;
    protected String race;

    public Animal() {
        this.name = "toto";
        this.race = "Vira-lata";
    }
    public Animal(String name){
        this.name = name;
        this.race = "Vira-lata";
    }
    public void caminhar(){
        System.out.println("Caminhando");
    }
    public String getName(){
        return this.name;
    }
}

class Cachorro extends Animal{
    public Cachorro(String name){
        super(name);
    }
    public void latir(){
        System.out.println("latindo " + getName());
    }
}

class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato(String name){
        super(name);
    }
    public void miar(){
        System.out.println("miando " + getName());
    }
}
