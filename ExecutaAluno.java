

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExecutaAluno extends JFrame {

    private JTextField txtCurso;
    private JTextField txtDisciplina;
    private JTextField txtAluno;
    private JTextField txtNota1;
    private JTextField txtNota2;

    public ExecutaAluno() {
        super.setTitle("Calcula Media do Aluno");
    }

    public void init() {
        JPanel painel = new JPanel();
//Definir o conteúdo que será adicionado ao JFrame
        setLayout(new FlowLayout(FlowLayout.LEFT));
        GridLayout layout = new GridLayout(6, 2, 10, 10);
        painel.setLayout(layout);
        JLabel lblCurso = new JLabel("Nome do Curso:");
        txtCurso = new JTextField(15);
        painel.add(lblCurso);
        painel.add(txtCurso);
        JLabel lblDisciplina = new JLabel("Nome da Disciplina:");
        txtDisciplina = new JTextField(15);
        painel.add(lblDisciplina);
        painel.add(txtDisciplina);
        JLabel lblAluno = new JLabel("Nome do Aluno:");
        txtAluno = new JTextField(15);
        painel.add(lblAluno);
        painel.add(txtAluno);
        JLabel lblNota1 = new JLabel("Primeira Nota:");
        txtNota1 = new JTextField(15);
        painel.add(lblNota1);
        painel.add(txtNota1);
        JLabel lblNota2 = new JLabel("Segunda Nota:");
        txtNota2 = new JTextField(15);
        painel.add(lblNota2);
        painel.add(txtNota2);

        JButton btnCadastro = new JButton("Calcula Media");
        painel.add(btnCadastro);
        btnCadastro.addActionListener(new ImprimeDados());
        super.add(painel);//Adiciono o panel ao JFrame
    }

    public class ImprimeDados implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Aluno x = new Aluno(txtCurso.getText(), txtDisciplina.getText(), txtAluno.getText(),
                    Float.parseFloat(txtNota1.getText()), Float.parseFloat(txtNota2.getText()));
            float media = (x.getNota1()+ x.getNota2())/2;
            JOptionPane.showMessageDialog(null, "Media Calculada " + media);

        }
    }
    public static void main(String[] args) {
        ExecutaAluno tela = new ExecutaAluno();
        tela.init(); //Inicializa a criação do JFrame
        tela.setSize(400, 250); //Define Largura e Altura
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true); //Exibir o JFrame
    }
}