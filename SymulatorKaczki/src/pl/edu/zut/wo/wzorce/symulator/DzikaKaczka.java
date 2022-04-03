package pl.edu.zut.wo.wzorce.symulator;

public class DzikaKaczka extends Kaczka {
	public DzikaKaczka() {
		latanieInterfejs = new LatamBoMamSkrzydla();
		kwakanieInterfejs = new Kwacz();
	}

	public void wyświetl(){
		System.out.println("Wygląda jak dzika kaczka");
	}
}