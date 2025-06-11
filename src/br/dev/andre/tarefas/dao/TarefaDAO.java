package br.dev.andre.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.andre.tarefas.factory.*;
import br.dev.andre.tarefas.model.Tarefa;


public class TarefaDAO {
}

	private Tarefa tarefa;
	private ArquivoTarefaFactory aff = new ArquivoTarefaFactory();

	public TarefaDAO(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public boolean gravar() {
		try {
			BufferedWriter bw = aff.getBw();
			bw.write(tarefa.toString());
			bw.flush();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;

		}

	}

	public List<Tarefa> getTarefas() {

		List<Tarefa> tarefas = new ArrayList<Tarefa>();

		try {
			BufferedReader br = aff.getBr();
			String linha = "";
			while (linha != null) {
				linha = br.readLine();
				if (linha != null) {
					String[] tarefaVetor = linha.split(",");
					Tarefa tarefa = new Tarefa("");
					tarefa.setDescricao(tarefaVetor[0]);
					tarefa.setNome(tarefaVetor[1]);
					tarefa.setResponsavel(tarefaVetor[2]);
					tarefa.setStatus(tarefaVetor[3]);
					tarefa.setPrazo(Integer.parseInt(tarefaVetor[4]));
					tarefa.setDataInicio(Double.parseDouble(tarefaVetor[5]));
					tarefa.setDataEntrega(Double.parseDouble(tarefaVetor[6]));
					tarefas.add(tarefa);

				}
			}

			return tarefas;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
p
