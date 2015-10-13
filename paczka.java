package test;

public class paczka {

	int dlugosc;
	int szerokosc;
	int wysokosc;
	int waga;
	
	int objetosc() {
		return dlugosc * szerokosc * wysokosc;
	}
	
	int polePodstawy() {
		
		return getDlugosc() * getSzerokosc();
	}
	
	
	paczka() {};
	
	paczka(int dlugosc, int szerokosc, int wysokosc, int waga) {
		
		this.dlugosc = dlugosc;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.waga = waga;
		
	}
	
		public int getDlugosc() {
		return dlugosc;
	}


	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}


	public int getSzerokosc() {
		return szerokosc;
	}


	public void setSzerokosc(int szerokosc) {
		this.szerokosc = szerokosc;
	}


	public int getWysokosc() {
		return wysokosc;
	}


	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}


	public int getWaga() {
		return waga;
	}


	public void setWaga(int waga) {
		this.waga = waga;
	}
	
}
