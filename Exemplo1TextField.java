import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Exemplo1TextField extends JFrame {
	private JPanel painel;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JLabel lblIdentidade;
	private JLabel lblCPF;
	private JLabel lblSalario;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtIdentidade;
	private JTextField txtCPF;
	private JTextField txtSalario;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JButton btnCadastro;
	private GridLayout gridLayout;

	public Exemplo1TextField() {
		super.setTitle("Formulário para cadastro de Pessoa");
	}

	public void init() {
		painel = new JPanel();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		gridLayout = new GridLayout(11, 2, 10, 10);
		painel.setLayout(gridLayout);
		lblNome = new JLabel("Informe Nome:");
		txtNome = new JTextField(15);
		painel.add(lblNome);
		painel.add(txtNome);
		lblEndereco = new JLabel("Informe Endereço:");
		txtEndereco = new JTextField(15);
		painel.add(lblEndereco);
		painel.add(txtEndereco);

		lblBairro = new JLabel("Informe Bairro:");
		txtBairro = new JTextField(15);
		painel.add(lblBairro);
		painel.add(txtBairro);

		lblCidade = new JLabel("Informe Cidade:");
		txtCidade = new JTextField(15);
		painel.add(lblCidade);
		painel.add(txtCidade);

		lblEstado = new JLabel("Informe Estado:");
		txtEstado = new JTextField(15);
		painel.add(lblEstado);
		painel.add(txtEstado);

		lblIdentidade = new JLabel("Informe Identidade:");
		txtIdentidade = new JTextField(15);
		painel.add(lblIdentidade);
		painel.add(txtIdentidade);

		lblCPF = new JLabel("Informe CPF:");
		txtCPF = new JTextField(15);
		painel.add(lblCPF);
		painel.add(txtCPF);

		lblSalario = new JLabel("Informe Salário:");
		txtSalario = new JTextField(15);
		painel.add(lblSalario);
		painel.add(txtSalario);

		lblPeso = new JLabel("Informe Peso:");
		txtPeso = new JTextField(15);
		painel.add(lblPeso);
		painel.add(txtPeso);

		lblAltura = new JLabel("Informe Altura:");
		txtAltura = new JTextField(15);
		painel.add(lblAltura);
		painel.add(txtAltura);

		btnCadastro = new JButton("IMPRIME DADOS");
		painel.add(btnCadastro);
		
		super.add(painel);// Adiciono o painel ao JFrame
		btnCadastro.addActionListener (new ImprimeDados());
	}
	
	 private class ImprimeDados implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Nome: "+ txtNome.getText()+"\nCPF: "+txtCPF.getText()+"\nEndereço: "
											+txtEndereco.getText()+"\nBairro: "+txtBairro.getText()+"\nCidade: "+txtCidade.getText()
											+"\nEstado: "+txtEstado.getText()+"\nIdentidade: "+txtIdentidade.getText()+
											"\nSalario: "+txtSalario.getText()+"\nPeso: "+txtPeso.getText()+
											"\nAltura: "+txtAltura.getText());
			}
	 }

	public static void main(String[] args) {
		Exemplo1TextField tela = new Exemplo1TextField();
		tela.init(); // Inicializa a criação do JFrame
		tela.setSize(400, 700); // Define Largura e Altura
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true); // Exibir o JFrame
	}
}
	 
