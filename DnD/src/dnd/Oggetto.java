package dnd;

public class Oggetto{
	public String nome;
	public int costo;
	public int rarità;
	
	public Oggetto(String n) {
		nome = n;
		costo = (int) (Math.random()*81);
		rarità = (int) (Math.random()*11);
	}
}
