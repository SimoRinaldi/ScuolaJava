package dnd;

public class Oggetto{
	public String nome;
	public int costo;
	public int rarit�;
	
	public Oggetto(String n) {
		nome = n;
		costo = (int) (Math.random()*81);
		rarit� = (int) (Math.random()*11);
	}
}
