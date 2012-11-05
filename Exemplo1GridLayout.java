import javax.swing.*;
import java.awt.*;

public class Exemplo1GridLayout extends JFrame {
	private JButton botao1, botao2, botao3, botao4, botao5;

	public Exemplo1GridLayout() {
		super("Testando Bot�es GridLayout");
	}

	public void GridLayoutTest() {
		setLayout(new GridLayout(3, 2, 10, 10)); // 3 linhas, 2 colunas
		botao1 = new JButton("Bot�o 1");
		botao2 = new JButton("Bot�o 2");
		botao3 = new JButton("Bot�o 3");
		botao4 = new JButton("Bot�o 4");
		botao5 = new JButton("Bot�o 5");
		add(botao1);
		add(botao2);
		add(botao3);
		add(botao4);
		add(botao5);
	}

	public static void main(String args[]) {
		Exemplo1GridLayout grid = new Exemplo1GridLayout();
		grid.GridLayoutTest();
		grid.setVisible(true);
		grid.setSize(300, 200);
		grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
