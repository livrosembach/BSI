package pbl03B;

public class Main {
    public static void main(String[] args){
        funcionario juliana = new funcionario();
        funcionario joao = new funcionario("Programador");
        funcionario pedro = new funcionario("Pedro","Vendas");
        funcionario sandra = new funcionario("sandra","Advogada");
        funcionario miguel = new funcionario();

        System.out.printf("Juliana recebe %s \n", juliana.salario);
        System.out.printf("João recebe %s \n", joao.salario);
        System.out.printf("Pedro recebe %s \n", pedro.salario);
        System.out.printf("Sandra recebe %s \n", sandra.salario);
        System.out.printf("Miguel recebe %s \n", miguel.salario);
    }
}

class funcionario{
    private String nome;
    private String dt_nasc;
    public double salario;
    private String cargo;
    private String cpf;

    public funcionario(){
        this.salario = 500.00;
    }
    public funcionario(String cargo){
        this.cargo = cargo;
        this.salario = 2000.00;
    }
    public funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 4000.00;
    }
}
