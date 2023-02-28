/*-------------------------------------------------------------------------------------
 * Projeto.....: Banco Digital 
 * Módulo......: Cliente
 * Finalidade..: App main de inicio do projeto 
 * Data Inicial: 28 de Fevereiro de 2023 - última Alteração: 28 de Fevereiro de 2023
 * Author......: Macedo, Glener Diniz - Analista de Sistemas
 *-----------------------------------------------------------------------------------*/

public class Main {

	private static int nConta;

	public static void main(String[] args) {

	
		Cliente cCliente = new Cliente();
		cCliente.setNome("Jose Carlos Silva Soares Neto");
		
		// Abre uma nova conta corrente para o cliente: "Jose Carlos Silva Soares Neto" 
		Conta cc = new ContaCorrente(cCliente);
		cc.depositar(732123.45);  // Realiza um depósito no valo na Conta Corrente
		
		cc.imprimirExtrato();

		// Abre uma nova conta corrente para o cliente: "Maria Antonieta Soares" 
		Conta poupanca = new ContaPoupanca(cCliente);
		cCliente.setNome("Maria Antonieta Soares");
		cc.transferir(30123.05, poupanca); // Transfere para a poupança o valar do corretista acima.

		poupanca.imprimirExtrato();
	}

	public static int getnConta() {
		return nConta;
	}

	public static void setnConta(int nConta) {
		Main.nConta = nConta;
	}

}