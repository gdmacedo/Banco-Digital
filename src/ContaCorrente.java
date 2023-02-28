/*-------------------------------------------------------------------------------------
 * Projeto.....: Banco Digital 
 * Módulo......: Conta Corrente
 * Finalidade..: Retornar a impressão do extrato relativo a conta corrente
 * Data Inicial: 28 de Fevereiro de 2023 - última Alteração: 28 de Fevereiro de 2023
 * Author......: Macedo, Glener Diniz - Analista de Sistemas
 *-----------------------------------------------------------------------------------*/

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n─────────────────[Extrato Conta Corrente]──────────────────────");
		super.imprimirInfosComuns();
	}
	
}
