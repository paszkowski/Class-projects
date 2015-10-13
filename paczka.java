package test;

public class paczka {

	int dlugosc;
	int szerokosc;
	int wysokosc;
	int waga;
	
	int objetosc() {
		return dlugosc * szerokosc * wysokosc;
	}
	
	
	paczka() {};
	
	paczka(int dlugosc, int szerokosc, int wysokosc, int waga) {
		
		this.dlugosc = dlugosc;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.waga = waga;
		
	}
	
}
