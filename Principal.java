
public class Principal {
public static void main(String args[]) {
	ContaCorrente objeto1 = new ContaCorrente(0);
	objeto1.efetuarDeposito(41.80);
	ContaCorrente objeto2 = new ContaCorrente();
	objeto2.efetuarDeposito(131.10);
	ContaCorrente objeto3 = new ContaCorrente();
	objeto3.imprimirSaldo();
}
}