package dnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arma {
	public String nome;
	public int DannoBase;
	public int magia;
	public String elemento;
	public int tipo;
	public float dannoTOT;
	public Dado d;
	
	public Arma(String n) throws IOException {
		nome = n;
	}
	
	public Arma() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		d = new Dado();
		System.out.print("Arma: ");
		nome = tastiera.readLine();
		DannoBase = d.lanciaDado(8);
		magia = (int) (Math.random()*6);
		tipo = d.lanciaDado(8);
		Elemento();
		DannoArma();
	}

	public void Elemento() {
		int da = d.lanciaDado(6);
		switch (da) {
		case 1:
			elemento = "Fuoco";
			break;
		case 2:
			elemento = "Acqua";
			break;
		case 3:
			elemento = "Elettro";
			break;
		case 4:
			elemento = "Aria";
			break;
		case 5:
			elemento = "Terra";
			break;
		default:
			elemento = null;
			break;
		}
	}
	
	public void DannoArma() {
		if (elemento == null) {
			dannoTOT = DannoBase + magia;
		}else {
			int dannoElementale = d.lanciaDado(6);
			dannoTOT = DannoBase + magia + dannoElementale ;
		}
	}
	
}
