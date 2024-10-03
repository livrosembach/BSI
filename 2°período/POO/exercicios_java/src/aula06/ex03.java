package aula06;

public class ex03 {
    public static void main(String[] args){
                Mamiferos mamifero = new Mamiferos(70.5f, 5, 4, "Marrom");
                Cachorro cachorro = new Cachorro(20.0f, 3, 4, "Preto");
                Canguru canguru = new Canguru(85.0f, 7, 4, "Cinza");
                Reptil reptil = new Reptil(10.0f, 2, 4, "Verde");
                Cobra cobra = new Cobra(5.0f, 1, 0, "Verde");
                Tartaruga tartaruga = new Tartaruga(15.0f, 10, 4, "Verde");
                Peixe peixe = new Peixe(1.0f, 1, 0, "Azul");
                PeixePalhaco peixePalhaco = new PeixePalhaco(0.5f, 1, 0, "Laranja");
                Kinguyu kinguyu = new Kinguyu(0.3f, 1, 0, "Dourado");
                Ave ave = new Ave(2.0f, 2, 2, "Branca");
                Galinha galinha = new Galinha(3.0f, 2, 2, "Marrom");
                Arara arara = new Arara(1.5f, 3, 2, "Colorida");

                // Calling methods for each object
                mamifero.locomover();
                mamifero.alimentar("frutas");
                mamifero.emitirSom();

                cachorro.locomover();
                cachorro.alimentar("ração");
                cachorro.emitirSom();
                cachorro.enterrarOsso();
                cachorro.abanarRabo();

                canguru.locomover();
                canguru.alimentar("grama");
                canguru.emitirSom();
                canguru.usarBolsa();

                reptil.locomover();
                reptil.alimentar("insetos");
                reptil.emitirSom();

                cobra.locomover();
                cobra.alimentar("ratos");
                cobra.emitirSom();

                tartaruga.locomover();
                tartaruga.alimentar("vegetais");
                tartaruga.emitirSom();

                peixe.locomover();
                peixe.alimentar("algas");
                peixe.emitirSom();
                peixe.soltaBolhas();

                peixePalhaco.locomover();
                peixePalhaco.alimentar("plâncton");
                peixePalhaco.emitirSom();
                peixePalhaco.soltaBolhas();

                kinguyu.locomover();
                kinguyu.alimentar("ração");
                kinguyu.emitirSom();
                kinguyu.soltaBolhas();

                ave.locomover();
                ave.alimentar("sementes");
                ave.emitirSom();
                ave.fazerNinho();

                galinha.locomover();
                galinha.alimentar("milho");
                galinha.emitirSom();
                galinha.fazerNinho();

                arara.locomover();
                arara.alimentar("frutas");
                arara.emitirSom();
                arara.fazerNinho();

    }
}

abstract class Animal{
    protected float peso;
    protected int idade;
    protected int membros;

    public Animal(float peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    abstract void locomover();
    abstract void alimentar(String alimento);
    abstract void emitirSom();
}

class Mamiferos extends Animal{
    protected String corPelo;

    public Mamiferos(float peso, int idade, int membros, String corPelo){
        super(peso,idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    void locomover() {}
    @Override
    void alimentar(String alimento) {
        System.out.printf("Comeu %s %n", alimento);
    }

    @Override
    void emitirSom() {}
}

class Cachorro extends Mamiferos{

    public Cachorro(float peso, int idade, int membros, String corPelo){
        super(peso,idade,membros,corPelo);
    }
    public void enterrarOsso(){
        System.out.println("O osso foi enterrado \n");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo \n");
    }
    @Override
    void locomover() {
        System.out.println("O cachorro andou \n");
    }

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}

class Canguru extends Mamiferos{
    public Canguru(float peso, int idade, int membros, String corPelo){
        super(peso,idade,membros,corPelo);
    }
    public void usarBolsa(){
        System.out.println("Bolsa sendo usada \n");
    }
    @Override
    void locomover() {
        System.out.println("Canguru está pulando \n");
    }
}

class Reptil extends Animal{
    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama){
        super(peso,idade,membros);
        this.corEscama = corEscama;
    }

    @Override
    void locomover() {}

    @Override
    void alimentar(String alimento) {
        System.out.printf("Comeu %s %n",alimento);
    }

    @Override
    void emitirSom() {}
}

class Cobra extends Reptil{
    public Cobra(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros,corEscama);
    }
    void locomover(){
        System.out.println("Rastejando \n");
    }
    void emitirSom(){
        System.out.println("ssssss \n");
    }
}

class Tartaruga extends Reptil{
    public Tartaruga(float peso, int idade, int membros,String corEscama){
    super(peso, idade,membros, corEscama);
    }
    void locomover(){
        System.out.println("Andando \n");
    }
    void emitirSom(){
        System.out.println("*barulho de tartaruga* \n");
    }
}

class Peixe extends Animal{
    protected String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama){
        super(peso,idade,membros);
        this.corEscama = corEscama;
    }

    public void soltaBolhas(){
        System.out.println("Soltando Bolhas \n");
    }

    @Override
    void locomover() {
    System.out.println("Nadando \n");
    }

    @Override
    void alimentar(String alimento) {
        System.out.printf("Comeu %s %n",alimento);
    }

    @Override
    void emitirSom() {
        System.out.println("Glub glub \n");
    }
}

class PeixePalhaco extends Peixe{
    public PeixePalhaco(float peso,int idade,int membros, String corEscama){
        super(peso,idade,membros,corEscama);
    }
}

class Kinguyu extends Peixe{
    public Kinguyu(float peso,int idade,int membros, String corEscama){
        super(peso,idade,membros,corEscama);
    }
}

class Ave extends Animal{
    protected String corPena;
    public Ave(float peso, int idade, int membros, String corPena){
        super(peso,idade,membros);
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Fazendo o ninho \n");
    }

    @Override
    void locomover() {
        System.out.println("Voando \n");
    }

    @Override
    void alimentar(String alimento) {
        System.out.printf("Comeu %s %n",alimento);
    }

    @Override
    void emitirSom() {
        System.out.println("*som de ave* \n");
    }
}

class Galinha extends Ave{
    public Galinha(float peso,int idade,int membros, String corPena){
        super(peso,idade,membros,corPena);
    }
    @Override
    void locomover() {
        System.out.println("Andando \n");
    }
    @Override
    void emitirSom() {
        System.out.println("Cocorico \n");
    }
}

class Arara extends Ave{
    public Arara(float peso,int idade,int membros, String corPena){
        super(peso,idade,membros,corPena);
    }
}