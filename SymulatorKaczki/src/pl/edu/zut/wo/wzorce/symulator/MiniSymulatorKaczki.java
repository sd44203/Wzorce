package pl.edu.zut.wo.wzorce.symulator;

public class MiniSymulatorKaczki {

	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.wyświetl();
		dzika.wykonajKwacz();
		dzika.wykonajLec();

		System.out.println();

		Kaczka gumowa = new GumowaKaczka();
		gumowa.wyświetl();
		gumowa.wykonajKwacz();
		gumowa.wykonajLec();

		System.out.println();

		Kaczka płaskonosa = new PłaskonosKaczka();
		płaskonosa.wyświetl();
		płaskonosa.wykonajKwacz();
		płaskonosa.wykonajLec();

		System.out.println();

		Kaczka wabik = new WabikKaczka();
		wabik.wyświetl();
		wabik.wykonajKwacz();
		wabik.wykonajLec();

		System.out.println();

		ModelKaczki model = new ModelKaczki();
		model.wyświetl();
		model.ustawLecInt(new LotZNapedemRakietowym());
		model.ustawKwaczInt(new Piszcz());
		model.wykonajLec();
		model.wykonajKwacz();
	}
}
