//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var ebook1 = new Ebook("aa", "äa", "baita ebook");
        var ebook2 = new Ebook("aa", "äa", "baita");
        var ebook3 = new Ebook("aa", "äa", "ebook");

        var video1 = new VideoDigital("aa", "äa", "baita video");
        var video2 = new VideoDigital("aa", "äa", "baita video");
        var video3 = new VideoDigital("aa", "äa", "baita video");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(ebook3.descricao());


        System.out.println(ebook1.baixar());
        System.out.println(ebook2.baixar());
        System.out.println(ebook3.baixar());


        System.out.println(video1.descricao());
        System.out.println(video2.descricao());
        System.out.println(video3.descricao());

        System.out.println(video1.visualizar());
        System.out.println(video2.visualizar());

    }
}