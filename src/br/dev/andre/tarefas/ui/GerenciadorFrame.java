package br.dev.andre.tarefas.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GerenciadorFrame {
	
	
	private JTextField txtGerenciador;
	private JButton btnFuncionários;
	private JButton btnTarefas;
	
	public GerenciadorFrame(JFrame pai) {
		criarTela(pai);
	}
	
	private void criarTela(JFrame pai) {
		JDialog telaGerenciador = new JDialog(pai, "Cadastro de funcionario", true);
		telaGerenciador.setSize(500, 500);
		telaGerenciador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaGerenciador.setLayout(null);
		telaGerenciador.setResizable(false);
		telaGerenciador.setLocationRelativeTo(null);
		
		Container painel = telaGerenciador.getContentPane();
}
}

