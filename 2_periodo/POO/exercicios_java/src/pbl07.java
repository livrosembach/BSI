
public class pbl07 {
    public static void teste(String[] args) {

                JamesBond jamesBond = new JamesBond(true, 0.0f, 0.0f, 0.0f, 0);
                Batman batman = new Batman(true, 0.0f, 0.0f, 0.0f, 0);

                Ladrao ladrao = new Ladrao(true, 0.0f, 0.0f, 0.0f, 0);
                Coringa coringa = new Coringa(true, 0.0f, 0.0f, 0.0f, 0);
                Pinguim pinguim = new Pinguim(true, 0.0f, 0.0f, 0.0f, 0);
                Terrorista terrorista = new Terrorista(true, 0.0f, 0.0f, 0.0f, 0);
                Goldfinger goldfinger = new Goldfinger(true, 0.0f, 0.0f, 0.0f, 0, jamesBond);
                DrNo drNo = new DrNo(true, 0.0f, 0.0f, 0.0f, 0);


                jamesBond.correr(1.0f, 1.0f);
                jamesBond.saltar(2.0f);
                jamesBond.atirar();
                jamesBond.morrer();

                batman.correr(1.0f, 1.0f);
                batman.saltar(2.0f);
                batman.atirar();
                batman.camuflar(1);
                batman.morrer();

                ladrao.correr(1.0f, 1.0f);
                ladrao.saltar(2.0f);
                ladrao.morrer();

                coringa.correr(1.0f, 1.0f);
                coringa.saltar(2.0f);
                coringa.atirar();
                coringa.morrer();


                pinguim.correr(1.0f, 1.0f);
                pinguim.saltar(2.0f);
                pinguim.atirar();
                pinguim.morrer();

                terrorista.correr(1.0f, 1.0f);
                terrorista.saltar(2.0f);
                terrorista.atirar();
                terrorista.morrer();

                goldfinger.correr(1.0f, 1.0f);
                goldfinger.saltar(2.0f);
                goldfinger.atirar();
                goldfinger.camuflar(1);
                goldfinger.personificar(jamesBond);
                goldfinger.morrer();

                drNo.correr(1.0f, 1.0f);
                drNo.saltar(2.0f);
                drNo.atirar();
                drNo.morrer();
    }
}
abstract class Personagem{
    protected boolean vivo;
    protected float posicao_x;
    protected  float posicao_y;
    protected float posicao_z;
    protected int cor;

    public Personagem(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        this.vivo = vivo;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.posicao_z = posicao_z;
        this.cor = cor;
    }

    public void correr(float x, float y){}
    public void saltar(float z){}
    public void atirar(){}
    public void morrer(){
        this.vivo = false;
        System.out.println("Morreu");
    }
}

abstract class Heroi extends Personagem{
    public Heroi(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Heroi está correndo");
    }
    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("Heroi está saltando");
    }
}

class JamesBond extends Heroi{
    public JamesBond(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void atirar(){
        System.out.println("James Bond atirando");
    }
    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("James Bond está saltando");
    }
}

class Batman extends Heroi implements Camuflagem{
    public Batman(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void atirar(){
        System.out.println("Batman atirando");
    }
    public void camuflar(int cor){
        this.cor = cor;
        System.out.println("Batman está camuflado");
    }
}


interface Camuflagem{
    public void camuflar(int cor);
}

interface Personificacao extends Camuflagem{
    public void personificar(Heroi h);
}

class Vilao extends Personagem{
    public Vilao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Vilão está correndo");
    }
}

class Ladrao extends Vilao{
    public Ladrao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("Ladrão está saltando");
    }
}

class Coringa extends Ladrao{
    public Coringa(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void atirar(){
        System.out.println("Coringa atirando");

    }
}

class Pinguim extends Ladrao{
    public Pinguim(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void atirar(){
        System.out.println("Pinguim atirando");
    }
    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Pinguim está correndo");
    }
}

class Terrorista extends Vilao{
    public Terrorista(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void atirar(){
        System.out.println("Terrorista atirando");
    }
}

class Goldfinger extends Terrorista implements Personificacao{
    private Heroi heroi;
    public Goldfinger(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor, Heroi heroi){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
        this.heroi = heroi;
    }

    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("Goldfinger está saltando");
    }

    public void camuflar(int cor){
        this.cor = cor;
        System.out.println("Goldfinger está camuflado");
    }
    public void personificar(Heroi h){
        this.heroi = h;
        System.out.println("Personificando");
    }
}

class DrNo extends Terrorista{
    public DrNo(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo,posicao_x,posicao_y,posicao_z,cor);
    }

    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Dr No está correndo");
    }
    public void atirar(){
        System.out.println("Dr No atirando");
    }
    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("Dr No está saltando");
    }
}