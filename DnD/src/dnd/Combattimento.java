package dnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combattimento {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int b = 0,c = 0;
		System.out.print("Benvenuto in DnD!!\nNome personaggio: ");
		String n = tastiera.readLine();
		Personaggio p1 = new Personaggio(n);
		System.out.print("\nLivello: "+p1.livello+"\tHp: "+p1.hp+"\nDifesa: "+p1.difesa+"\tForza: "+p1.forza);
		System.out.print("\n\nNome nemico: ");
		String n2 = tastiera.readLine();
		Personaggio p2 = new Personaggio(n2);
		System.out.print("\nLivello: "+p2.livello+"\tHp: "+p2.hp+"\nDIFESA: "+p2.difesa+"\tForza: "+p2.forza);
		int t = 0;
		do {
			java.util.concurrent.TimeUnit.SECONDS.sleep(4);
			t++;
			System.out.print("\n\nTurno "+t);
			p1.attacca(p2,b);
			if (p1.hp <= 0) {
			}else {
				p2.attacca(p1,c);
			}
		}while (!(p2.hp <= 0 || p1.hp <= 0));
		if (p1.hp <= 0) {
			System.out.print("\n\nVITTORIA "+p2.nome);
		}else {
			if (p2.hp <= 0) {
				System.out.print("\n\nVITTORIA "+p1.nome);
			}
		}
	}
}
