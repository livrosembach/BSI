import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class pbl08 {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        banco.criarConta(123, "senha123", 1000.0);
        banco.criarConta(456, "senha456", 500.0);

        tentarSaque(banco, 123, "senha123", 100.0); // Saque realizado com sucesso
        tentarSaque(banco, 123, "senha123", 1000.0); // Saldo insuficiente
        tentarSaque(banco, 456, "senhaErrada", 100.0); // Senha inválida
        tentarSaque(banco, 789, "senha789", 100.0); // Conta não encontrada
        tentarSaque(banco, 123, "senha123", 50.0); // Horário inválido
        tentarSaque(banco, 123, "senha123", 200.0); // Saque realizado com sucesso
        tentarSaque(banco, 456, "senha456", 600.0); // Saldo insuficiente
        tentarSaque(banco, 123, "senhaErrada", 50.0); // Senha inválida
        tentarSaque(banco, 456, "senha456", 100.0); // Saque realizado com sucesso
        tentarSaque(banco, 789, "senha123", 50.0); // Conta não encontrada

    }
    public static void tentarSaque( Banco banco, int numero, String senha, double valor){
        try{
            banco.sacar(numero,senha, valor);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

abstract class ExcecaoSeguranca extends Exception{

}

class ExcecaoSaldoInsuficiente extends Exception{
    @Override
    public String toString(){
        return "Seu saldo é insuficiente";
    }
}

abstract class ExcecaoAutenticacao extends ExcecaoSeguranca{

}

class ExcecaoHorarioInvalido extends ExcecaoSeguranca{
    @Override
    public String toString(){
        return "Saques não podem ser feitos antes das 8:00 e depois das 22:00";
    }
}

class ExcecaoContaInvalida extends ExcecaoAutenticacao{
    @Override
    public String toString(){
        return "Conta não encontrada";
    }
}

class ExcecaoSenhaInvalida extends ExcecaoAutenticacao{
    @Override
    public String toString(){
        return "Senha Inválida";
    }
}

class Banco{
    private String nome;
    ArrayList<ContaCorrente> contasCorrentes = new ArrayList<ContaCorrente>();
    
    public Banco(String nome){
        this.nome = nome;
    }

    public void criarConta(int numero, String senha, double saldo){
        contasCorrentes.add(new ContaCorrente(numero,senha,saldo));
    }

    public void sacar(int numero, String senha, double valor) throws ExcecaoContaInvalida, ExcecaoSenhaInvalida, ExcecaoHorarioInvalido, ExcecaoSaldoInsuficiente{
        LocalDateTime agora = LocalDateTime.now();
        LocalTime horaAtual = agora.toLocalTime();

        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fim = LocalTime.of(22, 0);

        if (horaAtual.isBefore(inicio) && horaAtual.isAfter(fim)) {
            throw new ExcecaoHorarioInvalido();
        }

        boolean contaAchada = false;
        for(ContaCorrente conta: this.contasCorrentes){
            if(numero == conta.getNumero() ){
                contaAchada = true;
                conta.retirar(valor, senha);
            }
        }
        if (!contaAchada){
            throw new ExcecaoContaInvalida();
        }
    }
    
}

class ContaCorrente{
    private final int numero;
    private String senha;
    private double saldo;

    public ContaCorrente(int numero, String senha, double saldo){
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void retirar(double valor, String senha) throws ExcecaoSenhaInvalida , ExcecaoSaldoInsuficiente{
        if(!Objects.equals(this.senha, senha)){
            throw new ExcecaoSenhaInvalida();
        }
        if(this.saldo < valor){
            throw new ExcecaoSaldoInsuficiente();
        }
        this.saldo -= valor;
        System.out.printf("Saque de %s realizado com sucesso %n", valor);
    }

    public int getNumero() {
        return numero;
    }
}


