package pl.edu.zut.wo.wzorce.pogodynka;

import java.io.BufferedWriter;
import java.util.ArrayList;

import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.PrognozaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.StatystykaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.WarunkiBieżąceWyświetlanie;

public class DanePogodowe implements Podmiot{
	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;

	private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
	private PrognozaWyświetlanie prognozaWyswietl = new PrognozaWyświetlanie();
	private WarunkiBieżąceWyświetlanie warunkiBiezaceWyswietl = new WarunkiBieżąceWyświetlanie();
	private StatystykaWyświetlanie statystykaWyswietl = new StatystykaWyświetlanie();

	public void odczytyZmiana(){
//		float temp = pobierzTemperaturę();
//		float wilgotnosc = pobierzWilgotność();
//		float cisnienie = pobierzCiśnienie();
//		warunkiBiezaceWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
//		statystykaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
//		prognozaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
		powiadomObserwatorow();
	}

	private float pobierzTemperaturę(){
		return temperatura;
	}

	private float pobierzWilgotność(){
		return wilgotnosc;
	}

	private float pobierzCiśnienie(){
		return cisnienie;
	}
	
	public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotnosc;
		this.cisnienie = cisnienie;
		odczytyZmiana();
	}

	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	}

	@Override
	public void usunObserwatora(Obserwator o) {
		obserwatorzy.remove(o);
	}

	@Override
	public void powiadomObserwatorow() {
		for (Obserwator obs : obserwatorzy) {
			obs.aktualizacja(temperatura, wilgotnosc, cisnienie);
		}
	}
}
