package aula04;
import java.util.ArrayList;
import java.util.Scanner;

public class ex2{
    public static void main(String[] args){
        Album  hitmeHardandSoft = new Album("Hit me Hard and Soft", "Billie Eilish","2024","Bedroom Pop");
        hitmeHardandSoft.addMusic();
        hitmeHardandSoft.showMusic();
    }
}

class Album {
    private String genre;
    private String year;
    private String albumName;
    private String artist;
    private ArrayList<Music> musics = new ArrayList<Music>();

    public Album(String albumName, String artist, String year, String genre ){
        this.albumName = albumName;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    public void addMusic(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número de músicas que deseja adicionar: ");
        int lengthAlbum = input.nextInt();
        input.nextLine();

        for(int i = 0; i < lengthAlbum; i++){
            System.out.printf("Digite o nome da %d° música: \n", i+1);
            String name = input.nextLine();
            System.out.println("Digite a duração dessa música:");
            String length = input.nextLine();
            this.musics.add(new Music(name,length));
        }
    }
    public void showMusic(){
        System.out.printf("Nome: %s | Artista: %s | Ano %s | Gênero: %s \nMusicas: \n", this.albumName,this.artist,this.year,this.genre);
        for(Music song : musics){
            System.out.printf("Título: %s | Duração %s \n", song.title, song.length);
        }
    }
}

class Music{
    String title;
    String length;

    public Music(String title, String length){
        this.title = title;
        this.length = length;
    }
}
