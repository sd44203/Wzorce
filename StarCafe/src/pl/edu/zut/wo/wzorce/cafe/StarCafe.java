package pl.edu.zut.wo.wzorce.cafe;

import pl.edu.zut.wo.wzorce.cafe.napoje.MocnoPalona;
import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;
import pl.edu.zut.wo.wzorce.cafe.składniki.BitaŚmietana;
import pl.edu.zut.wo.wzorce.cafe.składniki.Czekolada;
import pl.edu.zut.wo.wzorce.cafe.składniki.MleczkoSojowe;
import pl.edu.zut.wo.wzorce.cafe.składniki.Mleko;

public class StarCafe {
	public static void main(String... params) {
//		MocnoPalona napój = new MocnoPalona();
//		System.out.println(napój.pobierzOpis() + " " + napój.koszt() + "zł");
		Napój napój = new BitaŚmietana(new Czekolada(new MocnoPalona()));
		System.out.println(napój.pobierzOpis() + " " + napój.koszt() + "zł");
	}
}
