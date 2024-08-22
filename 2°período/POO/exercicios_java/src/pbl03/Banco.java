package pbl03;

class Cliente{
    private final String nome;
    private double saldoContaCorrente;

    public Cliente(String nome, double saldoContaCorrente){
        this.nome = nome;
        this.saldoContaCorrente = saldoContaCorrente;
    }
    public void depositar(double valor){
        saldoContaCorrente += valor;
    }
    public void retirar(double valor){
        if(saldoContaCorrente >= valor){
            saldoContaCorrente -= valor;
        }
        else{
            System.out.println("Você não tem saldo o suficiente! \n");
        }
    }
    public void imprimir(){
        System.out.printf("Nome: %s Saldo: %s \n", this.nome,this.saldoContaCorrente);
    }
}
public class Banco{
    public static void main(String[] args){
        Cliente jandira = new Cliente("Jandira Silva",2500.00);
        Cliente sandra = new Cliente("Sandra Rodrigues", 1800.00);
        Cliente luciana = new Cliente("Luciana Teixera",5000.00);

        jandira.imprimir();
        sandra.imprimir();
        luciana.imprimir();

        jandira.retirar(1000.00);
        jandira.imprimir();

        sandra.retirar(2000.00);
        sandra.depositar(500.00);
        sandra.imprimir();
        sandra.retirar(2000.00);
        sandra.imprimir();

        luciana.depositar(1000.00);
        luciana.imprimir();
    }
}
