package view;

import javax.swing.JOptionPane;
import controller.ImpressoraController;
import edu.fatec.Fila;
public class Principal {

	public static void main(String[] args) {
		Fila impressora = new Fila();
		ImpressoraController impCont = new ImpressoraController();
		int input = 0;
		while (input != 9) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções \n1 - Adicionar documento \n2 - Realizar Impressão \n9 - Sair"));
			
			if (input == 1) {
				String documento = JOptionPane.showInputDialog("Digite  o documento valido");
				try {
					if (documento.contains(".ID_PC")){
						impCont.insereDocumento(impressora, documento);
					} else {
						System.out.println("Documento invalido");
					}
					
				} catch (Exception e) {

				}
				
			}
			
			if (input == 2) {
				try {
					impCont.imprime(impressora);
				} catch (Exception e) {

				}
				
			}
				
			if (input == 9) {
				System.out.println("Adeus!!!");
			}
			
			if ((input != 1) && (input != 2) && (input != 9)) {
				System.out.println("Operação não é valida!!!");
			}
		}
		
	}

}
