package pbl03B;

public class Pbl {
    public static void main(String[] args){
        empregado juliana = new empregado("Juliana","22/06/2003","programador","T.I");
        empregado sandra = new empregado("Sandra","15/04/1999","vendedor","vendas");
        empregado pedro = new empregado("Pedro","12/12/1998","advogado","judicial");
        empregado joao = new empregado("João","27/08/1965","médico","saude");
        empregado miguel = new empregado("Miguel", "31/01/2005","advogado","judicial");

        juliana.imprimir();
        sandra.imprimir();
        pedro.imprimir();
        joao.imprimir();
        miguel.imprimir();
    }
}

class empregado{
    private String nome;
    private String dt_nasc;
    private double salario;
    private String cargo;
    private String departamento;

    public empregado(String nome, String dt_nasc, String cargo, String departamento){
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cargo = cargo;
        this.departamento = departamento;
        switch (cargo){
            case "programador":
                this.salario = 5000.0;
                break;
            case "vendedor":
                this.salario = 2000.0;
                break;
            case "advogado":
                this.salario = 4000.0;
                break;
            default:
                this.salario = 500.0;
        }
    }
    public void imprimir() {
        System.out.printf("Nome: %s Salario: %f Data de Nascimento: %s Cargo: %s Departamento: %s \n", this.nome, this.salario, this.dt_nasc, this.cargo,this.departamento);
    }
}
