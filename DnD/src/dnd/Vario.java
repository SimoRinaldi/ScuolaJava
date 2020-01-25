package dnd;

public class Vario extends Oggetto {
	private String n;
	
	public Vario() {
		super("Elemento");
		// TODO Auto-generated constructor stub
		int y = (int) (Math.random()*4+1);
		switch (y) {
		case 1: n = "bastone"; break;
		case 2: n = "mappa"; break;
		case 3: n = "corna di cervo"; break;
		default: n = "sasso"; break;
		}
	}
}
