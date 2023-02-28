/*-------------------------------------------------------------------------------------
 * Projeto.....: Banco Digital 
 * Módulo......: IConta
 * Finalidade..: Retornar 
 * Data Inicial: 28 de Fevereiro de 2023 - última Alteração: 28 de Fevereiro de 2023
 * Author......: Macedo, Glener Diniz - Analista de Sistemas
 *-----------------------------------------------------------------------------------*/

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
