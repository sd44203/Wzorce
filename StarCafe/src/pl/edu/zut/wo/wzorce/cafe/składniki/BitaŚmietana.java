package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;

public class BitaŚmietana extends SkładnikDekorator{
    Napój napój;
    public BitaŚmietana(Napój napój){
        this.napój = napój;
    }
    @Override
    public double koszt() {
        return napój.koszt() + 0.1;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + "z bita śmietana ";
    }
}
