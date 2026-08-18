package aula04;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Movie> catalog = new ArrayList<>();
        catalog.add(new Movie("Titanic", "1997"));
        catalog.add(new Movie("Poderoso Chefão", "1972"));
        catalog.add(new Movie("O Diabo Veste Prada", "2006"));
        catalog.add(new Movie("O Rei do Show", "2017"));
        catalog.add(new Movie("Enrolados", "2010"));

        for(Movie movie : catalog){
            movie.print();
        }
    }
}

class Movie {
    private final String title;
    private final String releaseYear;

    public Movie(String title, String releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public void print(){
        System.out.printf("Título: %s | Ano de Lançamento: %s \n",this.title,this.releaseYear);
    }
}
