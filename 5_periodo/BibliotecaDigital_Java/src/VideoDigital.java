public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel{

    public VideoDigital(String titulo, String autor, String descricao) {
        super(titulo, autor, descricao);
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public String visualizar() {
        return String.format("Visualizando %s", this.titulo);
    }
}
