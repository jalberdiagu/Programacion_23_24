package jarduera3_4;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainAlimentos {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		File fitxategia = new File ("C:\\Users\\1AW3-1\\Downloads\\alimentos.txt");
		FileReader fr = new FileReader (fitxategia);
		BufferedReader br = new BufferedReader (fr);
		String lerroa = br.readLine();
		
		ArrayList <Alimentos> alimentosList =  new ArrayList <Alimentos>();
		
		String[] zatiak;
		
		while (lerroa != null) {
			Alimentos alimento = new Alimentos();
			zatiak = lerroa.split(";");
			alimento.setIzena(zatiak[0]);
			alimento.setEgoera(zatiak[1]);
			alimento.setKaloriak(Double.parseDouble(zatiak[2]));
			alimento.setKoipeak(Double.parseDouble(zatiak[3]));
			alimento.setProteinak(Double.parseDouble(zatiak[4]));
			alimento.setKarbohidratoak(Double.parseDouble(zatiak[5]));
			alimento.setMota(zatiak[6]);
			alimentosList.add(alimento);
			lerroa = br.readLine();
			
		}
		
		System.out.println("************************** MENUA ***********************");
		System.out.println("*                 1. Elikagaien Bilatzailea.           *");
		System.out.println("*                 2. Elikagaiak erakutsi.              *");
		System.out.println("*                 3. Kaloriak kalkulatu                *");
		System.out.println("********************************************************");
		System.out.println("Aukeratu menuko aukera bat (1/2/3):");
		
		Scanner teklatua = new Scanner (System.in);
		int aukera = teklatua.nextInt();
		
		switch (aukera) {
		
		case 1:
			elikagaienBilatzailea (alimentosList);
			break;
			
		case 2:
			elikagaiakErakutsi (alimentosList);
			break;
			
		case 3:
			kaloriakErakutsi (alimentosList);
			break;
			
		default :
			System.out.println("Idatzi baliozko karaktere bat:");
			break;
		
		}	
		
	}
	
	private static void elikagaienBilatzailea (ArrayList <Alimentos> alimentosList) {
		
		System.out.println ("Idatzi elikagai baten izena eta array-ean gordeta badago bere nutrizio datuak erakutsiko dizkizut:");
		
		Scanner teklatua = new Scanner (System.in);
		String idatzitakoIzena = teklatua.nextLine();
		int kont = 0;
		
		for (int i = 0; i < alimentosList.size(); i++) {
			if (alimentosList.get(i).getIzena().equalsIgnoreCase(idatzitakoIzena)) {
				System.out.println("Idatzi duzun elikagaiaren nutrizio datuak hauek dira: ");
				System.out.println(alimentosList.get(i).toString());
				kont ++;
			}
			
			if (kont == 0) {
				System.out.println("Idatzi duzun elikagaia ez dago array-ean gordeta!");
			}
		}
	}
	
	
	private static void elikagaiakErakutsi (ArrayList <Alimentos> alimentosList) {
		                                                                            
		Scanner teklatua = new Scanner (System.in);
		System.out.println("Idatzi erakutsi nahi duzun elikagaiaren kokapena:");
		int elikagaiarenKokapena = teklatua.nextInt();
		
		System.out.println("Idatzi erakutsi nahi duzun erregistro kopurua:");
		int erregistroKopurua = teklatua.nextInt();
		int kont = 0;
		
		for (int i = 0; i < alimentosList.size(); i ++) {
			System.out.println(alimentosList.get(elikagaiarenKokapena).toString());

		}
		
		
	}
	
	private static void kaloriakErakutsi (ArrayList <Alimentos> alimentosList) {
		
		Scanner teklatua = new Scanner (System.in);
		System.out.println("Idatzi elikagai baten izena:");
		String idatzitakoIzena = teklatua.next();
		int kont = 0;
		
		for (int i = 0; i < alimentosList.size(); i++) {
			if (alimentosList.get(i).getIzena().equalsIgnoreCase(idatzitakoIzena)) {
			System.out.println("Idatzitako elikagaiaren kaloriak hauek dira: " + alimentosList.get(i).getKaloriak());			
			kont ++;
			}
			
		}
		
		if (kont == 0) {
			System.out.println("Idatzi baliozko izen bat!");
		}
		
	}
	
	private static void gordeAldaketak (ArrayList <Alimentos> alimentosList) throws IOException {
		
		File fitxategia = new File ("C:\\Users\\1AW3-1\\Downloads\\alimentos.txt");
		FileWriter fw = new FileWriter (fitxategia);
		BufferedWriter bw = new BufferedWriter (fw);
		
		for (int i = 0; i < alimentosList.size(); i++) {
			bw.write(alimentosList.get(i).getIzena() + ";" + alimentosList.get(i).getEgoera() + ";" + alimentosList.get(i).getKaloriak() + ";" + alimentosList.get(i).getKoipeak() + ";" + alimentosList.get(i).getKoipeak() + ";" + alimentosList.get(i).getProteinak() + ";" + alimentosList.get(i).getKarbohidratoak() + ";" + alimentosList.get(i).getMota() + "\n");
		   
			}
		
	}
	
	
}