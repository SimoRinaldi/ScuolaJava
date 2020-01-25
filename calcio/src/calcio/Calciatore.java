package calcio;
	

public class Calciatore {
		public String nome;
		public String squadra;
		public int abilità;
		public int forza;
		public int goal;
		public boolean IsPalloneOro;
		
		public Calciatore(String n,String s,int a,int f,int g) {
			nome = n;
			squadra = s;
			abilità = a;
			forza = f;
			goal = g;
			IsPalloneOro = false;
		}
		
		public void Tira() {
			int r = (int) (Math.random()*500+1);
			if (r < forza*abilità) {
				goal += 1;
			}
			if (goal > 100) {
				IsPalloneOro = true;
			}
		}
		
		public void giocaPartita() {
			for (int i = 0; i < 5; i++) {
				Tira();
			}
		}
		
		public void aumentAbilità() {
			abilità += 1;
		}
		
		public void cambiaSquadra(String s1) {
			squadra = s1;
			System.out.println("Nuova squadra: "+squadra);
		}
		
		public static void main(String[] args) {
			Calciatore c1 = new Calciatore("Simone","Breno", 50, 70, 90);
			int partite = 0,Goal = 101;
			System.out.println("Nome giocatore: "+c1.nome);
			System.out.println("Squadra attuale: "+c1.squadra);
			System.out.println("Abilità: "+c1.abilità);
			System.out.println("Forza: "+c1.forza);
			System.out.println("Goal segnati: "+c1.goal);
			System.out.println("");
			do {
				partite += 1;
				c1.giocaPartita();
				if (c1.goal == Goal) {
					c1.aumentAbilità();
				}
			}while(!(partite == 3));
			if (c1.IsPalloneOro) {
				c1.cambiaSquadra("Barcellona");
				System.out.println("Hai vinto il pallone d'oro!!");
			}
			System.out.println("Goal dopo "+partite+" partite: "+c1.goal);
		}
	}


