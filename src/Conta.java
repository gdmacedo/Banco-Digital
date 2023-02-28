/*-------------------------------------------------------------------------------------
 * Projeto.....: Banco Digital 
 * Módulo......: Cliente
 * Finalidade..: Retorna dados relativo a conta e seus componentes
 * Data Inicial: 28 de Fevereiro de 2023 - última Alteração: 28 de Fevereiro de 2023
 * Author......: Macedo, Glener Diniz - Analista de Sistemas
 *-----------------------------------------------------------------------------------*/
import java.text.DecimalFormat;


public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private static	String Descr_Agencia = "Av. Paulista, 85.745";
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {

		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	public static String getDescr_Agencia() {
		return Descr_Agencia;
	}

	public interface ArrayList<T> {

	}
	
	public static void setDescr_Agencia(String descr_Agencia) {
		Descr_Agencia = descr_Agencia;
	}

	protected void imprimirInfosComuns() {
		
  
		DecimalFormat df = new DecimalFormat("###,###,###.00");
		
		System.out.println(String.format("Titular.........: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia Código..: %d - Endereço: %s", this.agencia, Conta.getDescr_Agencia()));
		System.out.println(String.format("Numero..........: %d", this.numero));
		System.out.print(String.format("Saldo Atual R($): "));
		System.out.println(df.format(this.saldo));
	}
}
