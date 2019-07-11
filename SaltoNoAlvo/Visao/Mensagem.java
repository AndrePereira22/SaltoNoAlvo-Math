package Visao;

import java.awt.IllegalComponentStateException;

import javax.swing.JOptionPane;

public abstract class Mensagem {

	public static void exibirMensagem(String msg){
		try {
		JOptionPane.showMessageDialog(null,msg);
		
		}catch(IllegalComponentStateException ex) {}
	}
}
