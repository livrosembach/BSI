package aula05;
import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco b1 = new Banco("Santander");
        b1.adicionarConta(new ContaPoupanca("João","123","12/04/2024"));
        b1.adicionarConta(new ContaCorrente("Maria","234","15/08/2023"));


        while (true){
            System.out.println("Bem-vindo ao Santander\nDigite o número da sua conta:");
            String conta = input.nextLine();
            Conta contaEncontrada = null;
            for(Conta cont : b1.getContas()){
                if(cont.getNumConta().equals(conta)) {
                    contaEncontrada = cont;
                    break;
                }
            }
            if(contaEncontrada == null) {
                System.out.println("Número de conta inválido");
                continue;
            }
                System.out.println("1 - Ver saldo\n2 - Sacar\n3 - Depositar\n4 - Sair");
                int opcao = input.nextInt();
                input.nextLine();
                switch (opcao){
                    case 1:
                            contaEncontrada.verSaldo();
                        break;
                    case 2:
                                System.out.println("Digite o valor que deseja sacar: ");
                                Double valorSacar = input.nextDouble();
                                contaEncontrada.sacar(valorSacar);
                        break;
                    case 3:
                            System.out.println("Digite o valor que deseja depositar: ");
                            Double valorDepositar = input.nextDouble();
                            contaEncontrada.depositar(valorDepositar);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opção inválida");
                }
            }

    }

}

class Banco {
    protected String nome;
    protected ArrayList<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    public ArrayList<Conta> getContas(){
        return this.contas;
    }
}

class Conta{
    protected String nomeTitular;
    protected String numeroConta;
    protected Double saldo;
    protected String dataAbertura;

    public Conta(String nomeTitular, String numeroConta, String dataAbertura){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = 0.0;
    }
    public void sacar(Double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Não tem saldo suficiente");
        }
    }
        public void depositar(Double valor){
            this.saldo += valor;
            System.out.printf("Você depositou %f\n", valor);
    }
    public void verSaldo(){
        System.out.printf("Seu saldo é: %f\n",this.saldo);
    }
    public String getNumConta(){
        return numeroConta;
    }
}

class ContaPoupanca extends Conta{
    protected Double taxaRendimento = 1.1;

    public ContaPoupanca(String nomeTitular, String numeroConta, String dataAbertura) {
        super(nomeTitular, numeroConta, dataAbertura);
    }

    public void debitarRendimento(Double taxaRendimento){
        super.depositar(taxaRendimento);
    }

}

class ContaCorrente extends  Conta{
    protected Double taxaManutencao = 10.0;

    public ContaCorrente(String nomeTitular, String numeroConta, String dataAbertura) {
        super(nomeTitular, numeroConta, dataAbertura);
    }

    public void debitarManutencao() {
        super.sacar(this.taxaManutencao);
    }
    }


