public abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;
    protected String descricao;

    public ItemBibliotecaDigital(String titulo, String autor, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
    }

    public abstract String descricao();
}
