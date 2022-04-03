package pl.edu.zut.wo.wzorce.pogodynka.wyświetl;

import pl.edu.zut.wo.wzorce.pogodynka.Obserwator;
import pl.edu.zut.wo.wzorce.pogodynka.WyswietlElement;

public class StatystykaWyświetlanie implements Obserwator, WyswietlElement {

	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;

	public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotnosc;
		this.cisnienie = cisnienie;
		wyswietl();
	}
	
	public void wyswietl() {
		System.out.println("Statystyka " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotność");
	}

}