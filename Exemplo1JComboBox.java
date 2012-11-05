package Exemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exemplo1JComboBox extends JFrame {
	JTextField txtNome;
	JTextField txtCpf;
	JTextField txtEndereco;
	JComboBox cmbEstadoCivil;
	public Exemplo1JComboBox() {
		super.setTitle("Formulário para cadastro de Pessoa");
	}

	public void init() {
		JPanel painel = new JPanel();
		// Definir o conteúdo que será adicionado ao JFrame
		setLayout(new FlowLayout(FlowLayout.LEFT));
		GridLayout layout = new GridLayout(5, 2, 10, 10);
		painel.setLayout(layout);
		JLabel lblCpf = new JLabel("Informe Cpf:");
		txtCpf = new JTextField(15);
		painel.add(lblCpf);
		painel.add(txtCpf);
		JLabel lblNome = new JLabel("Informe Nome:");
		txtNome = new JTextField(15);
		painel.add(lblNome);
		painel.add(txtNome);
		JLabel lblEndereco = new JLabel("Informe Endereço:");
		txtEndereco = new JTextField(15);
		painel.add(lblEndereco);
		painel.add(txtEndereco);
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		painel.add(lblEstadoCivil);
		// Vetor de String para alimentar o campo ComboBox
		String[] opcoes = new String[] { "Solteiro", "Casado", "Separado",
				"Desquitado", "Viuvo" };
		cmbEstadoCivil = new JComboBox(opcoes);
		painel.add(cmbEstadoCivil);
		JButton btnCadastro = new JButton("Enviar Dados");
		painel.add(btnCadastro);
		super.add(painel);// Adiciono o panel ao JFrame
		btnCadastro.addActionListener (new ImprimeDados());
	}// FIM init ()
	   private class ImprimeDados implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Nome: "+ txtNome.getText()+"\nCPF: "+txtCpf.getText()+"\nEndereço: "
										+txtEndereco.getText() +"\nEstado Civil: "+ cmbEstadoCivil.getSelectedItem()); 
			
			
		}
		   
	   }

	public static void main(String[] args) {
		Exemplo1JComboBox tela = new Exemplo1JComboBox();
		tela.init(); // Inicializa a criação do JFrame
		tela.setSize(400, 250); // Define Largura e Altura
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true); // Exibir o JFrame
	}
}