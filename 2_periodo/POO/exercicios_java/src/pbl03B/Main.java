package pbl03B;

public class Main {
    public static void main(String[] args){
        funcionario juliana = new funcionario("Juliana");
        funcionario joao = new funcionario("João","Medico");
        funcionario pedro = new funcionario("Pedro","Vendas","111");
        funcionario sandra = new funcionario("Sandra","Advogada", "222");
        funcionario miguel = new funcionario("Miguel");

        juliana.imprimir();
        joao.imprimir();
        pedro.imprimir();
        sandra.imprimir();
        miguel.imprimir();
    }
}

class funcionario{
    private String nome;
    private String dt_nasc;
    public double salario;
    private String cargo;
    private String cpf;

    public funcionario(String nome){
        this.salario = 500.00;
        this.dt_nasc = "22/05/2004";
        this.nome = nome;
        this.cargo = "programador";
        this.cpf = "000";

    }
    public funcionario(String nome, String cargo){
        this.cargo = cargo;
        this.salario = 2000.00;
        this.dt_nasc = "22/05/2004";
        this.cpf = "000";
        this.nome = nome;
    }
    public funcionario(String nome, String cargo, String cpf){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.salario = 4000.00;
        this.dt_nasc = "22/05/2004";
    }

    public void imprimir() {
        System.out.printf("Nome: %s Salário: %f Data de Nascimento: %s Cargo: %s CPF: %s \n", this.nome, this.salario, this.dt_nasc, this.cargo,this.cpf);
    }
}
