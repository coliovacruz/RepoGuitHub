import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exemplo1BorderLayout extends JFrame {
	private JButton botao1, botao2, botao3, botao4, botao5;

	public Exemplo1BorderLayout() {
		super("Testando Bot�es BorderLayout");
	}

	public void BorderLayoutTest() {
		botao1 = new JButton("Bot�o Norte");
		botao2 = new JButton("Bot�o Centro");
		botao3 = new JButton("Bot�o Oeste");
		botao4 = new JButton("Bot�o Sul");
		botao5 = new JButton("Bot�o Leste");
		add(botao1, BorderLayout.NORTH);
		add(botao2, BorderLayout.CENTER);
		add(botao3, BorderLayout.WEST);
		add(botao4, BorderLayout.SOUTH);
		add(botao5, BorderLayout.EAST);
	}

	public static void main(String args[]) {
		Exemplo1BorderLayout border = new Exemplo1BorderLayout();
		border.BorderLayoutTest();
		border.setSize(400, 200);
		border.setVisible(true);
		border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}