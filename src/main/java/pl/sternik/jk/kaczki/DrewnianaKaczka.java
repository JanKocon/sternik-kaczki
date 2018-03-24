package pl.sternik.jk.kaczki;

import pl.sternik.jk.kaczki.kwakanie.Niemowa;
import pl.sternik.jk.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {

	public DrewnianaKaczka(String nazwa) {
		super(nazwa, new Nielot(), new Niemowa());
	}
}
