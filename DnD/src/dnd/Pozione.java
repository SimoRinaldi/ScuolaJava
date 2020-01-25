package dnd;

public class Pozione extends Oggetto {
	public int portata;
	public int effettoCura;
	public String tipo;
	
	public Pozione() {
		super("Pozione");
		effettoCura = (int) (Math.random()*50+1);
		portata = (int) (Math.random()*50+1);
		int x = (int) (Math.random()*4+1);
		switch (x) {
		case 1: tipo = "mana"; break;
		case 2: tipo = "fungo magico"; break;
		case 3: tipo = "birra"; break;
		default: tipo = "jager"; break;
		}
	}
	
}
