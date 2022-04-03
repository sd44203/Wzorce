package pl.edu.zut.wo.wzorce.symulator;

public class ModelKaczki extends Kaczka{
    public ModelKaczki() {
        latanieInterfejs = new LatamBoMamSkrzydla();
        kwakanieInterfejs = new Kwacz();
    }
    void ustawKwaczInt(KwakanieInterfejs kwakanie) {
        kwakanieInterfejs = kwakanie;
    }
    void ustawLecInt(LatanieInterfejs latanie) {
        latanieInterfejs = latanie;
    }


    public void wyświetl(){
        System.out.println("Modelowa kaczka");
    }
}
