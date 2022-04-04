package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.składniki.*;

public interface FabrykaSkładnikówPizzy {
	public Ciasto utwórzCiasto();

	public Sos utwórzSos();

	public Ser utwórzSer();

	public Warzywa[] utwórzWarzywa();

	public Pepperoni utwórzPepperoni();

	public Małże utwórzMałże();

	public Zioła utwórzZioła();
}