public class Pessoa{
    String nome;
    String sobrenome;

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void falar(String mensagem){
        System.out.printf("%s disse %s \n", this.nome, mensagem);
    }

}

class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("João", "Das couves");
        Pessoa p2 = new Pessoa("Zé", "das Azeitonas");

        p1.falar("Bom dia");
        p2.falar("Oii!");
    }
}