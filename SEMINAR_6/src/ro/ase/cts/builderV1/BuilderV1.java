package ro.ase.cts.builderV1;

public class BuilderV1 implements IBuilder{
	private Rezervare rezervare;
	
	public BuilderV1() {
		rezervare = new Rezervare(false, false, false, false, "gen", 1);
	}
	public BuilderV1(int cod) {
		rezervare = new Rezervare(false, false, false, false, "gen", cod);
	}
	
	public BuilderV1 setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}

	public BuilderV1 setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public BuilderV1 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}

	public BuilderV1 setMuzicaAmbietala(boolean muzicaAmbietala) {
		rezervare.setMuzicaAmbientala(muzicaAmbietala);
		return this;
	}

	public BuilderV1 setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public BuilderV1 setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
}