package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;

public class MleczkoSojowe extends SkładnikDekorator{
    Napój napój;
    public MleczkoSojowe(Napój napój){
        this.napój = napój;
    }
    @Override
    public double koszt() {
        return napój.koszt() + 0.15;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + "z mleczkiem sojowym";
    }
}
