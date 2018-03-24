package pl.sternik.jk.kaczki;

import pl.sternik.jk.kaczki.kwakanie.Niemowa;
import pl.sternik.jk.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {

	public MandarynkaKaczka(String nazwa) {
		super(nazwa, new Latajaca(), new Niemowa());
	}
}
