package dnd;

public class Armatura {
	public String nome;
	public int CA;
	
	public Armatura() {
		TipoArmatura();
	}
	
	public void TipoArmatura() {
		CA = (int) (Math.random()*8+1);
		switch(CA) {
		case 1:
			System.out.println("Armatura: Leggera\t\tTipo: Imbottita");
			break;
		case 2:
			System.out.println("Armatura: Leggera\t\tTipo: Cuoio");
			break;
		case 3:
			System.out.println("Armatura: Media\t\tTipo: Pelle");
			break;
		case 4:
			System.out.println("Armatura: Media\t\tTipo: Scaglie");
			break;
		case 5:
			System.out.println("Armatura: Media\t\tTipo: Pettorale");
			break;
		case 6:
			System.out.println("Armatura: Pesante\t\tTipo: Anelli");
			break;
		case 7:
			System.out.println("Armatura: Pesante\t\tTipo: Piastre");
			break;
		case 8:
			System.out.println("Armatura: Completa\t\tTipo: Scudo");
			break;
		}
	}
}
