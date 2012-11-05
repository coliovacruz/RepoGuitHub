import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exemplo2BorderLayout extends JFrame {
	JPanel painel1, painel2, painel3, painel4, painel5;
	JLabel msg1, msg2, msg3, msg4, msg5;
	JButton botao1;

	public Exemplo2BorderLayout() {
		super("Exemplo JFrame JLabel");
	}

	public void criaJanela() {
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();
		painel5 = new JPanel();
		botao1 = new JButton("teste");
		msg1 = new JLabel("Testando ao Norte!");
		painel1.add(msg1);
		add(painel1, BorderLayout.NORTH);
		msg2 = new JLabel("Testando ao Sul");
		painel2.add(msg2);
		add(painel2, BorderLayout.SOUTH);
		msg3 = new JLabel("Testando ao Leste");
		painel3.add(msg3);
		add(painel3, BorderLayout.EAST);
		msg4 = new JLabel("Testando ao Leste");
		painel4.add(msg4);
		add(painel4, BorderLayout.WEST);
		msg5 = new JLabel("Testando ao Centro");
		painel5.add( botao1);
		painel5.add( msg5);
		add(painel5, BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		Exemplo2BorderLayout ex = new Exemplo2BorderLayout();
		ex.criaJanela();
		ex.setSize(400, 200);
		ex.setVisible(true);
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}