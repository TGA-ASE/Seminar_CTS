package ro.ase.cts.builder2;

public class BuilderV2 implements IBuilder{

	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV2()
	{this.mancareInclusa=false;
	this.scaunErgonomic=false;
	this.bauturaRacoritoare=false;
	this.muzicaAmbientala=false;
	this.genMuzica="nespecificat";
	this.codRezervare=0;
	}
	
	public BuilderV2(int cod)
	{this.mancareInclusa=false;
	this.scaunErgonomic=false;
	this.bauturaRacoritoare=false;
	this.muzicaAmbientala=false;
	this.genMuzica="nespecificat";
	this.codRezervare=cod;
	}
	
	public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}



	public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;return this;
	}



	public BuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;return this;
	}



	public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;return this;
	}



	public BuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;return this;
	}



	public BuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;return this;
	}



	@Override
	public Rezervare build() {
	Rezervare rezervare=new Rezervare( mancareInclusa,  scaunErgonomic, bauturaRacoritoare,
			 muzicaAmbientala,  genMuzica,  codRezervare);
	return rezervare;
	}
}