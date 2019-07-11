package Visao;

import java.io.IOException;
import Modelo.Alvo;
import Modelo.Cenario;
import Modelo.Jogo;
import Modelo.Picterodatilo;
import Modelo.Sprite;

public class Fase2  extends Jogo  {

	private static final long serialVersionUID = 1L;

	private Cenario mapa1,mapa2;
	private Sprite caverna;
	private Alvo alvo;
	private Picterodatilo picterodatilo;
	
	public Fase2(int largura,int altura) {
		super(largura,altura);
		Load();
		FecharVisible();		
	}
	public void Load() {
		mapa1= new Cenario("tileset.png","camada3.txt");
		mapa2= new Cenario("tileset.png","camada4.txt");

		mapa1.montarMapa();
		mapa2.montarMapa();
		try {
			caverna = new Sprite("sprite.png",2,3,1,170,170);
		
	} catch (IOException e) {
		System.out.println("a imagem caverna fase2");
	}
		picterodatilo = new Picterodatilo("aviao2.png");
		alvo = new Alvo("alvo2.png");		
	}
	public void Update() {
		mapa1.montarMapa();	
	}
	public void Render() {		
		g.drawImage(mapa1.getMapa(),0, 0, null);
		g.drawImage(mapa2.getMapa(),0, 0, null);
		
		g.drawImage(picterodatilo.getImgPterodatilo(), picterodatilo.getPosPtero().x, 
				picterodatilo.getPosPtero().y, null);
		
		g.drawImage(alvo.getAlvo(), alvo.getPosAlvo().x, alvo.getPosAlvo().y-2, null);
			
		g.drawImage(caverna.sprites[caverna.aparencia],(int) caverna.posJogador.x -17,
                (int) caverna.posJogador.y-44 , null);
	}  
	public Sprite getCaverna() {
		return caverna;
	}
	public Picterodatilo getPicterodatilo() {
		return picterodatilo;
	}
	public Alvo getAlvo() {
		return alvo;
	}
	public Picterodatilo getAviao() {
		return picterodatilo;
	}
	public Cenario getMapa1() {
		return mapa1;
	}
	public Cenario getMapa2() {
		return mapa2;
	}
	public void FecharVisible() {
		setVisible(false);	
	}
	public void AbriVisible() {
		setVisible(true);	
	}
}


