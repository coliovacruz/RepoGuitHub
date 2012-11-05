package programas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Exemplo1JFrame extends JFrame{
private JPanel painel;
private JLabel msg;
public Exemplo1JFrame(){
super("Exemplo JFrame JLabel");
}
public void criarFrame(){
painel = new JPanel();
msg = new JLabel("Iniciando Java Swing!");
painel.add(msg);
add(painel);
}
public static void main(String args[]){
	Exemplo1JFrame ex = new Exemplo1JFrame();
		ex.criarFrame();
		ex.setSize(300,200);
		ex.setVisible(true);
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}