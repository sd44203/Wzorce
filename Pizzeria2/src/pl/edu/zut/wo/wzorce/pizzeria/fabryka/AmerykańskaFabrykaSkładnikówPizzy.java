package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.składniki.*;

public class AmerykańskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {
	public Ciasto utwórzCiasto() {
		return new GrubeChrupkieCiasto();
	}

	public Sos utwórzSos() {
		return new SosPomidorowy();
	}

	public Ser utwórzSer() {
		return new SerMozzarella();
	}

	public Warzywa[] utwórzWarzywa() {
		Warzywa warzywa[] = { new CzarneOliwki(), new Bakłażan(), new Szpinak() };
		return warzywa;
	}
	public Zioła utwórzZioła() {
		return new Oregano();
	}
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	public Małże utwórzMałże() {
		return new MrożoneMałże();
	}
}