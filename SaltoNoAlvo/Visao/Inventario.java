package Visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Inventario extends JPanel {

	private static final long serialVersionUID = 1L;

	private  JLabel pontuacao,tentativas,jogador,nivel,fundo;
	private static ArrayList<String> perguntas;
	private static ArrayList<String> respostas;
	private Font jokerman;

	public Inventario(int largura,int altura) {

		setPreferredSize(new Dimension(largura, altura));
		setLayout(null);
		jokerman =new Font("Jokerman",Font.BOLD, 20);

		
		respostas= new ArrayList<String>();
		perguntas= new ArrayList<String>();
		
		pontuacao = new JLabel("0");
		pontuacao.setForeground(Color.WHITE);
		pontuacao.setFont(jokerman);
		pontuacao.setBounds(585, 51, 46, 19);
		add(pontuacao);

		tentativas = new JLabel("10");
		tentativas.setForeground(Color.WHITE);
		tentativas.setFont(jokerman);
		tentativas.setBounds(436, 46, 52, 26);
		add(tentativas);

		jogador = new JLabel("Andre");
		jogador.setForeground(Color.WHITE);
		jogador.setFont(jokerman);
		jogador.setBounds(135, 34, 169, 39);
		add(jogador);
		
		nivel = new JLabel("1");
		nivel.setForeground(Color.WHITE);
		nivel.setFont(jokerman);
		nivel.setBounds(730, 51, 46, 19);
		add(nivel);

		fundo = new JLabel(new ImageIcon(getClass().getResource("/inventario.png")));
		fundo.setBounds(0, 0, 849, 86);
		add(fundo);
		
		
		
		FecharVisible();

		AdicionarPerguntas();
	}
	public void AdicionarPerguntas() {

		int i=0;
		int resultado=0;
		Random	rnd = new Random();

		while(i<50) {
			int a=rnd.nextInt(10), b=rnd.nextInt(10);
			resultado=a*b;
			String op = new String(a+" x "+b);
			perguntas.add(op);
			AdicionarRespontas(resultado);

			int c=rnd.nextInt(10), d=rnd.nextInt(10);
			if(c!=0 && d!=0 && c%d==0) {
				resultado=c/d;
				String opc = new String(c+" / "+d);
				perguntas.add(opc);
				AdicionarRespontas(resultado);
			}
			
			int e=rnd.nextInt(10), f=rnd.nextInt(10);
				resultado=e+f;
				String opca = new String(e+" + "+f);
				perguntas.add(opca);
				AdicionarRespontas(resultado);
				
				int g=rnd.nextInt(10), h=rnd.nextInt(10);
				resultado=g-h;
				String opcao = new String(g+" - "+h);
				if(g>h) {
					perguntas.add(opcao);
					AdicionarRespontas(resultado);
				}
				i++;
			}
		}
		public static void AdicionarRespontas(int a) {
			String b =Integer.toString(a);
			respostas.add(b);
		}

		public static ArrayList<String> getPerguntas() {
			return perguntas;
		}
		public static ArrayList<String> getRespostas() {
			return respostas;
		}
		public void FecharVisible() { setVisible(false);	}

		public void AbriVisible() { setVisible(true);	}

		public  String getTxtPontuacao() { return pontuacao.getText();}

		public String getTxtTentativas() {return tentativas.getText();}

		public String getTxtJogador() { return jogador.getText(); }

		public JLabel getPontuacao() { return pontuacao;}

		public JLabel getTentativas() {return tentativas;}

		public JLabel getJogador() { return jogador; }
		
		public JLabel getNivel() {	return nivel;	}
		
}	