package pl.edu.zut.wo.wzorce.symulator;

public class WabikKaczka extends Kaczka {
    public WabikKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new NieKwacz();
    }
    public void wyświetl(){
        System.out.println("Wygląda jak wabik");
    }
}
