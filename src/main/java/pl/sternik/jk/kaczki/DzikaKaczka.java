package pl.sternik.jk.kaczki;

import pl.sternik.jk.kaczki.kwakanie.Kwaczka;
import pl.sternik.jk.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {

	public DzikaKaczka(String nazwa) {
		super(nazwa, new Latajaca(), new Kwaczka());	
	}

}
