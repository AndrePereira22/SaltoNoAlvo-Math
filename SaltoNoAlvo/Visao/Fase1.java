package Visao;

import java.io.IOException;
import Modelo.Alvo;
import Modelo.Jogo;
import Modelo.Cenario;
import Modelo.Picterodatilo;
import Modelo.Sprite;

public class Fase1  extends Jogo  {

	private static final long serialVersionUID = 1L;
	private Cenario mapa1,mapa2;
	private Sprite caverna;
	private Alvo alvo;
	private Picterodatilo picterodatilo;
	
	public Fase1(int largura,int altura) {
		super(largura,altura);
		Load();
		FecharVisible();		
	}
	public void Load() {
		mapa1= new Cenario("tileset.png","camada1.txt");
		mapa2= new Cenario("tileset.png","camada2.txt");

		mapa1.montarMapa();
		mapa2.montarMapa();
		try {
			caverna = new Sprite("sprite.png",2,3,1,170,170);
		
	} catch (IOException e) {
	System.out.println("Imagem caverna fase1");
	}
		picterodatilo = new Picterodatilo("aviao1.png");
		alvo = new Alvo("alvo1.png");	
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
			
		g.drawImage(caverna.sprites[caverna.aparencia],(int) caverna.posJogador.x +26,
                (int) caverna.posJogador.y-38 , null);		
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
	public void setMapa1(Cenario mapa1) {
		this.mapa1 = mapa1;
	}
	public void setMapa2(Cenario mapa2) {
		this.mapa2 = mapa2;
	}
	public void setCaverna(Sprite caverna) {
		this.caverna = caverna;
	}
	public void setAlvo(Alvo alvo) {
		this.alvo = alvo;
	}
	public void setPicterodatilo(Picterodatilo picterodatilo) {
		this.picterodatilo = picterodatilo;
	}
	public void FecharVisible() {
		setVisible(false);
	}
	public void AbriVisible() {
		setVisible(true);	
	}
}

