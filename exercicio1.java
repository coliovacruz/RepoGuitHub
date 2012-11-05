
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class exercicio1 extends JFrame {
	private FlowLayout layout;

	public exercicio1() {
		super("Testando Botões FlowLayout");
	}

	public void inicializandoBotoes() {
		layout = new FlowLayout(); // cria o objeto FlowLayout
		layout.setAlignment(FlowLayout.CENTER);
		setLayout(layout); // define o layout do container
	}

	public void adicionandoBotoes(int count) {
		for (int i = 1; i <= count; ++i) {
			add(new JButton("M" + i));
		}
	}

	public static void main(String[] args) {
		exercicio1 j = new exercicio1();
		j.inicializandoBotoes();
		j.adicionandoBotoes(20);
		j.setVisible(true);
		j.setSize(340, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}