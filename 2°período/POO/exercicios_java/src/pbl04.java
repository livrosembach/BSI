import java.util.ArrayList;
import java.util.Scanner;

public class pbl04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shelf shelf1 = new Shelf(1);
        shelf1.addBook(new Book(1, "A Vida Invisível de Addie La Rue", "V.E.Schwab", "Galera Record", 504, "2021", false));
        shelf1.addBook(new Book(2, "1984", "George Orwell", "Companhia das Letras", 336, "1949", true));
        shelf1.addBook(new Book(3, "O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", 1216, "1954", false));
        Shelf shelf2 = new Shelf(2);
        shelf2.addBook(new Book(4, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Rocco", 223, "1997", true));
        shelf2.addBook(new Book(5, "O Hobbit", "J.R.R. Tolkien", "HarperCollins", 310, "1937", false));
        shelf2.addBook(new Book(6, "Dom Quixote", "Miguel de Cervantes", "Francisco de Robles", 1072, "1605", true));
        Shelf shelf3 = new Shelf(3);
        shelf3.addBook(new Book(7, "O Código Da Vinci", "Dan Brown", "Sextante", 480, "2003", true));
        shelf3.addBook(new Book(8, "A Culpa é das Estrelas", "John Green", "Intrínseca", 288, "2012", true));
        shelf3.addBook(new Book(9, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Agir", 96, "1943", false));
        Shelf shelf4 = new Shelf(4);
        shelf4.addBook(new Book(10, "O Alquimista", "Paulo Coelho", "HarperOne", 208, "1988", false));
        shelf4.addBook(new Book(11, "A Menina que Roubava Livros", "Markus Zusak", "Intrínseca", 480, "2005", false));
        shelf4.addBook(new Book(12, "O Nome do Vento", "Patrick Rothfuss", "Arqueiro", 656, "2007", true));
        Library library1 = new Library();
        library1.addShelfs(shelf1);
        library1.addShelfs(shelf2);
        Library library2 = new Library();
        library2.addShelfs(shelf3);
        library2.addShelfs(shelf4);
        ArrayList<Shelf> shelves = new ArrayList<>();
        shelves.add(shelf1);
        shelves.add(shelf2);
        shelves.add(shelf3);
        shelves.add(shelf4);

        System.out.println("******* Menu *******\n--- Biblioteca 1 ---\n");
        library1.print();
        System.out.println("\n --- Biblioteca 2 ---\n");
        library2.print();

        while (true) {
            System.out.println("Deseja:\n1 - Emprestar um Livro\n2 - Devolver um Livro\n20 - Sair");
            String rentOrReturn = input.nextLine();
            while (!rentOrReturn.equals("1") && !rentOrReturn.equals("2") && !rentOrReturn.equals("20")) {
                System.out.println("Opção inválida");
                System.out.println("Deseja:\n1 - Emprestar um Livro\n2 - Devolver um Livro\n20 - Sair");
                rentOrReturn = input.nextLine();
            }
            if (rentOrReturn.equals("20")) {
                System.out.println("Você saiu com sucesso!");
                break;
            }
            System.out.println("Insira o código do livro que deseja:");
            int bookCode = Integer.parseInt(input.nextLine());
            handleBookOperation(shelves, bookCode, rentOrReturn);
        }
    }

    public static void handleBookOperation(ArrayList<Shelf> shelves, int bookCode, String rentOrReturn) {
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getId() == bookCode) {
                    if (rentOrReturn.equals("1")) {
                        rentBook(book);
                    } else if (rentOrReturn.equals("2")) {
                        returnBook(book);
                    }
                    return;
                }
            }
        }
        System.out.println("Código do livro inválido.");
    }

    public static void rentBook(Book book) {
        if (book.getRented()) {
            System.out.println("O livro já está emprestado.");
        } else {
            book.setRented(true);
            System.out.println("Você emprestou o livro: " + book.getTitle());
        }
    }

    public static void returnBook(Book book) {
        if (book.getRented()) {
            book.setRented(false);
            System.out.println("Você devolveu o livro: " + book.getTitle());
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }
}

class Library {
    private ArrayList<Shelf> listShelfs = new ArrayList<>();

    public void addShelfs(Shelf shelf) {
        listShelfs.add(shelf);
    }

    public void print() {
        for (Shelf shelf : listShelfs) {
            shelf.print();
        }
    }
}

class Shelf {
    private final int id;
    private ArrayList<Book> listBooks = new ArrayList<>();

    public Shelf(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("+ Prateleira " + id);
        for (Book book : listBooks) {
            book.print();
        }
    }

    public void addBook(Book book) {
        listBooks.add(book);
    }

    public ArrayList<Book> getBooks() {
        return listBooks;
    }
}

class Book {
    private final int id;
    private final String title;
    private final String releaseYear;
    private final String author;
    private final String publisher;
    private final int pages;
    private boolean rented;

    public Book(int id, String title, String author, String publisher, int pages, String releaseYear, boolean rented) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.releaseYear = releaseYear;
        this.rented = rented;
    }

    public int getId() {
        return id;
    }

    public boolean getRented() {
        return rented;
    }

    public void print() {
        if (rented) {
            System.out.printf("Código: %d | Título: %s | Autor: %s | Editora:  %s | Páginas: %d | Ano de Lançamento: %s | Emprestado \n", this.id, this.title, this.author, this.publisher, this.pages, this.releaseYear);
        } else {
            System.out.printf("Código: %d | Título: %s | Autor: %s | Editora:  %s | Páginas: %d | Ano de Lançamento: %s | Disponível \n", this.id, this.title, this.author, this.publisher, this.pages, this.releaseYear);
        }
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getTitle() {
        return title;
    }
}