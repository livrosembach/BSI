package aula05;

public class ex02 {
    public static void  main(String[] args){
        ImovelNovo i1 = new ImovelNovo("Rua", 5000.0);
        ImovelAntigo i2 = new ImovelAntigo("rua", 5000.0);

        i1.getAcrecimo();
        System.out.println(i1.toString());

        i2.getDesconto();
        System.out.println(i2.toString());

    }
}
class Imovel {
protected String endereco;
protected Double preco;

public Imovel(String endereco, Double preco) {
    this.endereco = endereco;
    this.preco = preco;
}

public Imovel() {
}
}

class ImovelNovo extends Imovel {

    public ImovelNovo() {
        super();
    }

    public ImovelNovo(String endereco, Double preco) {
        super(endereco, preco);
    }

    public double getAcrecimo() {
        this.preco *= 1.10;
        return this.preco;
    }

    public String toString() {
        return preco.toString();
    }
}
class ImovelAntigo extends Imovel {
    public ImovelAntigo() {
        super();
    }

    public ImovelAntigo(String endereco, Double preco) {
        super(endereco, preco);
    }

    public double getDesconto() {
        this.preco *= 0.90;
        return this.preco;
    }

    public String toString() {
        return preco.toString();
    }
}
