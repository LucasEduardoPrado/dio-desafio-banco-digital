public class Main {

	public static void main(String[] args) {
		Cliente Patricia = new Cliente();
		Patricia.setNome("Patricia");
		
		Conta cc = new ContaCorrente(Patricia);

		cc.depositar(1000);
		cc.sacar(500);
		
		cc.imprimirExtrato();

		Cliente Lucas = new Cliente();
		Lucas.setNome("Lucas");

		Conta universitaria = new ContaUniversitaria(Lucas);
		Conta poupanca = new ContaPoupanca(Lucas);

		universitaria.depositar(1000);
		universitaria.transferir(350, poupanca);

		universitaria.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}