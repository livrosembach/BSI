class Album {
    String genero;
    int ano;
    String  nome;
    String  artista;
    Musica[] musicas = new Musica[5];

    public Album(String genero, int ano, String nome, String artista, Musica[] musicas){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void descricao(){
        System.out.printf("Gênero: %s \n Ano: %s \n Nome: %s  \n Artista: %s \n", this.genero, this.ano, this.nome,this.artista);
    }
}
class Musica {
    String titulo;
    double duracao;

    public Musica(String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void tocarMusica(){
        System.out.printf("Titulo: %s \n Duração %s \n", this.titulo, this.duracao);
    }
}

class Main {
    public static void main(String[] args) {
        Musica[] musicas = new Musica[5];

        musicas[0] = new Musica("Never mind",2.23);
        musicas[1] = new Musica("Vibing", 3.32);
        musicas[2] = new Musica("Mindfulness", 2.14);
        musicas[3] = new Musica("Never Again", 3.24);
        musicas[4] = new Musica("Mind Vibes", 2.56);
        Album a1 = new Album("Jazz", 2021, "Vibe", "Josefina",musicas);

        a1.descricao();

        for(int i = 0; i < 5; i++){
            Musica m = musicas[i];
            m.tocarMusica();
        }
    }
}