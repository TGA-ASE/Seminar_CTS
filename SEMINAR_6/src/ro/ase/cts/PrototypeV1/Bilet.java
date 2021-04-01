package ro.ase.cts.PrototypeV1;

public class Bilet implements AbstractPrototype{
private int cod;
private String echipaA;
private String echipaB;
private String data;





public void setCod(int cod) {
	this.cod = cod;
}

//+Validari
public Bilet(int cod, String echipaA, String echipaB, String data) {
	super();
	this.cod = cod;
	this.echipaA = echipaA;
	this.echipaB = echipaB;
	this.data = data;
}

private Bilet() {
	super();
	this.cod = cod;
	this.echipaA = echipaA;
	this.echipaB = echipaB;
	this.data = data;
}

@Override
public String toString() {
	return "Bilet [cod=" + cod + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", data=" + data + "]";
}

@Override
public AbstractPrototype copiaza() {
	// TODO Auto-generated method stub
Bilet bilet=new Bilet();
bilet.setCod(this.cod);
bilet.data=this.data;
bilet.echipaA=this.echipaA;
bilet.echipaB=this.echipaB;

return bilet;
}



}
