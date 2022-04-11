package Banco;

import pessoa.Pessoa;

public class Conta_Bancaria extends Pessoa{
	private double saldo;

	public Conta_Bancaria(String name, String sexo, int idade, double saldo) {
		super(name, sexo, idade);
	
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	public void levantamento(double valor) {
		if (valor>this.getSaldo()) {
			System.out.print("Saldo insuficiente");
		}else if(valor<=0) {
			System.out.print("Valor invalido");
		}else {
			this.setSaldo(this.getSaldo()-valor);	
		}
	}
	public void Transferencia(double valor, Conta_Bancaria destino) {
		this.setSaldo(this.getSaldo()-valor );
		destino.saldo+=valor;
	}

	@Override
	public String toString() {
		return "Conta_Bancaria [saldo=" + saldo + ", Name()=" + getName() + ", Sexo()=" + getSexo()
				+ ", Idade()=" + getIdade() + "]";
	}
	
}
