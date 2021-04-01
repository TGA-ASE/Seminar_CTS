package ro.ase.cts.builderV3;

public class Rezervare {
	
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	
	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public Rezervare(RezervareBuilder builder) {
	
		this.mancareInclusa = builder.mancareInclusa;
		this.scaunErgonomic = builder.scaunErgonomic;
		this.bauturaRacoritoare = builder.bauturaRacoritoare;
		this.muzicaAmbientala = builder.muzicaAmbientala;
		this.genMuzica = builder.genMuzica;
		this.codRezervare = builder.codRezervare;
	}
	
	


	public static class RezervareBuilder implements Builder{
		
		
		private boolean mancareInclusa;
		private boolean scaunErgonomic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;
		
	
		

		public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
			this.setMancareInclusa(mancareInclusa);
			return this;
		}




		public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
			this.setScaunErgonomic(scaunErgonomic);
			return this;
		}




		public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.setBauturaRacoritoare(bauturaRacoritoare);
			return this;
		}




		public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.setMuzicaAmbientala(muzicaAmbientala);
			return this;
		}




		public RezervareBuilder setGenMuzica(String genMuzica) {
			this.setGenMuzica(genMuzica);
			return this;

		}


		public RezervareBuilder setCodRezervare(int codRezervare) {
			this.setCodRezervare(codRezervare);
			return this;
		}




		@Override
		public Rezervare build() {
			// TODO Auto-generated method stub
	return new Rezervare(this);
		}
		
		
		
		
		
		
		
		
	}
		public static RezervareBuilder builder()
		{return new RezervareBuilder();}
}
