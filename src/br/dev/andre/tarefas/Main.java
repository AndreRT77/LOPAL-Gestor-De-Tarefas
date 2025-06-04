package br.dev.andre.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

import br.dev.andre.tarefas.dao.FuncionarioDAO;
import br.dev.andre.tarefas.model.Funcionario;
import br.dev.andre.tarefas.model.Status;
import br.dev.andre.tarefas.model.Tarefa;
import br.dev.andre.tarefas.ui.FuncionarioFrame;
import br.dev.andre.tarefas.ui.FuncionarioListaFrame;
import br.dev.andre.tarefas.utils.Utils;

public class Main {

	public static void main(String[] args) {
		
		FuncionarioDAO dao = new FuncionarioDAO(null);
		dao.getFuncionarios();
//		new FuncionarioListaFrame();
//		new FuncionarioFrame();
		
//		Funcionario funcionario = new Funcionario("Ana Maria Braga", "programador");
//		funcionario.setSetor("Tecnologia da Informação");
//		funcionario.setSalario(8000.00);
//
//		FuncionarioDAO dao = new FuncionarioDAO(funcionario);
//		dao.gravar();
	}

	private static void testarLeituraEscritaArquivo() {
		String so = System.getProperty("osß.name");
		System.out.println(so);
		
		String caminho = "/Users/25132696/projetoTarefas/Tarefas";
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			bw.append("Penso logo desisto, mó preguiça\n");
			bw.flush();
			
			while(linha !=null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (FileNotFoundException erro) {
			System.out.println("Erro!Arquivo não encontrado");
		} catch (IOException erro) {
			System.out.println("O arquivo está protegido para leitura");
		} catch (Exception erro) {
			System.out.println(erro.getMessage());

		}
	}

}
