package pl.edu.zut.wo.wzorce.symulator;




public class Kaczka {
    public LatanieInterfejs latanieInterfejs;
    public KwakanieInterfejs kwakanieInterfejs;

    void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }
    void wykonajLec() {
        latanieInterfejs.leć();
    }

    void pływaj() {
    	System.out.println("Pływam jak kaczka.");
    }
    void wyświetl() {
    	System.out.println("Wyglądam jak kaczka.");
    }
}
