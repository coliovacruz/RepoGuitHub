
// Representação de uma classe com atributos e métodos 
public class ContaCorrente {
private int conta;
int agencia;
double saldo;
static double cpmf; // atributo estático 
String nome;
public ContaCorrente (int i){
	double valor = 0;
	this.saldo = valor;
}
public String getNome() {
    return this.nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
void efetuarSaque(double valor) {
    this.saldo = this.saldo - valor;
}
void efetuarDeposito(double valor) {
    this.saldo = this.saldo + valor;
}
void imprimirSaldo() {
    System.out.println(this.saldo);
}
public int getAgencia() {
    return this.agencia;
}
public void setAgencia(int agencia) {
    this.agencia = agencia;
}
public int getConta() {
    return this.conta;
}
public void setConta(int conta) {
    this.conta = conta;
}
public double getCpmf() {
    return cpmf;
}
public void setCpmf(double cpmf) {
    ContaCorrente.cpmf = cpmf;
}
public double getSaldo() {
    return this.saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
} // Nenhuma linha de código poderá ser definida abaixo deste símbolo de fecha chaves