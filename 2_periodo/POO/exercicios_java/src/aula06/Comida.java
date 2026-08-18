package aula06;

public class Comida {
    public static void main(String args []){
        Carne c1 = new Carne("Picanha");
        Carne c2 = new Carne("Alcatra");

        Pizza p1 = new Pizza("Calabresa");
        Pizza p2 = new Pizza("Bacon");

        Pao pa1 = new Pao("Francês");
        Pao pa2 = new Pao("Forma");

        assar(c1);
        assar(p1);
        assar(pa1);
        assar(p2);
        assar(c2);
        assar(pa2);


    }
    public static void assar(Pizza pi){
        System.out.printf("Está assando: ");
        pi.mostrarMensagem();
    }
    public static void assar(Carne c){
        System.out.printf("Está assando: ");
        c.mostrarMensagem();
    }
    public static void assar(Pao pa){
        System.out.printf("Está assando: ");
        pa.mostrarMensagem();
    }
}

class Pizza{
    private String sabor;

    public Pizza(String sabor){
        this.sabor = sabor;
    }

    public void mostrarMensagem(){
        System.out.printf("Pizza sabor %s %n", this.sabor);
    }
}

class Carne{
    private String corte;

    public Carne(String corte){
        this.corte = corte;
    }

    public void mostrarMensagem(){
        System.out.printf("Carne corte %s %n", this.corte);
    }
}

class Pao{
    private String tipo;

    public Pao(String tipo){
        this.tipo = tipo;
    }

    public void mostrarMensagem(){
        System.out.printf("Pão %s %n", this.tipo);
    }
}