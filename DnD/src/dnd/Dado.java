package dnd;

public class Dado {
	public int risultato;

	public Dado() {
		risultato = 0;
	}

	public int lanciaDado(int numfacce) {
		  int faccia = (int) (Math.random()*numfacce+1);
		  risultato = faccia;
		  return risultato;
	}
	
	public void StampaRisultato() {
		System.out.println("Faccia estratta: "+risultato);
	}
}
