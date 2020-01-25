package dnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Personaggio {
	public int livello;
	public String nome;
	public String classe;
	public String razza;
	public float hp;
	public int difesa;
	public float txc;
	public Arma arma;
	public Armatura armatura;
	public Dado d;
	public int forza;
	public int destrezza;
	public int costituzione;
	public int intelligenza;
	public int saggezza;
	public int carisma;
	public int modFOR;
	public int modDES;
	public int modCOS;
	public int modINT;
	public int modSAG;
	public int modCAR;
	public Oggetto inventario[];
	
	public Personaggio(String n) throws NumberFormatException, IOException {
		int d1;
		d = new Dado();
		nome = n;
		arma = new Arma();
		Classe();
		Razza();
		System.out.println("Arma: "+arma.nome+"\t\tElemento: "+arma.elemento);
		armatura = new Armatura();
		livello = d.lanciaDado(20);		
		d1 = d.lanciaDado(10);
		hp = ((d1 + modCOS) * livello);
		if (hp < 1) {
			hp = 1;
		}
		difesa = 10 + modDES + armatura.CA;
		for (int i = 0; i < 3; i++) {
			forza += d.lanciaDado(8);
			destrezza += d.lanciaDado(8);
			costituzione += d.lanciaDado(8);
			intelligenza += d.lanciaDado(8);
			saggezza += d.lanciaDado(8);
			carisma += d.lanciaDado(8);
		}
		modFOR = (int) Math.floor((forza - 10)/2);
		modDES = (int) Math.floor((destrezza - 10)/2);
		modCOS = (int) Math.floor((costituzione - 10)/2);
		modINT = (int) Math.floor((intelligenza - 10)/2);
		modSAG = (int) Math.floor((saggezza - 10)/2);
		modCAR = (int) Math.floor((carisma - 10)/2);
		
		inventario = new Oggetto[10+modFOR];
		int i = 1;
		switch (i) {
		case 1: inventario[i] = new Pozione();break;
		}
	}
	
	public void attacca(Personaggio dif,int b) throws IOException {
		int d2 = d.lanciaDado(20),c = 0;
		txc = d2 + livello + modFOR + arma.magia;
		System.out.println("\nAttacca "+nome+", danno "+arma.nome+": "+arma.dannoTOT);
		if (txc >=dif.difesa) {
			if (arma.tipo == 1) {
				dif.hp -=  arma.dannoTOT + modFOR;
				System.out.println("Attacco ad una mano riuscito! Hp "+dif.nome+": "+dif.hp);
				c++;
			}else {
				dif.hp -= arma.dannoTOT + modFOR * 1.5;	
				System.out.println("Attacco a due mani riuscito! Hp "+dif.nome+": "+dif.hp);
				c++;
			}
		}else {
			System.out.println("Ops attacco Missed!");
		}
		if (c == 1 && b == 0) {
			arma = new Arma();
			b++;
		}
	}
	
	public void Classe() throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.print("\nScegli la classe del personaggio:\n1. Barbaro\t2. Bardo\t3. Chierico\t4. Druido\n5. Guerriero\t6. Ladro\t7. Mago\t\t8. Paladino   ");
		int i = Integer.valueOf(tastiera.readLine()).intValue();
		switch (i) {
		case 1:
			classe = "Barbaro";
			break;
		case 2:
			classe = "Bardo";
			break;
		case 3:
			classe = "Chierico";
			break;
		case 4:
			classe = "Druido";
			break;
		case 5:
			classe = "Guerriero";
			break;
		case 6:
			classe = "Ladro";
			break;
		case 7:
			classe = "Mago";
			break;
		default:
			classe = "Paladino";
			break;
		}
	}
	
	public void Razza() throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.print("\nScegli la razza del personaggio:\n1. Umano\t2. Gnomo\t3. Nano\t\t4. Elfo\n5. Orco\t\t6. Mezz'orco\t7. Mezz'elfo\t8. Dragonide   ");
		int i = Integer.valueOf(tastiera.readLine()).intValue();
		switch (i) {
		case 1:
			razza = "Umano";
			break;
		case 2:
			razza = "Gnomo";
			break;
		case 3:
			razza = "Nano";
			break;
		case 4:
			razza = "Elfo";
			break;
		case 5:
			razza = "Orco";
			break;
		case 6:
			razza = "Mezz'orco";
			break;
		case 7:
			razza = "Mezz'elfo";
			break;
		default:
			razza = "Dragonide";
			break;
		}
		System.out.print("\nPersonagggio: "+nome+"\nClasse: "+classe+"\t\t");
		System.out.print("Razza: "+razza+"\n");
	}
	
}
