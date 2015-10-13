package test;
//import test.paczka;

public class start {

	public static void main(String[] args) {
		System.out.println("Lecimy z testem");
		
		paczka paczka1 = new paczka(20, 10, 15, 5);
		
		//paczka1.dlugosc = 20;
		//paczka1.szerokosc = 10;
		//paczka1.wysokosc = 15;
		//paczka1.waga = 5;
		
		int objetosc = paczka1.objetosc();
		
		System.out.println("objetosc paczki wynosi " + objetosc);

		
		

	}

}
