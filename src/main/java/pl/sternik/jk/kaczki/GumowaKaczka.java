package pl.sternik.jk.kaczki;

import pl.sternik.jk.kaczki.kwakanie.Piskajaca;
import pl.sternik.jk.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

	public GumowaKaczka(String nazwa) {
		super(nazwa, new Nielot(), new Piskajaca());
	}
}
