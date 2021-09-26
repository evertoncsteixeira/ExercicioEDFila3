package controller;

import edu.fatec.Fila;

public class ImpressoraController {
	public void insereDocumento(Fila f, String Documento) {
		f.adicionarFila(Documento);
	}

	public void imprime(Fila f) throws Exception {
		Thread t = new Thread();
		while (!f.isEmpty()) {
			System.out.println("[#PC: ID_PC– Arquivo: " + f.removerFila());
			int numAleatorio = (int) (Math.random() * 2000) + 1000;
			t.sleep(numAleatorio);
		}
	}

}
