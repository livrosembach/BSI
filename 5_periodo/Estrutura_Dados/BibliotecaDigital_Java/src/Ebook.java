public class Ebook extends ItemBibliotecaDigital implements Baixavel{


    public Ebook(String titulo, String autor, String descricao) {
        super(titulo, autor, descricao);
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public String baixar() {
        return String.format("Baixando %s", this.titulo);
    }
}
