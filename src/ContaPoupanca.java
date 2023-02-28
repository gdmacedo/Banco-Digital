/*-------------------------------------------------------------------------------------
 * Projeto.....: Banco Digital 
 * Módulo......: Conta Poupança
 * Finalidade..: Retornar  a impressão do extrato relativo a conta poupança
 * Data Inicial: 28 de Fevereiro de 2023 - última Alteração: 28 de Fevereiro de 2023
 * Author......: Macedo, Glener Diniz - Analista de Sistemas
 *-----------------------------------------------------------------------------------*/

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n─────────────────[Extrato Conta Poupança]──────────────────────");
		super.imprimirInfosComuns();
	}
}
