package Modelo;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Alvo {

	private BufferedImage alvo;
	private Point posAlvo;
	private int largAlvo;

	public Alvo(String url) {

		posAlvo = new Point(0, 446);
		largAlvo = 50;
		try {
			alvo =ImageIO.read(getClass().getClassLoader().getResourceAsStream(url));
		} catch (IOException e) {
			System.out.println("erro ao carregar alvo");
		}
	}
	public BufferedImage getAlvo() {
		return alvo;
	}
	public Point getPosAlvo() {
		return posAlvo;
	}
	public int getLargAlvo() {
		return largAlvo;
	}

}
