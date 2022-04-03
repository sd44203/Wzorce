package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.IndeksCiepłaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.PrognozaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.StatystykaWyświetlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyświetl.WarunkiBieżąceWyświetlanie;

public class StacjaMeteo {

	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();
		danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
		danePogodowe.ustawOdczyty(27.7f, 70, 997.0f);
		danePogodowe.ustawOdczyty(25.5f, 90, 997.0f);


		Obserwator obserwatorBW = new WarunkiBieżąceWyświetlanie();
		Obserwator obserwatorW = new StatystykaWyświetlanie();
		Obserwator obserwatorP = new PrognozaWyświetlanie();
		Obserwator obserwatorI = new IndeksCiepłaWyświetlanie();

		danePogodowe.zarejestrujObserwatora(obserwatorBW);
		danePogodowe.zarejestrujObserwatora(obserwatorP);
		danePogodowe.zarejestrujObserwatora(obserwatorW);
		danePogodowe.zarejestrujObserwatora(obserwatorI);

		danePogodowe.powiadomObserwatorow();
		System.out.println();

		danePogodowe.ustawOdczyty(30.2f, 99, 1000.5f);
		danePogodowe.usunObserwatora(obserwatorP);
		System.out.println();

		danePogodowe.ustawOdczyty(24.2f, 87, 1005.8f);
		danePogodowe.usunObserwatora(obserwatorW);
		System.out.println();

		danePogodowe.ustawOdczyty(21.2f, 60, 1001.3f);
		System.out.println();
	}
	
}