package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;

public class Czekolada extends SkładnikDekorator{
    Napój napój;
    public Czekolada(Napój napój){
        this.napój = napój;
    }
    @Override
    public double koszt() {
        return napój.koszt() + 0.2;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + " z czekoladą ";
    }
}
